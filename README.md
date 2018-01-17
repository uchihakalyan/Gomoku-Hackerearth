# Gomoku-Hackerearth

Gomoku is a two-player board game which is played on a 
10
X
10
10X10 grid of cells. Each player has an allocated color, Black ( First Player ) or White ( Second Player ) being conventional. Players take turns placing a stone of their color on a single cell within the overall playing board. The goal is to get an unbroken row of five or more stones horizontally, vertically, or diagonally.

Now here is the twist. We modified some of the rules of Gomoku to make the game little more interesting.

First Player must get an unbroken row of exactly five stones horizontally, vertically, or diagonally to win. Any move which is creating an unbroken row of more than five stones horizontally, vertically, or diagonally is considered as Invalid Move.
The above rule is applied only to Black stone ( First Player ).
We will play it on an 
10
X
10
10X10 grid simulated as rhombus. The top left of the grid is 
[
0
,
0
]
[0,0] and the bottom right is 
[
9
,
9
]
[9,9]. The rule is that a 
c
e
l
l
[
i
,
j
]
cell[i,j] is connected to any of top, left, right, or bottom cell.

Input:
The input will be a 
10
X
10
10X10 matrix consisting only of 
0
,
1
0,1 or 
2
2. Then another line will follow which will contain a number - 
1
1 or 
2
2 which is your player id.

In the given matrix, top-left is 
[
0
,
0
]
[0,0] and bottom-right is 
[
9
,
9
]
[9,9]. The x-coordinate increases from left to right, and y-coordinate increases from top to bottom.

The cell marked 0 means it doesn't contain any stones. The cell marked 1 means it contains first player's stone which is Black in color. The cell marked 2 means it contains second player's stone which is white in color.

Output:
Print the coordinates of the cell separated by space, where you want to play your move. You must take care that you don't print invalid coordinates. For example, 
[
1
1
]
[11] might be a valid coordinate in the game play, but 
[
9
10
]
[910] will never be. Also if you play an invalid move or your code exceeds the time/memory limit while determining the move, you lose the game.

Starting state
The starting state of the game is the state of the board before the game starts.

0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0

First Input
This is the input give to the first player at the start of the game.

0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
1

SAMPLE INPUT 
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 2 0 0 0 0
0 0 0 0 2 1 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
1
SAMPLE OUTPUT 
5 6
Explanation
This is player 1's turn, and the player puts his/her stone in cell [5, 6]. 

After his/her move the state of game becomes: 
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 2 0 0 0 0
0 0 0 0 2 1 0 0 0 0
0 0 0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0

This state will be fed as input to program of player 2. 
