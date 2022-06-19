package net.henrypost.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean
    @LoadBalanced //this allows us to use eureka hostnames :)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
