import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class computerTurn {
	
	int comp_pt = -1; 		 //each selected box of the board is populated by points according to player. -1 represents computer
	int computersChance()
	{
		int box = choosebox();
		populateBoard.populate(box,comp_pt);    	
		return box;		
	}
	
	int choosebox()
	{
		Random rand = new Random();
		
		//finalPos contains list of box no. where computer can place nought
		LinkedList finalPos = chooseBox.selectBox();
		
		int sz = finalPos.size();
		Integer i = null;
		if(sz>0)
		{
			int randomIndex = rand.nextInt(sz);
			//choose random box
			i = (Integer) finalPos.get(randomIndex);
			//remove it from list of available boxes
			getLocation.boxesLeft.remove(i);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"  Game Tie! ");
    		System.exit(0);
		}
		
		return i.intValue();
	}
}
