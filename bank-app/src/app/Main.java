package app;
import service.BankService;
import service.service.impl.BankService.BankServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankServiceImpl();
        boolean run = true;
        System.out.println("Welcome to Bank application");
        while (run) {

            System.out.println("""
                    1) Open Account
                    2) Deposit
                    3) Withdraw
                    4) Transfer
                    5) Account Statement
                    6) List Accounts
                    7) Search Accounts by Customer Name
                    0) Exit
                    """);

            System.out.println("CHOOSE : ");
            String choice = sc.nextLine().trim();
            System.out.println("CHOICE : " + choice);

            switch (choice) {
                case "1" -> openAccount(sc ,bankService );
                case "2" -> deposit(sc,bankService);
                case "3" -> withDraw(sc , bankService);
                case "4" -> transfer(sc,bankService);
                case "5" -> accountStatement(sc , bankService);
                case "6" -> listAccounts(sc ,bankService);
                case "7" -> searchAccounts(sc,bankService);
                case "0" -> run = false;
            }
        }
    }

    private static void openAccount(Scanner sc ,BankService bankService)  {
        System.out.println("Customer name :");
        String name = sc.nextLine().trim();
        System.out.println("Customer email :");
        String email = sc.nextLine().trim();
        System.out.println("Account Type (SAVINGS/CURRENT):");
        String accountType = sc.nextLine().trim();
        System.out.println("Initial Deposit (Optional, blank for 0):");
        String amountStr = sc.nextLine().trim();
        double initial = Double.valueOf(amountStr);
      String accountNumber =  bankService.openAccount(name,email,accountType);
      if (initial >0){
           bankService.deposit(accountNumber, initial,"initial deposit");

      }
        System.out.println("Account Number :" + accountNumber);

    }

    private static void deposit(Scanner sc ,BankService bankService) {
        System.out.println("Account number : ");
        String accountNumber = sc.nextLine().trim();
        System.out.println("Amount :");
        Double amount = Double.valueOf(sc.nextLine().trim());
        bankService.deposit(accountNumber ,amount ,"Deposit");
        System.out.println("Amount Deposited");
    }

    private static void withDraw(Scanner sc ,BankService bankService) {

        System.out.println("Account number : ");
        String accountNumber = sc.nextLine().trim();
        System.out.println("Amount :");
        Double amount = Double.valueOf(sc.nextLine().trim());
        bankService.withdraw(accountNumber ,amount ,"Withdrawal");
        System.out.println("Withdrawn");
    }

    private static void transfer(Scanner sc , BankService bankService) {
        System.out.println("From Account");
        String from = sc.nextLine().trim();
        System.out.println("To account");
        String to = sc.nextLine().trim();
        System.out.println("Amount : " );
        Double amount = Double.valueOf(sc.nextLine().trim());
        bankService.transfer(from ,to,amount ,"Transfer");

    }

    private static void accountStatement(Scanner sc, BankService bankService) {
        System.out.println("Account Number");
         String account = sc.nextLine().trim();
         bankService.getStatement(account).forEach(s->{
             System.out.println(s.getTimeStamps() + " | " + s.getType() + " | " + s.getAmount() + " | " + s.getNote());
         });
    }

    private static void listAccounts(Scanner sc ,BankService bankService) {
        bankService.listAccount().forEach(l->{
            System.out.println(l.getAccountNumber() + " | " + l.getAccountType() + " | " + l.getBalance());
        });
    }

    private static void searchAccounts(Scanner sc , BankService bankService) {
        System.out.println("Enter customer name");
        String query = sc.nextLine().trim();
        bankService.searchAccountsByCustomer(query).forEach(account -> {
            System.out.println(account.getAccountNumber() + " | "
                    + account.getAccountType() + " | " + account.getAccountType() + " | " + account.getBalance());
        });
    }

}