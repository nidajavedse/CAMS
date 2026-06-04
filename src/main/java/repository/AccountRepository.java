package repository;

import domain.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts = new ArrayList<>();

    public void saveAll(List<Account> list) {
        accounts.addAll(list);
    }

    public List<Account> findAll() {
        return accounts;
    }
}
