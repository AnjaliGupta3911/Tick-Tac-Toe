import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

import javax.swing.Timer;


public class fillBoard {

/*	
	void fillUp(MouseEvent e,int turn, LinkedList boxesLeft, gamePanel gp )
	{
		int x = e.getX();
       int 	y = e.getY();
			//System.out.println("user clicked x="+x+" y="+y);
	        	if(x<=90)
	        	{
	        		if(y<=105)
	        		{
	        			//Box 1
	        			populateBoard.populate(1,1);
	        			
	        			drawOnLoc(1,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(1));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		else if(y>105 && y<=205)
	        		{
	        			//Box 4
	        			populateBoard.populate(4,1);
	        			drawOnLoc(4,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(4));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		else 
	        		{
	        			//Box 7
	        			populateBoard.populate(7,1);
	        			
	        			drawOnLoc(7,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(7));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		
	        	}
	        	else if(x>90 && x<=200)
	        	{

	        		if(y<=105)
	        		{
	        			//Box 2
	        			populateBoard.populate(2,1);
	        			
	        			drawOnLoc(2,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(2));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		else if(y>105 && y<=205)
	        		{
	        			//Box 5
	        			populateBoard.populate(5,1);
	        			
	        			drawOnLoc(5,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(5));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		else 
	        		{
	        			//Box 8
	        			populateBoard.populate(8,1);
	        			
	        			drawOnLoc(8,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(8));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}    		    	
	        	} 
	        	else
	        	{
	        		if(y<=105)
	        		{
	        			//Box 3
	        			populateBoard.populate(3,1);
	        			
	        			drawOnLoc(3,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(3));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		else if(y>105 && y<=205)
	        		{
	        			//Box 6
	        			populateBoard.populate(6,1);
	        			
	        			drawOnLoc(6,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(6));
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}
	        		else
	        		{
	        			//Box 9
	        			populateBoard.populate(9,1);
	        			drawOnLoc(9,turn,gp,boxesLeft);
	        			boxesLeft.remove(Integer.valueOf(9));
	        			
	        			turn=1;
	        			gp.repaint();
	        			//draw x or o
	        		}       		
	        	}
	        	
	        	System.out.println("boxes left2:  ");
	    		for(int i=0;i<boxesLeft.size();i++)
	    		{	
	    			System.out.print(boxesLeft.get(i));
	    		}
	    		System.out.println();
	    		
	    		int delay = 500;
	    		Timer timer = new Timer( delay,new ActionListener(){
	    			  public void actionPerformed( ActionEvent e ){
	    				  fillUpComp(LinkedList boxesLeft);
	    			  }
	    			} );
	    		timer.setRepeats( false );
	    		timer.start();   		
		
	}
	
	void drawOnLoc(int b,int t, gamePanel gp,LinkedList boxesLeft)
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
		if(t==0)
		{
			gp.zerox1.add(c);
			gp.zeroy1.add(d);
			System.out.println("user box= "+b);
		}
		else
		{
			gp.crossx1.add(c);
			gp.crossy1.add(d);
			System.out.println("computer box= "+b);
		}
	}
	
	
	void fillUpComp(LinkedList boxesLeft,int turn )
	{
		//computer's turn
		computerTurn ct = new computerTurn();
   		int loc = ct.computersTurn(boxesLeft);
		
		drawOnLoc(loc,turn);
		turn=0;
		gp.repaint();
	}
	*/
}
