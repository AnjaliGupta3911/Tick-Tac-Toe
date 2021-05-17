import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.Timer;


//to-do: disable user from selecting already filled box
public class fillBoard {

	static String winner;
	static computerTurn ct = new computerTurn();
	static int user_pt = 1;
	
	
	static void fillUp(int x_cor, int y_cor)
	{
		int x = x_cor;
        int y = y_cor;
        int box;
     
        //determine the box
	    if(x<=90)
        {
        		if(y<=105)
        			box=1;
        		else if(y>105 && y<=205)  
        			box=4;        		
        		else  
        			box=7;      		     		
        } 
        else if(x>90 && x<=200)
        {
        		if(y<=105)
        			box=2;
        		else if(y>105 && y<=205)    
        			box=5;
        		else  	
        			box=8;   		    	
        } 
        else
        {
        		if(y<=105)
        			box =3;
        		else if(y>105 && y<=205)   		
        			box=6;
        		else   	
        			box=9;    		
        }
	        
	    //check if selected box is empty. then populate board and draw on it
		if(checkAvailaility.isAvailable(box) == true)
		{
			populateBoard.populate(box,user_pt);  
			drawOnLoc(box);		
			getLocation.boxesLeft.remove(Integer.valueOf(box));  //remove from list of available boxes      
			getLocation.turn=1;		//next turn is of computer so turn is changed to 1
			gameFrame.gp.repaint();	//repaint board with updates
		}
			

	
/*			System.out.println("boxes left after user's turn:");
			for(int j=0;j<getLocation.boxesLeft.size();j++)
				System.out.print(getLocation.boxesLeft.get(j));
			System.out.println();*/
			
			
		//checking if we have a winner
        if(winner!=null)
        {
        	JOptionPane.showMessageDialog(null,"Winner is "+winner);
  			System.out.println("Game end");
  			System.exit(0); 				 				
        }
    		
        //computer's turn to be called with delay of 800 ms
    	int delay = 800;
    	if(getLocation.turn == 1){
    	   	Timer timer = new Timer(delay,new ActionListener(){
       		 public void actionPerformed( ActionEvent e )
       		{    fillUpComp();    }
       	} );
       	timer.setRepeats( false );
      		timer.start(); 
    	}
 		
	}

	 static void fillUpComp()
	{
		//computer's turn
  		int loc = ct.computersChance();	
		drawOnLoc(loc);
		gameFrame.gp.repaint();
		
		//checking if we have a winner after computer's move
		if(winner!=null)
    	{
        	JOptionPane.showMessageDialog(null,"Winner is "+winner);
  			System.out.println("Game end");
  			System.exit(0); 
    	}
		
		getLocation.turn = 0; 	//next turn is user's
	
	}
	
	
	static void drawOnLoc(int b)
	{
		int c,d;
		switch (b)
		{
		case 1:
			c=40;
			d=40;
			break;
		case 2:
			c=150;
			d=40;
			break;
		case 3:
			c=250;
			d=40;
			break;
		case 4:
			c=50;
			d=140;
			break;
		case 5:
			c=150;
			d=140;
			break;
		case 6:
			c=250;
			d=140;
			break;
		case 7:
			c=50;
			d=240;
			break;
		case 8:
			c=150;
			d=240;
			break;
		case 9:
			c=250;
			d=240;
			break;
		default:
			c=0;
			d=0;
		}
		
		//turn = 0 is user
		if(getLocation.turn==0) 
		{
			gameFrame.gp.crossx1.add(c);
			gameFrame.gp.crossy1.add(d);
			//System.out.println("user box= "+b);
		}
		else
		{
			gameFrame.gp.zerox1.add(c);
			gameFrame.gp.zeroy1.add(d);
			//System.out.println("computer box= "+b);
		}
	}
	
	
}
