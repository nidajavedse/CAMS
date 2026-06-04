package service;

import domain.Account;
import repository.AccountRepository;

import java.util.List;
import java.util.stream.Collectors;

    public class AccountService {

        private AccountRepository repo;

        public AccountService(AccountRepository repo) {
            this.repo = repo;
        }

        public List<Account> getAllSortedByBalanceDesc() {
            return repo.findAll()
                    .stream()
                    .sorted((a1, a2) -> Double.compare(a2.getBalance(), a1.getBalance()))
                    .collect(Collectors.toList());
        }

        public List<Account> getPlatinumAccounts() {
            return repo.findAll().stream()
                    .filter(this::isPlatinum)
                    .collect(Collectors.toList());
        }

        public boolean isPlatinum(Account a) {
            long years = java.time.temporal.ChronoUnit.YEARS
                    .between(a.getDateOpened(), java.time.LocalDate.now());

            return years >= 10 && a.getBalance() >= 100000;
        }

        public double getLiquidityPosition() {
            return repo.findAll().stream()
                    .mapToDouble(Account::getBalance)
                    .sum();
        }
    }
