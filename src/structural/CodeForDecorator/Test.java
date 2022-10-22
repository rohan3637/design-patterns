package structural.CodeForDecorator;

public class Test {
    
    public static void main(String[] args){

        Shape circle = new Circle();
        circle.draw();

        ShapeDecorator cirWithBorder = new BorderShapeDecorator(circle);
        cirWithBorder.draw();

        ColorShapeDecorator cirWithBorderAndColor = new ColorShapeDecorator(cirWithBorder);
        cirWithBorderAndColor.draw();
    }
}
