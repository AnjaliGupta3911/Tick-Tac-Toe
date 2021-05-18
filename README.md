# Tick-Tac-Toe

<h3>Created a simple Tick Tac Toe GUI game in Java using Swing. </h3>

<h3> The Game Board: </h3>

The board is logically divided into 9 partitions/boxes as shown below:

<table>
  <tr>
    <th>1</th>
    <th>2</th>
    <th>3</th>
  </tr>
  <tr>
    <th>4</th>
    <th>5</th>
    <th>6</th>
  </tr>
  <tr>
    <th>7</th>
    <th>8</th>
    <th>9</th>
  </tr>
</table>


<h3> Classes:</h3>
1. <b>GameMain.java</b>:  contains main method <br>
2. <b>gameFrame.java</b>: defines the containing frame <br>
3. <b>gamePanel.java</b>: defines the panel of the frame and paints the board & symbols <br>
4. <b>getLocation.java</b>: implements MouseAdapter to fetch coordinates of mouse click <br>
5. <b>fillBoard.java</b>: contains the main logic of populating board and making next move <br>
6. <b>populateBoard.java</b>: updates the 8 <i>sum</i> variables and checks if we have a winner <br>
7. <b>computerTurn.java</b>: contains logic for making computer's move <br>
8. <b>chooseBox.java</b>: contains logic for choosing box for computer's next move <br>
9. <b>checkAvailaility.java</b>: checks if the given box is available or not <br>

<h3> Main Data structures and variables:</h3>
1. <b>LinkedList zerox1, zeroy1, crossx1, crossy1</b>: contains coordinates of all the cross and noughts drawn on board<br>
2. <b>LinkedList boxesLeft</b>: list of box numbers that are still unfilled <br>
3. <b>int turn</b>: indicates if it is user's turn or computer's with values 0 and 1 respectively <br>
4. <b>int user_pt, comp_pt</b>: 1 and -1 respectively <br>
5. <b>int sum_rowX, sum_colX, sum_digX</b>: contains the total sum of the points accumulated for Xth row, column or diagonal <br>
6. <b>int arrayOfPoints[]</b>: array consisting of values of sum_rowX, sum_colX and sum_digX <br>
7. <b>HashSet availablePos</b>: set representaion of boxesLeft <br>
8. <b>HashSet possiblePos</b>: set conatining box numbers that can be filled up in the current turn <br>
9. <b>HashSet pointPos</b>: contains indexes of arrayOfPoints where we get these values: -2/2/1 <br> 


<h3> Logical workflow:</h3>

<b>Step 1</b>: User makes first move. The selected box is painted with a cross <br>
<b>Step 2</b>: Sum variables and boxesLeft are updated <br>
<b>Step 3</b>: possiblePos is updated with boxes that either results in computer's win (priority 1) or blocks user's win (priority 2) or block user's future move (priority 3) <br>
<b>Step 4</b>: Computer chooses one random box from possiblePos <br>
<b>Step 5</b>: Repeat through 1-4 until we have a winner (value of any <i>sum</i> variable is 3/-3) or there's a tie (no more boxes left) <br>


<h3> Screenshot of the game:</h3>

![screenshot of game](https://github.com/AnjaliGupta3911/Tick-Tac-Toe/blob/2b3fa4a1746ae27dee6fd0271a4f04573a5132cb/TickTacToe.png)
