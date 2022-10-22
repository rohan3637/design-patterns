package creational.CodeForBuilder;

public class NonVegLunchBuilder extends MealBuilder {
    
    private Meal meal = new Meal();

    @Override
    public void reset(){
        meal = new Meal();
    }

    @Override
    public void addBurger() {
        meal.burger = "Chicken Burger";
    }

    @Override
    public void addSweet() {
        meal.sweet = "Gulab Jamun"; 
    }

    @Override
    public void addDrink() {
        meal.drink = "McFlurry";
    }

    @Override
    public void addFries() {
        meal.fries = "King";
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
