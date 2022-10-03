import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;


public class MyCanvas extends JPanel {
    public MyCanvas () {
        setPreferredSize(new Dimension(400,300));
        setBackground(Color.GRAY);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintBrush = new Paintbrush(g);
        paintBrush.drawSky();
        paintBrush.drawMountains(15,120,100,40,180,120);
        paintBrush.drawMountains(180,120,250,40,350,120);
        paintBrush.drawMountains(100,120,175,40,250,100);
        paintBrush.drawMountains(200,175,350,50,400,175);
        paintBrush.drawTree(200,50);
        paintBrush.drawTree(100,20);
        paintBrush.drawTree(300,40);
        paintBrush.drawTree(50,110);
        paintBrush.drawTree(360,100);
        paintBrush.drawTree(140,75); 
    }
}