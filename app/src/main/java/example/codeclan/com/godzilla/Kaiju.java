package example.codeclan.com.godzilla;

import static android.R.attr.value;

public abstract class Kaiju implements Attack{

    private String name;
    private int healthValue;

    public Kaiju(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }
}