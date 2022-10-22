package behavioral.CodeForVisitor;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("-----------------------------");
        System.out.println("Logic to draw a rectangle !!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }        
}