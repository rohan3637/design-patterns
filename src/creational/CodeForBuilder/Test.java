package creational.CodeForBuilder;

public class Test {
    
    public static void main(String[] args){

        Director director = new Director();
        director.setMealBuilder(new VegLunchBuilder());
        Meal meal = director.construct();

        System.out.println(meal.toString());

        director.setMealBuilder(new NonVegLunchBuilder());
        meal = director.construct();

        System.out.println(meal.toString());
    }
}
