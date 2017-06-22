package example.codeclan.com.godzilla;

/**
 * Created by stuartbryce on 2017-06-21.
 */

public class Runner {

    public static void main(String[] args) {

        ClownCollege college = new ClownCollege("CodeClan", 100);
        GiantPomPom pom = new GiantPomPom("Mr Biscuits", 50, 5);
        JuicyLucys lucy = new JuicyLucys("Juicy Lucys", 30);
        LargeTortoise tort = new LargeTortoise("The General", 300, 1000);
        BizzarroPom mop = new BizzarroPom("Scoob", -100, -10);

        college.attack(pom);
        college.attack(pom);
        college.attack(pom);
        college.attack(mop);
        college.attack(mop);
        lucy.attack(pom);
        lucy.attack(pom);
        lucy.attack(mop);
        college.attack(tort);
        lucy.attack(tort);

    }
}
