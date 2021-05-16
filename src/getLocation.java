import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class getLocation extends MouseAdapter
{
	//turn=0 is for user; turn=1 is computer; 1st chance is of user so turn is 0
	static int turn = 0;
	static LinkedList<Integer> boxesLeft = new LinkedList <Integer>();	
	
	//constructor
	getLocation()
	{
		for(int k=1;k<10;k++)
			boxesLeft.add(k);
		
/*		System.out.println("initial boxes:");
		for(int k=0;k<boxesLeft.size();k++)
			System.out.print(boxesLeft.get(k));
		System.out.println();*/
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		int x = e.getX();
       	int y = e.getY();
       	
       	if(turn == 0)
       		fillBoard.fillUp(x,y);       		
	}
	
}
