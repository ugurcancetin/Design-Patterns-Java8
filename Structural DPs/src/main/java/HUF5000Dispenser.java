public class HUF5000Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        calculate(cur);
    }

    private void calculate(Currency cur) {
        if (cur.getAmount() >= 5000) {
            int num = cur.getAmount() / 5000;
            int remainder = cur.getAmount() % 5000;
            System.out.println("Dispensing " + num + " 5000HUF note");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } else {
            this.chain.dispense(cur);
        }
    }
}
