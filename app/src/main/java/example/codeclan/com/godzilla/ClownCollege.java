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
            System.out.println(String.format("%s crumbled! Fruit scramble!", this.getType()));
            return;
        }
        System.out.println(String.format("%s: i still function!", this.getType()));
    }

    public void attack(Kaiju kaiju){
        System.out.println(String.format("%s: uh oh, %s approaches!", this.getType(), kaiju.getName()));
        this.healthValue -= (kaiju.getDestructiveForce())/2;
        die();
    }

}
