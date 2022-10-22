package behavioral.CodeForVisitor;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("----------------------------");
        System.out.println("Logic to draw a circle !!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
