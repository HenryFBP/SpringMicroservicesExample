package net.henrypost.customer.model.jpa;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Merchandise {
    @Id
    @Column(name = "id", nullable = false)
    Long id;

    String name;
    String description;
    double cost;

}
