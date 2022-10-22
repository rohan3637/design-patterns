package structural.CodeForFlyweight.Solution;

import java.awt.Image;

public class TankType {
    
    private String typeName;
    private int power;
    private int orgHealth;
    private Image image;

    public TankType(String typeName, int power, int orgHealth, Image image) {
        this.typeName = typeName;
        this.power = power;
        this.orgHealth = orgHealth;
        this.image = image;
    }
}
