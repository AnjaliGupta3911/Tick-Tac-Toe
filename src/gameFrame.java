import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class gameFrame extends JFrame 
{
	//declaring gp as static so that repaint function can be called directly without obj
	static gamePanel gp = new gamePanel();
	getLocation getLoc = new getLocation();
	
	gameFrame()
	{
		this.add(gp);
		this.setTitle("Tick Tack Toe");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(300, 300);
		this.setLocation(400, 200);
		this.setBackground(Color.BLACK);
		this.addMouseListener(getLoc);		
		
	} 
	
}