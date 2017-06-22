package example.codeclan.com.godzilla;

public abstract class HumanConstructs implements Destroyable{

    private String type;



    private int healthValue;


    public HumanConstructs(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }


    public int getHealthValue() {
        return this.healthValue;
    }

    public String getType() {
        return type;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

}
