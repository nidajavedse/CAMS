package util;
import domain.Account;
import domain.Customer;
import repository.AccountRepository;
import repository.CustomerRepository;

import java.time.LocalDate;
import java.util.List;

public class DataLoader {

    public static void load(AccountRepository accRepo, CustomerRepository custRepo) {

        Customer c1 = new Customer(1, "Bob", "Jones");
        Customer c2 = new Customer(2, "Anna", "Smith");
        Customer c3 = new Customer(3, "Carlos", "Jimenez");

        Account a1 = new Account(1, "AC1002", "Checking",
                LocalDate.of(2016,5,17), 155900.50, 1);

        Account a2 = new Account(2, "AS1001", "Savings",
                LocalDate.of(2021,6,2), 12500.95, 1);

        Account a3 = new Account(3, "AS1003", "Savings",
                LocalDate.of(2016,7,11), 75000.00, 3);

        Account a4 = new Account(4, "AC1004", "Checking",
                LocalDate.of(2024,3,29), 11700.99, 2);

        accRepo.saveAll(List.of(a1, a2, a3, a4));
        custRepo.saveAll(List.of(c1, c2, c3));
    }
}