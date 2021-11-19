package be.intecbrussel.geometry;

public class Circle extends Shape {

    // variables
    public static final int ANGLES = 0;
    private static int count;
    private int radius;

    // initialisation block
    {
        count++;
    }

    // constructors
    public Circle() {
        this(0);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    //methods
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws RuntimeException {
        if (radius < 0)
            throw new NegativeSizeException("negative radius " +
                                                    "circle");
        this.radius = makeAbsolute(radius);
    }

    // this is our get area methode--> and return type
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if ((o != null) && (getClass() == o.getClass()) && (((Circle) o).getX() == getX()) && (((Circle) o).getY() == getY()) && (((Circle) o).getRadius() == getRadius())) {
            return true;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() * radius);
    }

    @Override
    public String toString() {
        return String.format("A circle with radius %d, area %f and perimeter " +
                                     "%f", radius, getArea(), getPerimeter());
    }

    @Override
    public void scale(int factor) {
        setRadius((getRadius() * factor) / 100);
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

    public void grow(int d) {
        setRadius(radius * d);
    }

    public static int getCount() {
        return count;
    }

}
