package example.codeclan.com.godzilla;

import static java.sql.DriverManager.println;

/**
 * Created by stuartbryce on 2017-06-21.
 */

public class JuicyLucys extends HumanConstructs {

    public JuicyLucys(String type, int healthValue){
        super(type, healthValue);
    }

    public void die(){
        if (getHealthValue() <= 0){
            System.out.println(String.format("%s exploded in a ball of grease", this.getType()));
            return;        }
        System.out.println(String.format("%s: lunchtime special: your ass!", this.getType()));

    }

    public void attack(Kaiju kaiju){
        System.out.println(String.format("%s: oil the grill. lunctime special: fried %s!", this.getType(), kaiju.getName()));
        this.healthValue -= kaiju.getDestructiveForce();
        die();
    }


}
