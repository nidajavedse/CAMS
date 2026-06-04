package cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import repository.AccountRepository;
import repository.CustomerRepository;
import service.AccountService;
import util.DataLoader;

public class MainApp {
    public static void main(String[] args) throws Exception {

        AccountRepository accountRepo = new AccountRepository();
        CustomerRepository customerRepo = new CustomerRepository();

        DataLoader.load(accountRepo, customerRepo);

        AccountService service = new AccountService(accountRepo);

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        System.out.println("\nALL ACCOUNTS (Sorted by Balance DESC):");
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(service.getAllSortedByBalanceDesc()));

        System.out.println("\nLIQUIDITY POSITION:");
        System.out.println(service.getLiquidityPosition());

        System.out.println("\nPLATINUM ACCOUNTS:");
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(service.getPlatinumAccounts()));
    }
}
