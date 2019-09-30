import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain c1;

    ATMDispenseChain() {
        // initialize the chain
        this.c1 = new HUF20000Dispenser();
        DispenseChain c2 = new HUF10000Dispenser();
        DispenseChain c3 = new HUF5000Dispenser();
        DispenseChain c4 = new HUF20000Dispenser();
        DispenseChain c5 = new HUF1000Dispenser();
        DispenseChain c6 = new HUF500Dispenser();


        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }

}