import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    double balance = 10000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance)
            throw new InsufficientBalanceException(
                    "Insufficient Balance");

        balance -= amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Balance = " + balance);
    }
}

public class BankTransaction {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        try {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();

            b.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
