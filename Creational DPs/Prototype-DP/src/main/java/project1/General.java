package project1;

//Does not support cloning
public class General extends GameUnit{
    private String state = "idle";

    public void boostMorale(){
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General " + state + "@" + getPosition();
    }
}
