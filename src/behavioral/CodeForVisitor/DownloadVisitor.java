package behavioral.CodeForVisitor;

public class DownloadVisitor extends Visitor {
    
    @Override
    public void visit(Circle circle) {
        System.out.println("Download the circle !!");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Download the rectangle !!");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Download the triangle !!");
    }
}
