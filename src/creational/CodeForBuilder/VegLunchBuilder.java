package creational.CodeForBuilder;

public class VegLunchBuilder extends MealBuilder{

    private Meal meal = new Meal();

    @Override
    public void reset(){
        meal = new Meal();
    }

    @Override
    public void addBurger() {
        meal.burger = "Cheese Veg Burger";
    }

    @Override
    public void addSweet() {
        meal.sweet = "Vanilla Ice-cream"; 
    }

    @Override
    public void addDrink() {
        meal.drink = "Diet Coke";
    }

    @Override
    public void addFries() {
        meal.fries = "small";
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
    
}
