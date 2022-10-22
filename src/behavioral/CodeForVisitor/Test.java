package behavioral.CodeForVisitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        Visitor svgExport = new ExportToSVGVisitor();
        Visitor drawBoundary = new DrawBoundaryVisitor();
        Visitor downloader = new DownloadVisitor();

        for(Shape shape : shapes){
            shape.draw();
            shape.accept(svgExport);
            shape.accept(drawBoundary);
            shape.accept(downloader);
        }
    }
}
