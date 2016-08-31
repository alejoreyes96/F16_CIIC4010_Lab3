import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;
	

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
         
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width +1, height +1);
                        
                        g.setColor(Color.BLACK);
                        g.drawRect(x1+5, y1+5, width-10, height-10);
                        
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 , y1 , width, height);
                        
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        g.setColor(Color.RED);
                        g.drawLine(x1+200, y1, y2-200, x2);
                        
                        g.setColor(Color.BLACK);
                        g.fillOval(x1 -27 + x2/2 , y1 -27 +y2/2 , 55, 55);
                       
                        Polygon p = new Polygon();
                        p.addPoint(x1 +1 , y1 );
                        p.addPoint(x1 + 150, y1 + 100);
                        p.addPoint(x1 , y1+ 200 );
                        
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                       
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 75 +10);
                        p2.addPoint(x1 + 41, y1 + 75 +10);
                        p2.addPoint(x1 + 47, y1 + 60 +10);
                        p2.addPoint(x1 + 53, y1 + 75 +10);
                        p2.addPoint(x1 + 69, y1 + 75 +10);
                        p2.addPoint(x1 + 56, y1 + 85 +10);
                        p2.addPoint(x1 + 61, y1 + 100 +10);
                        p2.addPoint(x1 + 47, y1 + 90+10);
                        p2.addPoint(x1 + 34, y1 + 100 +10);
                        p2.addPoint(x1 + 38, y1 + 85 +10);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);


                        
                      
            }
}