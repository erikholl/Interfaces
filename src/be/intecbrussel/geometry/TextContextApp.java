package be.intecbrussel.geometry;

public class TextContextApp {

    public static void main(String[] args) {

        Drawing myLittlePicasso = new Drawing();
        Rectangle rect = new Rectangle(8, 9);
        Triangle tri = new Triangle(12, 3, 7);
        Circle cir = new Circle(5);
        Square square = new Square(9);
        IsoScelesTriangle isot = new IsoScelesTriangle(3, 3);

        myLittlePicasso.add(rect);
        myLittlePicasso.add(tri);
        myLittlePicasso.add(cir);
        myLittlePicasso.add(square);
        myLittlePicasso.add(isot);

        DrawingContext dc = new TextDrawingContext();

        myLittlePicasso.draw(dc);               // text output 1
        myLittlePicasso.scale(Scalable.DOUBLE); // scale up
        myLittlePicasso.draw(dc);               // text output 2

    }
}