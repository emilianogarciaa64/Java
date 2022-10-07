import java.awt.Graphics;

public class Vehicle {
    private Graphics g;

    public Vehicle(Graphics g) {
        this.g = g;

    }


    // Dibuja el avion
    public void drawPlane() {
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(150, 60, Config.SIZE_PLANE_CABIN_W, Config.SIZE_PLANE_CABIN_H);
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(200, 25, Config.SIZE_PLANE_WING_W, Config.SIZE_PLANE_WING_H);
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(170, 40, Config.SIZE_PLANE_BASE_W, Config.SIZE_PLANE_BASE_H);
        g.setColor(Config.COLOR_PLANE_B);
        g.fillOval(165, 40, Config.SIZE_PLANE_HELIX_W, Config.SIZE_PLANE_HELIX_H);

    }

}