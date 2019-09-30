public abstract class DispenseChain {

    abstract void setNextChain(DispenseChain nextChain);

    abstract void dispense(Currency cur);

    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    public void dispense(Currency cur, int amount, DispenseChain chain ) {
        if(cur.getAmount() >= amount){
            int num = cur.getAmount()/amount;
            int remainder = cur.getAmount() % amount;
            System.out.println("Dispensing "+num+" 20000HUF note");
            if(remainder !=0) chain.dispense(new Currency(remainder));
        }else{
            chain.dispense(cur);
        }
    }

}
