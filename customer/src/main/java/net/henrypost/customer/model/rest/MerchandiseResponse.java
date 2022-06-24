package net.henrypost.customer.model.rest;

import lombok.Builder;
import net.henrypost.customer.model.jpa.Merchandise;

import java.util.List;

@Builder
public record MerchandiseResponse(
        List<Merchandise> merchandiseList,
        String message
) {
}
