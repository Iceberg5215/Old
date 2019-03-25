package prac_prg_09;

public class BankAccountDemo {
    public static void main (String[] args) {
        // Creates nAccount | runs deposit, withdraw and addInterest
        // Testing to see if it will withdraw when hasOverdraft is true
        BankAccount nAccount  = new BankAccount("qwerty1234", "Josh", true);

        nAccount.deposit(500);
        System.out.println("Amount deposited: " + nAccount.getBalance());

        nAccount.withdraw(510);
        System.out.println("Amount left after withdrawal: " + nAccount.getBalance());

        nAccount.addInterest(10);
        System.out.println("Amount in Balance: " + nAccount.getBalance());

        // Creates nAccount2 | runs deposit, withdraw and addInterest
        // Testing to see if it will withdraw when hasOverdraft is false
        BankAccount nAccount2  = new BankAccount("asdf1234", "Tom", false);

        nAccount2.deposit(700);
        System.out.println("Amount deposited: " + nAccount2.getBalance());

        nAccount2.withdraw(800);
        System.out.println("Amount left after withdrawal: " + nAccount2.getBalance());

        nAccount2.addInterest(10);
        System.out.println("Amount in Balance: " + nAccount2.getBalance());

    }
}
