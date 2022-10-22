package behavioral.CodeForVisitor;

public abstract class Shape {
    
    public abstract void draw();
    public abstract void accept(Visitor visitor);
}
