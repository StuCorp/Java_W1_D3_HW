package example.codeclan.com.godzilla;

/**
 * Created by stuartbryce on 2017-06-21.
 */

public class ClownCollege extends HumanConstructs {

    public ClownCollege(String type, int healthValue) {

        super(type, healthValue);
    }

    public void die(){
        if (getHealthValue() <= 0){
            System.out.println(String.format("%s crumbled! Fruit scramble! [hp:%d]", this.getType(), this.getHealthValue()));
            return;
        }
        System.out.println(String.format("%s: i still function! [hp:%d]", this.getType(), this.getHealthValue()));
    }

    public void attack(Kaiju kaiju){
        System.out.println(String.format("%s: uh oh, %s approaches!", this.getType(), kaiju.getName()));
        int currentHealth = this.getHealthValue();
        currentHealth-= (kaiju.getDestructiveForce())/2;
        setHealthValue(currentHealth);
        die();
    }

}
