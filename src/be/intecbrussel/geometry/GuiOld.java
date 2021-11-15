package be.intecbrussel.geometry;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class GuiOld extends JComponent implements DrawingContext {

    private int width;
    private int height;
    private Rectangle rect;
    private Circle circ;
//    private Graphics2D g2d;

    public GuiOld(int w, int h) {
        width = w;
        height = h;

        Drawing myDrawing = new Drawing();

        rect = new Rectangle(21, 17, 100, 200);
        circ = new Circle(13, 200, 300);

        myDrawing.add(rect);
        myDrawing.add(circ);
        rect.draw(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g; // casting g to a Graphics2D object
//        rect.draw();
//        g.fillRect(10, 10, 15, 18);
    }
//
    @Override
    public void draw(Rectangle rectangle) {
        System.out.println("rect");
    }

    @Override
    public void draw(Circle circle) {
        System.out.println("circ");
    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println("tria");
    }

//    @Override
//    public void draw(Graphics2D g2d) {
//        Color color = Color.BLACK;
//        g2d.setColor(color);
////        g2d.fill();
//        rect.draw(this);
//        System.out.println("g2d");
//    }
}
