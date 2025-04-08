import java.util.ArrayList;
public class Knights {
 
    static final int NUM_ROWS = 8, NUM_COLS = 8;
    protected int[][] board;
    protected int moveCounter = 1;
            private int knightRow, kinghtCol;//the position of the knight
            //                       0  1   2   3   4   5  6  7
            final int[] COL_SHIFT = {2, 1, -1, -2, -2, -1, 1, 2};
            final int[] ROW_SHIFT = {-1, -2, -2, -1, 1, 2, 2, 1};
            public String totalMoves;
         
            static Knights knightJester = new Knights(0, 0);

            public Knights(int startRow, int starCol){
                board = new int[NUM_ROWS][NUM_COLS];
                knightRow = startRow;
                kinghtCol = starCol;
                board[knightRow][kinghtCol] = 1;
            }
            /*
             * While there are moves available from my current posision do the following
             * 1. Get the available moves - DONE!
             * 2. Pick a move - Done
             * 3. Make a move - 
             * When no moves remain, check to see if your moveConter == limit
             */
         
            //pickMove wil return a random move element from the available moves list
            /**
             * Precondition: getAvailableMoves() returns a list size() > 0
            */
            public int pickMove(){
                ArrayList<Integer> moves = getAvailableMoves();
                if (moves.isEmpty()){
                    System.out.println("No moves available!");
                }
                return moves.get((int)(Math.random() * moves.size()));
            }
         
    public int getMoveCounter(){
        return moveCounter;
    }

    public boolean runTour(){
        boolean moveMade = makeMove();
        while(moveMade){
            moveMade = makeMove();
        }
        return moveCounter == 64;
    }
 
    public boolean makeMove(){
        //get moves
        ArrayList<Integer> moves = getAvailableMoves();
        //if there are moves, pick a move
        if(moves.size() < 1){
            return false;
        }
        int move = pickMove();
        //update the knight row and knight col
        knightRow += ROW_SHIFT[move];
        kinghtCol += COL_SHIFT[move];
        //update the counter
        moveCounter++;
        //update the board
        board[knightRow][kinghtCol] = moveCounter;
        return true;
    }
 
    //get available moves will check all move numbers and collect move numbers that valid
    public ArrayList<Integer> getAvailableMoves(){
        ArrayList<Integer> moves = new ArrayList<>();
        for(int i = 0; i < ROW_SHIFT.length; i++){
            int nextMoveRow = knightRow + ROW_SHIFT[i];
            int nextMoveCol = kinghtCol + COL_SHIFT[i];
            if(validCell(nextMoveRow, nextMoveCol)){
                moves.add(i);
            }
        }
        return moves;
    }
 
    public boolean validCell(int row, int col){
        //check bounds of arr
        boolean topCheck = row >= 0;
        boolean bottomCheck = row < board.length;
        //check bounds of each element in arr
        boolean leftCheck = col >= 0;
 
        return topCheck && bottomCheck && leftCheck && col < board[row].length && cellEmpty(row, col);
    }
 
    public boolean cellEmpty(int row, int col){
        return board[row][col] == 0;
    }

    // tour reset, move counter reset, and board is cleared
    public void resetTour(){
        moveCounter = 1;
        resetBoard();
    }
    
    // all positions/cells are repalced with 0
    public void resetBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = 0;
            }
 
        }
    }
 

    // allows knights to receive a default board
    public int[][] getDefaultBoard(){
        return board;
    }

    // displays the Tour path: for a knight with a default board:: position set to (0,0) :: Top Left
    public void displayTourPath(Knights knight){
        int[][] board = knight.getDefaultBoard();
        for(int[] nums: board){
            for(int n: nums){
                System.out.printf("%2d ", n);
            }
            System.out.println();
        }
    }
  
                    
}

 