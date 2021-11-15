package be.intecbrussel.geometry;

public class InterfaceApp {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10, 15);
        Shape rectangle2 = new Rectangle(10, 15);
        Scalable rectangle3 = new Rectangle(10, 15);

        System.out.println(rectangle3);
        rectangle3.scale(400);
        System.out.println(rectangle3);

        System.out.println(rectangle2);
        rectangle2.scale(Scalable.DOUBLE);
        System.out.println(rectangle2);
    }
}

