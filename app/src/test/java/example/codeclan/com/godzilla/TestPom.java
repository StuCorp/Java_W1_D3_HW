package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stuartbryce on 2017-06-21.
 */

public class TestPom {


    GiantPomPom pom;

    @Before
    public void before() {
        pom = new GiantPomPom("Mr Biscuits", 100, 5);
    }

    @Test
    public void getName(){
        assertEquals("Mr Biscuits", pom.getName());
    }

    @Test
    public void getHealthValue(){
        assertEquals(100, pom.getHealthValue());
    }

    @Test
    public void getDestructiveValue(){
        assertEquals(5, pom.getDestructiveForce());
    }


}
