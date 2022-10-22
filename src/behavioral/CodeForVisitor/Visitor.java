package behavioral.CodeForVisitor;

public abstract class Visitor {

    public abstract void visit(Circle circle);
    public abstract void visit(Rectangle rectangle);
    public abstract void visit(Triangle triangle);
}
