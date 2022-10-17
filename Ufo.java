import java.awt.Color;
import java.awt.Graphics;

public class Ufo extends Vehicle{
    private int w, h;

    public Ufo(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    public void draw(Graphics g){

        g.setColor(Color.WHITE);
        double x = w;
        double y = h;
        x *= 0.275;
        y *= -0.3;
        g.fillOval(getDot().getX() + (int)x, getDot().getY() + (int)y, w/2, h/2);


        g.setColor(this.getColor());
        g.fillOval(getDot().getX(), getDot().getY(), w, h);
       
       
    }
}