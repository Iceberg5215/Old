package prac_prg_09;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    //Changed data type to boolean | added conditional if statement
    public boolean deposit (double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            return true;
        }
        else return false;
    }

    //Changed data type to boolean | added conditional if statement | used or operator
    public boolean withdraw (double amount) {
        if (balance - amount > 0.0 || hasOverdraft == true) {
            this.balance -= amount;
            return true;
        }
        else return false;
    }

    //Changed data type to boolean | added conditional if statement | used and operator
    public boolean addInterest (int interestRate) {
        if (balance > 0.0 && interestRate > 0.0) {
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }
        else return false;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("BankAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }

}
