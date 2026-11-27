package Day3;
class ATM {
    int balance = 10000;
    int withdrawalAmount;

    ATM(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    void withdraw() {
        try {
            int result = balance / withdrawalAmount;
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Balance can be divided " + result + " times");
        } catch (ArithmeticException e) {
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Invalid withdrawal amount");
        }
        System.out.println();
    }
}

public class D3T21 {
    public static void main(String[] args) {
        ATM atm1 = new ATM(1000);
        ATM atm2 = new ATM(500);
        ATM atm3 = new ATM(0);

        atm1.withdraw();
        atm2.withdraw();
        atm3.withdraw();
    }
}