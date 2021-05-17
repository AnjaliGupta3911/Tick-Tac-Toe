import javax.swing.JOptionPane;


public class populateBoard {

	static int board [][] = new int[3][3];
	static int sum_row1=0;
	static int sum_row2=0;
	static int sum_row3=0;
	static int sum_col1=0;
	static int sum_col2=0;
	static int sum_col3=0;
	static int sum_dig1=0;
	static int sum_dig2=0;
	
	public static void populate(int box_no,int i)
	{
		switch (box_no)
		{
		case 1:
			board[0][0]=i;
			sum_row1 += i;
			sum_col1 += i;
			sum_dig1 += i;
			break;
		case 2:
			board[0][1]=i;
			sum_row1 += i;
			sum_col2 += i;
			break;
		case 3:
			board[0][2]=i;
			sum_row1 += i;
			sum_col3 += i;
			sum_dig2 += i;
			break;
		case 4:
			board[1][0]=i;
			sum_row2 += i;
			sum_col1 += i;
			break;
		case 5:
			board[1][1]=i;
			sum_row2 += i;
			sum_col2 += i;
			sum_dig1 += i;
			sum_dig2 += i;
			break;
		case 6:
			board[1][2]=i;
			sum_row2 += i;
			sum_col3 += i;
			break;
		case 7:
			board[2][0]=i;
			sum_row3 += i;
			sum_col1 += i;
			sum_dig2 += i;
			break;
		case 8:
			board[2][1]=i;
			sum_row3 += i;
			sum_col2 += i;
			break;
		case 9:
			board[2][2]=i;
			sum_row3 += i;
			sum_col3 += i;
			sum_dig1 += i;
			break;
		default:
			
		}
		checkWinner();
		
	}
	static void checkWinner()
	{
		
		if(sum_row1 == 3 || sum_row2==3 || sum_row3==3 || sum_col1==3 || sum_col2==3 || sum_col3==3 || sum_dig1 ==3 || sum_dig2==3)
		{
			fillBoard.winner = "User"; //0->user
		}
		else if(sum_row1 == -3 || sum_row2==-3 || sum_row3==-3 || sum_col1==-3 || sum_col2==-3 || sum_col3==-3 || sum_dig1 ==-3 || sum_dig2==-3)
		{
			fillBoard.winner = "Computer";
		}
		//System.out.println(winner);
		
	}
}
