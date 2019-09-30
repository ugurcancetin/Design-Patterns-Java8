public class HUF500Dispenser implements DispenseChain{



    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 500){
            int num = cur.getAmount()/500;
            int remainder = cur.getAmount() % 500;
            System.out.println("Dispensing "+num+" 500HUF note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
