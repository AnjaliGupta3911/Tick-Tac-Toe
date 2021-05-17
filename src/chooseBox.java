import java.util.*;


public class chooseBox {
	
	static LinkedList selectBox()
	{
		//this array contains all the sums
		int arrayOfPoints[]={populateBoard.sum_row1,populateBoard.sum_row2,populateBoard.sum_row3,
				   			 populateBoard.sum_col1,populateBoard.sum_col2,populateBoard.sum_col3,
				   			 populateBoard.sum_dig1,populateBoard.sum_dig2};
		
		HashSet availablePos = new HashSet<Integer>(getLocation.boxesLeft);	
		
		HashSet possiblePos = new HashSet<Integer>();
		HashSet pointPos = new HashSet<Integer>();
		
/*
 * 3 points will result in user's win and -3 in computer's win
 * So the logic that we'll follow is that computer will first try to fill up boxes where it is -1 point away from win..
 * If no such pos is available then computer will try to block user's win and fill box where there user might make the next move,
 * i.e. user is 1 point away from winning
 * If there are no critical boxes as mentioned above or when the game is in starting phase, computer will fill up places to block
 * user's future move by choosing any box that lies directly in line with one of user's box.
 */
		
		//  pointPos contains indexes of arrayOfPoints where we get these values: -2/2/1
		pointPos = findMinus2(arrayOfPoints);		
		if(pointPos.isEmpty() == true)
			pointPos = find2(arrayOfPoints);
		if(pointPos.isEmpty() == true)
			pointPos = find1(arrayOfPoints);

		//possiblePos contains boxes that correspond to indexes stored in pointPos
		possiblePos = addBoxNo(pointPos);
		
		//determining common values from set of possible boxes and set of available boxes
		possiblePos.retainAll(availablePos);
		
		return new LinkedList<Integer>(possiblePos);
	}

	static HashSet addBoxNo(HashSet set2)
	{
/*
 * this method determines which boxes that correspond with the indexes.
 * e.g. array= {1,0,0,0,0,1,0,1} this means sum_row1, sum_col3 and sum_dig2 has 1 element. set2 contains {0,5,7} 
 * set1 we will have all the boxes corresponding with these rows/columns/diagonal. so in this case it will be {1,2,3,5,6,7,9}
   psst.. this trick is possible because we already know that we put which sum value in which order. Do dry-run to understand better
 */
		HashSet set1 = new HashSet<Integer>();		
		Iterator<Integer> iterator = set2.iterator();

		while(iterator.hasNext())
		{
		 int i = iterator.next().intValue();
		 switch (i)
		 {
				case 0:
					set1.add(1);
					set1.add(2);
					set1.add(3);
					break;
				case 1:
					set1.add(4);
					set1.add(5);
					set1.add(6);
					break;
				case 2:
					set1.add(7);
					set1.add(8);
					set1.add(9);
					break;
				case 3:
					set1.add(1);
					set1.add(4);
					set1.add(7);
					break;
				case 4:
					set1.add(2);
					set1.add(5);
					set1.add(8);
					break;
				case 5:
					set1.add(3);
					set1.add(6);
					set1.add(9);
					break;
				case 6:
					set1.add(1);
					set1.add(5);
					set1.add(9);
					break;
				case 7:
					set1.add(3);
					set1.add(5);
					set1.add(7);
					break;
				default:
					break;
			}
		}
		return set1;
	}
	
	static HashSet findMinus2(int sum[])
	{
		HashSet s1 = new HashSet<Integer>();
		for(int c=0;c<8;c++)
			if(sum[c] == -2)
				s1.add(c);
		
		return s1;		
	}
	
	static HashSet find2(int sum[])
	{
		HashSet s1 = new HashSet<Integer>();
		for(int c=0;c<8;c++)	
			if(sum[c] == 2)		
				s1.add(c);			
		
		return s1;
	}
	
	static HashSet find1(int sum[])
	{
		HashSet s1 = new HashSet<Integer>();
		for(int c=0;c<8;c++)
			if(sum[c] == 1)
				s1.add(c);

		return s1;
	}
}
