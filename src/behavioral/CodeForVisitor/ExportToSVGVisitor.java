package behavioral.CodeForVisitor;

public class ExportToSVGVisitor extends Visitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Export the circle to SVG !!");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Export the rectangle to SVG !!");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Export the triangle to SVG !!");
    }
}