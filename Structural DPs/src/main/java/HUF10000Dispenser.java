public class HUF10000Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10000){
            int num = cur.getAmount()/10000;
            int remainder = cur.getAmount() % 10000;
            System.out.println("Dispensing "+num+" 10000HUF note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
