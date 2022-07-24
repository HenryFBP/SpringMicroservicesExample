package net.henrypost.customer.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.henrypost.customer.service.CustomerService;
import net.henrypost.customer.model.jpa.Customer;
import net.henrypost.customer.model.rest.CustomerRegistrationRequest;
import net.henrypost.customer.model.rest.CustomerRegistrationResponse;
import net.henrypost.customer.util.EmailValidator;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/customer/")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/")
    public String index() {
        return "Welcome to %s index".formatted(this.getClass().getSimpleName());
    }

    @PostMapping("/registerCustomer")
    public CustomerRegistrationResponse registerCustomer(
            @RequestBody CustomerRegistrationRequest customerRegistrationRequest) {


        if (this.customerService.isEmailTaken(customerRegistrationRequest.email())) {
            return CustomerRegistrationResponse
                    .builder()
                    .message("Error: Email %s is taken.".formatted(customerRegistrationRequest.email()))
                    .code(400)
                    .build();
        }

        if (EmailValidator.isEmailInvalid(customerRegistrationRequest.email())) {
            return CustomerRegistrationResponse
                    .builder()
                    .message("Error: Email %s is invalid.".formatted(customerRegistrationRequest.email()))
                    .code(400)
                    .build();
        }

        Customer c = this.customerService.registerCustomer(customerRegistrationRequest);

        CustomerController.log.info("new customer registered {}", customerRegistrationRequest);

        return CustomerRegistrationResponse
                .builder()
                .customer(c)
                .code(200)
                .build();

    }
}
