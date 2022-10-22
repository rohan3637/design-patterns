package behavioral.CodeForVisitor;

public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("----------------------------");
        System.out.println("Logic to draw a triangle !!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
