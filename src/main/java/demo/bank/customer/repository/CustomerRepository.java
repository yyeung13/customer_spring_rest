package demo.bank.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.bank.customer.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

  @Query("SELECT t FROM Customer c where c.name = ?1 AND c.ic = ?2 AND c.bank = ?3")
	public Optional<Todo> findByNameAndICAndBank(String name, String ic, String bank);
}
