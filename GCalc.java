import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;

public class GCalc extends JComponent {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        GCalc shapes = new GCalc();
        frame.setSize(1000,1020);
        frame.setTitle("graphing  calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(shapes);

        frame.setVisible(true);

    }

    public void paint(Graphics g) {
        g.setColor(new Color(200,200,200));
        for (int i = 1;i<20;i++){
          g.drawLine(0,i*50,1000,i*50);
          g.drawLine(i*50,0,i*50,1000);
        }
        g.setColor(Color.BLACK);
        g.drawLine(0,500,1000,500);
        g.drawLine(500,0,500,1000);

    }
}
