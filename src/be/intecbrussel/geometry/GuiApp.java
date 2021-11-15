package be.intecbrussel.geometry;

public class GuiApp {
    public static void main(String[] args) {
        int height = 800;
        int width = 800;

        Rectangle rectangle = new Rectangle(200, 300, 20, 50);
        Rectangle rectangle2 = new Rectangle(111, 200, 200, 500);
        Rectangle rectangle3 = new Rectangle(200, 50, 600, 600);

        Drawing drawing = new Drawing();
        drawing.add(rectangle);
        drawing.add(rectangle2);
        drawing.add(rectangle3);

        Gui gui = new Gui(height, width);
        drawing.draw(gui);

        gui.draw();
    }
}
