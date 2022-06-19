package net.henrypost.customer.model.jpa;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class CustomerPurchasedMerchandise {
    @Id
    @Column(name = "id", nullable = false)
    Long id;

    LocalDateTime timePurchased;

    @OneToOne
    Customer customerWhoPurchased;

    @OneToOne
    Merchandise merchandiseBought;


}
