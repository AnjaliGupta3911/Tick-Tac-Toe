import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JOptionPane;
// E:\Documents\Eclipse-Java\Java Codes\TickTackToe

public class GameMain 
{
	public static void main(String[] args) 
	{

		gameFrame fr = new gameFrame();
		
		int turn=0;	//0 => user; 1 => computer
		
		int choice = acceptUserInput();
		if (choice==2 || choice==1)
			System.exit(0);
		
		
		fr.setVisible(true);

	}
	
	static int acceptUserInput()
	{
		int input = JOptionPane.showConfirmDialog(null, "Start Game?");
		return input;	
	}
}
