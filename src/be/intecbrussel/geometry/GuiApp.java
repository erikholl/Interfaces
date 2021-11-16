package be.intecbrussel.geometry;

public class GuiApp {
    public static void main(String[] args) {
        int height = 800;
        int width = 800;

        Rectangle r = new Rectangle(200, 300, 20, 50);
        Rectangle r2 = new Rectangle(111, 200, 200, 500);
        Rectangle r3 = new Rectangle(200, 50, 600, 600);
        Circle c = new Circle(190, 500, 300);

        Drawing drawing = new Drawing();
        drawing.add(r, r2, r3, c);

        Gui gui = new Gui(height, width);
        for (Drawable drawable : drawing) {
            drawable.draw(gui);
        }
        gui.draw();
    }
}
