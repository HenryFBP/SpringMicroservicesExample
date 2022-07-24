package net.henrypost.customer.model.rest;

import lombok.Builder;
import net.henrypost.customer.model.jpa.Customer;

import java.util.HashMap;
import java.util.List;

@Builder
public record WelcomeResponse(
        List<Customer> customerList,
        String someMessage,
        HashMap<String, String> someHashMap
) {

}
