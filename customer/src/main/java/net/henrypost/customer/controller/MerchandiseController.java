package net.henrypost.customer.controller;

import lombok.extern.slf4j.Slf4j;
import net.henrypost.customer.model.jpa.Merchandise;
import net.henrypost.customer.model.rest.MerchandiseResponse;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MerchandiseController {

    public MerchandiseResponse getMerchandiseByName(String name){

            return MerchandiseResponse.builder().build();
    }

}
