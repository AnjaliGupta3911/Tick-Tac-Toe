import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;


public class computerTurn {

	
	int computersTurn(LinkedList boxesLeft)
	{
		int box = chooseBox(boxesLeft);
		String winner = populateBoard.populate(box,-1);
/*    	if(winner!=null)
    	{
    		String op = "Winner is "+winner;
    		JOptionPane.showMessageDialog(null,op);
    		System.exit(0);
    	}*/
    	
		return box;
		
	}
	int chooseBox(LinkedList boxesLeft)
	{
		Random rand = new Random();
		int sz = boxesLeft.size();
		Integer i = null;
		if(sz>0)
		{
		int randomIndex = rand.nextInt(sz);
		i = (Integer) boxesLeft.get(randomIndex);
		boxesLeft.remove(randomIndex);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"  Game Tie");
    		System.exit(0);
		}
		
		return i.intValue();
	}
}
