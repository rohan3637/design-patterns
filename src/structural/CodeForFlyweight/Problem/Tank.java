package structural.CodeForFlyweight.Problem;

import java.awt.Image;

public class Tank {
    
    public int x;
    public int y;
    public int currHealth;

    // this space can be shared across types tosave memory
    public int power; 
    public int orgHealth;
    public Image image;
}
