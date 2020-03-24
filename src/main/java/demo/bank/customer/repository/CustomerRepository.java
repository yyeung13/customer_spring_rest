package demo.bank.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.bank.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
