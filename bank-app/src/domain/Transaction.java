package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String accountNumber;
    private Double amount;
    private LocalDateTime timeStamps ;
    private String note;
    private Type type;

    public Transaction(String id, String accountNumber, Double amount, LocalDateTime timeStamps, String note, Type type) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.timeStamps = timeStamps;
        this.note = note;
        this.type = type;
    }

    public Transaction(String accountNumber, Double amount, String string, String note, LocalDateTime now, Type type) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(LocalDateTime timeStamps) {
        this.timeStamps = timeStamps;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
