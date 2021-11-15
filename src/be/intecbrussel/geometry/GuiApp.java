package be.intecbrussel.geometry;

import javax.swing.*;

public class GuiApp {

    public static void main(String[] args) {
        int w = 640;
        int h = 480;
        JFrame f = new JFrame();


//        Drawing drawing = new Drawing();
//        Rectangle rect = new Rectangle(10, 50, 31, 110);
//        Circle circ = new Circle(21, 211, 303);
//
//        drawing.add(rect);
//        drawing.add(circ);
//
        Gui gui = new Gui(w, h);

//        DrawingContext dc = new Gui(w, h);

//        drawing.draw(gui);

        f.setSize(w, h);
        f.setTitle("drawing");
        f.add(gui);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

//        Drawing myLittlePicasso = new Drawing();
//        Rectangle rect = new Rectangle(10, 9);
//        Triangle tri = new Triangle(12, 5, 7);
//        Circle cir = new Circle(11);

//        myLittlePicasso.add(rect);
//        myLittlePicasso.add(tri);
//        myLittlePicasso.add(cir);
//
//        myLittlePicasso.draw(gui);
//        myLittlePicasso.scale(Scalable.DOUBLE);
//        myLittlePicasso.draw(dc);

    }
}


