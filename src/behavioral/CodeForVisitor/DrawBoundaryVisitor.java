package behavioral.CodeForVisitor;

public class DrawBoundaryVisitor extends Visitor {
    
    @Override
    public void visit(Circle circle) {
        System.out.println("Draw boundary for circle !!");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Draw boundary for rectangle !!");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Draw boundary for triangle !!");
    }
}
