package net.henrypost.customer.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.henrypost.customer.service.CustomerService;
import net.henrypost.customer.model.rest.WelcomeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
@AllArgsConstructor
public class WelcomeController {

    private final CustomerService customerService;

    @GetMapping("/")
    public WelcomeResponse welcome() {


        return WelcomeResponse
                .builder()
                .customerList(this
                        .customerService
                        .getAllCustomers())
                .someMessage("wahoo, welcome to CustomerApp. try /api/v1/customer/")
                .build();

    }
}
