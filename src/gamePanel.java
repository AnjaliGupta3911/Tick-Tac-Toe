import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class gamePanel extends JPanel {
		
/*
 * defining coordinates of cross and nought to draw on board
 * declaring static to allow their access without creating obj of class and passing the obj everywhere
 * and because we need only one copy of these variables for this class
*/	
	
	static LinkedList<Integer> zerox1 = new LinkedList<Integer>(); 
	static LinkedList<Integer> zeroy1 = new LinkedList<Integer>(); 
	
	static LinkedList<Integer> crossx1 = new LinkedList<Integer>(); 
	static LinkedList<Integer> crossy1 = new LinkedList<Integer>(); 
	
	static int radius = 30;
	static int c_space = 20;
	
	static int x1 = 90;
	static int x2 = 200;
	static int x3 = 0;
	static int x4 = 300;
	static int y1 = 0;
	static int y2 = 300;
	static int y3 = 80;
	static int y4 = 180;
	
	
	gamePanel()
	{ 	}
	
	public void paintComponent(Graphics g)
	{
		drawBoard(g);
		drawCircle(g);	
		drawCross(g);	
	}
	void drawBoard(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.WHITE);
		//vertical lines
        g2d.drawLine(x1,y1, x1, y2);
        g2d.drawLine(x2,y1, x2, y2);
        
        //horizontal lines
        g2d.drawLine(x3, y3, x4, y3);
        g2d.drawLine(x3, y4, x4, y4);
	}
	
	void drawCircle(Graphics g )
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.GREEN);
		g2d.setStroke(new BasicStroke(2));
		
		for(int i=0;i<zerox1.size();i++)			
			g2d.drawOval(zerox1.get(i), zeroy1.get(i), radius, radius);
	}
	
	void drawCross(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.RED);
		for(int i=0;i<crossx1.size();i++)
		{
			g2d.drawLine(crossx1.get(i), crossy1.get(i), crossx1.get(i)+c_space, crossy1.get(i)+c_space);
			g2d.drawLine(crossx1.get(i)+c_space, crossy1.get(i), crossx1.get(i) ,crossy1.get(i)+c_space);
		}
	}
}