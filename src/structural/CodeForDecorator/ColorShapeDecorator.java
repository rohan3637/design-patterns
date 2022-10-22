package structural.CodeForDecorator;

public class ColorShapeDecorator extends ShapeDecorator {

    public ColorShapeDecorator(Shape shape) {
        super(shape);
    }
    
    @Override
    public void draw() {
        System.out.print("add a color. ");
        super.draw();
    }
}
