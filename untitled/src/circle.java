import javax.swing.*;
import java.awt.*;

public class circle extends figure implements Print{

    private int x,y;
    private int radius;

    public circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
    public void print() {
        System.out.println("Circle(" + getX()+","+getY()+"), Radius:"+ getRadius());

    }


}
