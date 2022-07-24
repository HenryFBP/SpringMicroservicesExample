package net.henrypost.customer.repository;

import net.henrypost.customer.model.jpa.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT cust FROM Customer cust WHERE cust.email = :email")
    List<Customer> findCustomerByEmail(@Param("email") String email);
}
