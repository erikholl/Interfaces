package be.intecbrussel.geometry;

public class IsoScelesTriangle extends Triangle {

    // variables
    private static int count;

    // initialisation block
    {
        count++;
    }

    // constructors
    public IsoScelesTriangle() {
        super();
    }

    public IsoScelesTriangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public IsoScelesTriangle(int width, int height, int x,
                             int y) throws RuntimeException {
        if (height < 0)
            throw new NegativeSizeException("negative height " +
                                                    "isotriangle");
        super.setHeight(height);
        super.setX(x);
        super.setY(y);
        setWidth(width);
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle) {
        this(isoScelesTriangle.getWidth(), isoScelesTriangle.getHeight(),
             isoScelesTriangle.getX(), isoScelesTriangle.getY());
    }

    // methods
    @Override
    public void setWidth(int width) throws RuntimeException {
        if (width < 0)
            throw new IllegalArgumentException("negative width" +
                                                       " " +
                                                       "isotriangle");
        super.setWidth(width);
        super.setPerpendicular(width / 2);
    }

    @Override
    public void setPerpendicular(int perpendicular) throws RuntimeException {
        if (perpendicular < 0)
            throw new IllegalArgumentException(
                    "negative perpendicular isotriangle");
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular * 2);
    }

    @Override
    public String toString() {
        return String.format("An isosceles triangle with height %d, width %d," +
                                     " perpendicular %d, area %f, perimeter %f at position (%d, " +
                                     "%d)", getHeight(), getWidth(),
                             getPerpendicular(), getArea()
                , getPerimeter(), getX(), getY());
    }

    public static int getCount() {
        return count;
    }

}
