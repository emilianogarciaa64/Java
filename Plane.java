import java.awt.Color;
import java.awt.Graphics;

public class Plane extends Vehicle{
    private int w, h;

    public Plane(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    public void draw(Graphics g){

        g.setColor(this.getColor());

        
        // dibuja la base del avion
        g.fillOval(getDot().getX(), getDot().getY(), w, h);

        //dibuja las alas de en medio
        double x1 = w;
        double y1 = h;
        x1 *= 0.5;
        y1 *= -1.5;
        g.fillOval(getDot().getX() + (int)x1, getDot().getY() + (int)y1, w/6, h*4);

        // dibuja las alas de atras
        double x2 = w;
        double y2 = h;
        x2 *= 0.1;
        y2 *= -0.5;
        g.fillOval(getDot().getX() + (int)x2, getDot().getY() + (int)y2, w/6, h*2);
        

            


    
        



        // g.setColor(Color.WHITE);
        // double x = w;
        // double y = h;
        // x *= 0.275;
        // y *= -0.3;
        // g.fillOval(getDot().getX() + (int)x, getDot().getY() + (int)y, w/2, h/2);


        // g.setColor(this.getColor());
        // g.fillOval(getDot().getX(), getDot().getY(), w, h);
       
       
    }
}