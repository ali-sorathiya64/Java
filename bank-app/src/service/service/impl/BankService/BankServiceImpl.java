package service.service.impl.BankService;

import domain.Account;
import domain.Customer;
import domain.Transaction;
import domain.Type;
import exceptions.AccountNotFoundException;
import exceptions.InsufficientAmountException;
import exceptions.ValidationException;
import repository.AccountRepository;
import repository.CustomerRepository;
import repository.TransactionRepository;
import service.BankService;
import util.Validation;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BankServiceImpl implements BankService {

    private  final AccountRepository accountRepository = new AccountRepository();
   
    private  final TransactionRepository transactionRepository = new TransactionRepository();
   private final CustomerRepository customerRepository = new CustomerRepository();

private final Validation <String> validation =validateName ->{
    if (validateName == null || validateName.isBlank()) throw new ValidationException("Enter an valid name as per accounts");
};

    @Override
    public String openAccount(String name ,String email, String accountType) {
       String customerId = UUID.randomUUID().toString();
       Customer c = new Customer(email ,customerId,name);
       customerRepository.save(c);

       // CHANGE LATER --->10 + 1  AC11  Kind of
//       String accountNumber = UUID.randomUUID().toString();


        String accountNumber = getAccountNumber();

        Account account = new Account(accountNumber,accountType,(double)0,customerId);
       // Save
        accountRepository.save(account);

       return accountNumber;
    }

    @Override
    public List<Account> listAccount() {
        return accountRepository.findAll().stream()
                .sorted(Comparator.comparing(acc ->
                        acc.getAccountType() != null ? acc.getAccountType() : ""))
                .collect(Collectors.toList());
    }

    @Override
    public void deposit(String accountNumber, Double amount, String note) {

        Account account = accountRepository.findNumber(accountNumber).orElseThrow(()-> new RuntimeException("Account not found : " +
                accountNumber));
        account.setBalance(account.getBalance() + amount);
        Transaction transaction = new Transaction(account.getAccountNumber(),amount ,
                UUID.randomUUID().toString(),note , LocalDateTime.now() , Type.DEPOSIT);
        transactionRepository.add(transaction);

    }

    @Override
    public void withdraw(String accountNumber, Double amount, String note) {

        Account account = accountRepository.findNumber(accountNumber).orElseThrow(()-> new RuntimeException("Account not found : " +
                accountNumber));
        if (account.getBalance().compareTo(amount) < 0)
            throw new InsufficientAmountException("Insufficient balance");

        account.setBalance(account.getBalance() - amount);
        Transaction transaction = new Transaction(account.getAccountNumber(),amount ,
                UUID.randomUUID().toString(),note , LocalDateTime.now() , Type.WITHDRAW);
        transactionRepository.add(transaction);

    }

    @Override
    public void transfer(String fromAcc, String toAcc, Double amount, String note) {

        if (fromAcc.equals(toAcc)) throw  new RuntimeException("Cannot Transfer your own account");

        Account from = accountRepository.findNumber(fromAcc).orElseThrow(()
                ->new AccountNotFoundException("Account not found :" + fromAcc));
        Account to= accountRepository.findNumber(toAcc).orElseThrow(()
                ->new AccountNotFoundException("Account not found :" + toAcc));

        if (from.getBalance().compareTo(amount) < 0)
            throw new InsufficientAmountException("Insufficient balance");

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        transactionRepository.add( new Transaction(from.getAccountNumber(),amount ,
                UUID.randomUUID().toString(),note , LocalDateTime.now() , Type.TRANSFER_OUT));

        transactionRepository.add( new Transaction(to.getAccountNumber(),amount ,
                UUID.randomUUID().toString(),note , LocalDateTime.now() , Type.TRANSFER_IN));


    }

    @Override
    public List<Transaction> getStatement(String account) {
        return transactionRepository.findByAccount(account).stream()
                .sorted(Comparator.comparing(Transaction::getTimeStamps))
                .collect(Collectors.toList());
    }

    @Override
    public List<Account> searchAccountsByCustomer(String q) {

        String query = (q == null) ? "" : q.toLowerCase();
        List<Account> result = new ArrayList<>();
        for (Customer c : customerRepository.findAll()) {
          if (c.getName().toLowerCase().contains(query))
              result.addAll(accountRepository.findByCustomerId(c.getId()));
        }
        result.sort(Comparator.comparing(Account ::getAccountNumber));
        return result;
//      return customerRepository.findAll().stream()
//              .filter(c -> c.getName().toLowerCase().contains(query))
//              .flatMap(c-> accountRepository.findByCustomerId(c.getId()).stream())
//              .sorted(Comparator.comparing(Account::getAccountNumber))
//              .collect(Collectors.toList());

    }

    private String getAccountNumber() {
        int size = accountRepository.findAll().size()+1;
        return String.format("AC%06d",size);
    }
}
