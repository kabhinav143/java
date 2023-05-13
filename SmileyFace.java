import java.awt.*;
import javax.swing.*;

public class SmileyFace extends JFrame {

    public SmileyFace() {
        super("Smiley Face");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 300, 300);
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 300, 300);

        // Draw eyes
        g.fillOval(180, 180, 40, 40);
        g.fillOval(280, 180, 40, 40);

        // Draw mouth
        g.drawArc(150, 220, 200, 100, 180, 180);
    }

    public static void main(String[] args) {
        new SmileyFace();
    }
}
