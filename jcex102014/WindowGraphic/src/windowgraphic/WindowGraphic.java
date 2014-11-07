package windowgraphic; 
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel; 
public class WindowGraphic extends Panel { 
    int[][] points = {{20,40},{10,50},{60,60},{30,20},{0,0}};
    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.red);
        for(int i=0;i<points.length;i++){
            g2.fillRect(points[i][0], points[i][1], 10, 10);
        } 
    } 
    public static void main(String[] args) { 
       Frame f = new Frame();
       f.add(new WindowGraphic());
       f.setSize(300,300);
       f.setVisible(true);
    } 
}
