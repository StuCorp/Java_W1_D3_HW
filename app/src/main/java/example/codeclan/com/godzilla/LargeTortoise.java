package example.codeclan.com.godzilla;

/**
 * Created by stuartbryce on 2017-06-21.
 */

public class LargeTortoise extends Kaiju {


    int destructiveForce;

    public LargeTortoise(String name, int healthValue, int destructiveForce){

        super(name, healthValue);
        this.destructiveForce = destructiveForce;
    }

    public int getDestructiveForce(){
        System.out.println(roar());
        System.out.println(roar());
        return this.destructiveForce;
    };

    public String roar(){
        return "nibble nibble";
    };
}
