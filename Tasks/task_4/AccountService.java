package task_4;

import java.util.Arrays;
import java.util.List;

interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It counts the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}


class AccountServiceImpl implements AccountService {

    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts) {
            if (account.getOwner().getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account account : accounts) {
            if (account.getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}


class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}


class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


class Main {

    public static void main(String[] args) {
        AccountService service = getAccountService();

        // Specific ID Search
        System.out.println("Specific ID Search Implementation:\n");
        long specificIdToSearch = 11L;
        System.out.println("Searching for account with owner ID: " + specificIdToSearch);
        Account foundAccount = service.findAccountByOwnerId(specificIdToSearch);

        if (foundAccount != null) {
            System.out.println("Found Account with owner ID " + specificIdToSearch + ": Balance = " + foundAccount.getBalance());
        }
        else {
            System.out.println("No account found with owner ID " + specificIdToSearch);
        }
        System.out.println();


        // Multiple IDs Search
        System.out.println("\nMultiple IDs Search Implementation:\n");
        List<Long> ownerIdsToSearch = Arrays.asList(15L, 16L, 17L, 18L, 19L);
        for (Long ownerId : ownerIdsToSearch) {
            System.out.println("Searching for account with owner ID: " + ownerId);
            Account account = service.findAccountByOwnerId(ownerId);

            if (account != null) {
                System.out.println("Found Account with owner ID " + ownerId + ": Balance = " + account.getBalance());
                System.out.println();
            } else {
                System.out.println("No account found with owner ID " + ownerId);
                System.out.println();
            }
        }
        System.out.println();

        long balanceThreshold = 4000L;
        long count = service.countAccountsWithBalanceGreaterThan(balanceThreshold);
        System.out.println("Accounts With Greater Balance:\n");
        System.out.println("Number of accounts with balance greater than " + balanceThreshold + ": " + count);
        System.out.println();
    }

    private static AccountService getAccountService() {
        User user1 = new User(15L, "Mark", "King");
        User user2 = new User(16L, "John", "Smith");
        User user3 = new User(17L, "Alice", "Johnson");
        User user4 = new User(18L, "Bob", "Brown");

        Account account1 = new Account(1L, 5000L, user1);
        Account account2 = new Account(2L, 8000L, user2);
        Account account3 = new Account(3L, 12000L, user3);
        Account account4 = new Account(4L, 15000L, user4);

        Account[] accounts = {account1, account2, account3, account4};

        AccountService service = new AccountServiceImpl(accounts);
        return service;
    }
}