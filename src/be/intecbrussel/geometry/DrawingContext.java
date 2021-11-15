package be.intecbrussel.geometry;

import javax.swing.*;
import java.awt.*;

public interface DrawingContext {

    void draw(Rectangle rectangle);
    void draw(Circle circle);
    void draw(Triangle triangle);
//    void draw(Graphics2D g2d);
}
