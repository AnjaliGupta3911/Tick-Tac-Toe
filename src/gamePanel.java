import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class gamePanel extends JPanel {
		

	LinkedList<Integer> zerox1 = new LinkedList<Integer>(); 
	LinkedList<Integer> zeroy1 = new LinkedList<Integer>(); 
	
	LinkedList<Integer> crossx1 = new LinkedList<Integer>(); 
	LinkedList<Integer> crossy1 = new LinkedList<Integer>(); 
	
	gamePanel()
	{ 	}
	
	public void paintComponent(Graphics g)
	{
		drawBoard(g);
		for(int i=0;i<zerox1.size();i++)
		{	
			drawCircle(g, zerox1.get(i),zeroy1.get(i));	
		}
		for(int i=0;i<crossx1.size();i++)
		{	
			drawCross(g, crossx1.get(i),crossy1.get(i));	
		}
	}
	void drawBoard(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		//vertical
        g2d.drawLine(90,0, 90, 300);
        g2d.drawLine(200,0, 200, 300);
        
        //horizontal
        g2d.drawLine(0, 80, 300, 80);
        g2d.drawLine(0, 180, 300, 180);
	}
	void drawCircle(Graphics g, int x, int y )
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawOval(x, y, 30, 30);
	}
	void drawCross(Graphics g, int x, int y)
	{
		Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(x, y, x+20, y+20);
        g2d.drawLine(x+20,y,x,y+20);
	}
}