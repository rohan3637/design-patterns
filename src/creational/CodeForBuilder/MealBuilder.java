package creational.CodeForBuilder;

public abstract class MealBuilder {
    
    public abstract void addBurger();
    public abstract void addSweet();
    public abstract void addDrink();
    public abstract void addFries();
    public abstract void reset();
    public abstract Meal getMeal();
}
