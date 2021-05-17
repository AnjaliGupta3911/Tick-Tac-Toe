import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class computerTurn {
	
	int comp_pt = -1;
	int computersChance()
	{
		int box = chooseBox();
		populateBoard.populate(box,comp_pt);    	
		return box;		
	}
	
	int chooseBox()
	{
		Random rand = new Random();
		int sz = getLocation.boxesLeft.size();
		Integer i = null;
		if(sz>0)
		{
			int randomIndex = rand.nextInt(sz);
			i = (Integer) getLocation.boxesLeft.get(randomIndex);
			getLocation.boxesLeft.remove(randomIndex);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"  Game Tie! ");
    		System.exit(0);
		}
		
/*		System.out.println("boxes left after computer's turn:");
		for(int j=0;j<getLocation.boxesLeft.size();j++)
			System.out.print(getLocation.boxesLeft.get(j));
		System.out.println();*/
		
		return i.intValue();
	}
}
