package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stuartbryce on 2017-06-21.
 */

public class TestJuicy {


    JuicyLucys lucy;
    GiantPomPom pom;

    @Before
    public void before() {
        lucy = new JuicyLucys("burger eatingery", 100);
        pom = new GiantPomPom("Mr Biscuits", 50, 5);
    }

    @Test
    public void testGetType(){
        assertEquals("burger eatingery", lucy.getType());
    }

    @Test
    public void testGetHealth(){
        assertEquals(100, lucy.getHealthValue());
    }

    @Test
    public void testGetsAttacked(){
        lucy.attack(pom);
        assertEquals(95, lucy.getHealthValue());
    }


}