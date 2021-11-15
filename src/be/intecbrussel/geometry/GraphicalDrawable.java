package be.intecbrussel.geometry;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GraphicalDrawable extends JComponent {
    private static List<Drawable> drawables = new ArrayList<>();

    public GraphicalDrawable() {

    }

    public GraphicalDrawable(Drawable drawable) {
        drawables.add(drawable);
    }

    public static void add(Drawable drawable) {
        drawables.add(drawable);
    }

    @Override
    protected void paintComponent (Graphics g) {
        for (Drawable drawable : drawables) {
            if (drawable instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) drawable;
                g.setColor(Color.BLACK);
                g.fillRect(rectangle.getX(), rectangle.getY(),
                        rectangle.getWidth(), rectangle.getHeight());
            } else if (drawable instanceof Circle) {
                Circle circle = (Circle) drawable;
                g.setColor(Color.YELLOW);
                g.fillOval(circle.getX(), circle.getY(), circle.getRadius(),
                        circle.getRadius());
            } else if (drawable instanceof Triangle) {

            }
        }
    }
}
