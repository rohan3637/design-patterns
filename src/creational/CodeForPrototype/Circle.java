package creational.CodeForPrototype;

public class Circle implements Shape {

    private int x;
    private int radius;

    public Circle(){
        // make hit to db to set x and radius.
    }

    private Circle(int x, int radius){
        this.x = x;
        this.radius = radius;  
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this.x, this.radius);
    }
}
