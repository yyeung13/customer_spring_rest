package demo.bank.customer.controller;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.bank.customer.exception.RecordNotFoundException;
import demo.bank.customer.demo.model.Employee;
import demo.bank.customer.demo.repository.CustomerRepository;

@RestController
@RequestMapping(value = "/customer", produces = { MediaType.APPLICATION_JSON_VALUE })
@Validated
public class CustomerRESTController {
	@Autowired
	private CustomerRepository repository;

	public CustomerRepository getRepository() {
		return repository;
	}

	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	
	@GetMapping("/getCustomer/{name}/{ic}/{bank}")
	Customer getCustomerByNameAndICAndBank(@PathVariable String name, @PathVariable String ic, @PathVariable String bank)
	{
	    return repository.findByNameAndICAndBank(name, ic, bank)
	            .orElseThrow(() -> new RecordNotFoundException("Customer name '" + name + "' does no exist"));
	}

	
}
