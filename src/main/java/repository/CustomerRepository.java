package repository;

import domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    public void saveAll(List<Customer> list) {
        customers.addAll(list);
    }

    public List<Customer> findAll() {
        return customers;
    }
}