package be.intecbrussel.geometry;

public class TextContextApp {

    public static void main(String[] args) {

        Drawing myLittlePicasso = new Drawing();
        Rectangle rect = new Rectangle(10, 9);
        Triangle tri = new Triangle(12, 5, 7);
        Circle cir = new Circle(11);

        myLittlePicasso.add(rect);
        myLittlePicasso.add(tri);
        myLittlePicasso.add(cir);

        DrawingContext dc = new TextDrawingContext();

        myLittlePicasso.draw(dc);
        myLittlePicasso.scale(Scalable.DOUBLE);
        myLittlePicasso.draw(dc);

    }
}