package example.codeclan.com.godzilla;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class BizzarroPom extends GiantPomPom implements Attack {


    public BizzarroPom(String name, int healthValue, int destructiveForce){
        super(name, healthValue, destructiveForce);
    }

    @Override
    public String roar(){
        return "meow";
    }

}
