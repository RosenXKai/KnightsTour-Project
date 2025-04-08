
import java.util.ArrayList;
import java.util.Scanner;

public class UserControlledKnight extends Knights {
    private int knightRow;
    private int knightCol;
    // private static int TryCount;
        
            // User Controlled Knight  :: Parameters StartRow, StartCol, is for the knight's starting position,  int knightCount :: used for "Lives" :: How many tries the player gets
            public UserControlledKnight(int StartRow, int StartCol) {       // , int TryCount
                super(StartRow, StartCol);
                knightRow = StartRow;
                knightCol = StartCol;
                board[knightRow][knightCol] = 1;
            }
        
            // User controlled Tour Runner
            public boolean runTourForUserControlledTour(){
                boolean moveMade = userMakeMove();
                while(moveMade){
                    moveMade = userMakeMove();
                    //display Tour path after move 
                }
                GameManager.totalMoves += moveCounter;
                return moveCounter == 64;
            }
            // overriding isn't neccissary:: Prompt :: Ex.. The available moves are : 0-7
            public ArrayList<Integer> getAvailableMoves(){
                ArrayList<Integer> moves = new ArrayList<>();
                for(int i = 0; i < ROW_SHIFT.length; i++){
                    int nextMoveRow = knightRow + ROW_SHIFT[i];
                    int nextMoveCol = knightCol + COL_SHIFT[i];
                    if(validCell(nextMoveRow, nextMoveCol)){
                        moves.add(i);
                    }
                }
                        return moves;
            }
            
            // display Available moves for User tour
            public void displayAvailableMoves(ArrayList<Integer> moves){
                    System.out.println(  "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                                         "|  Available moves: " + moves + "             |\n"+
                                         "|---------------------------------------------------|"
                                         );
                    System.out.print(  "|  Enter your Move: ");
            }
            // Messages.prompt the user: to enter a number :: needs scanner object, then store 'input' into int var...We want to see if this works
            // While loop over this 
            


            // moves gets the users input
        public int userPickMove(){
            
            Scanner input = new Scanner(System.in);
            Messages messages = new Messages();
           
            //get your messages:: In-progress
           
            //display available moves and prompt for input
            displayTourPathForUserControlledTour();

            //get available moves :: Done
            ArrayList<Integer> moves = getAvailableMoves();
            if(moves.isEmpty()){
                return -1;
            }
                // How to enter the moves :: display
            messages.displayMoveChoicesForUserControlledTour();
            
                // Displays the set of AvailableMoves
            displayAvailableMoves(moves);
            
            //return the chosen move if available moves is empty return -1
            int UserChoice = input.nextInt();
            return moves.get(UserChoice);
        }
    
        //
        
        public boolean userMakeMove(){
                //if pick move is -1 return false, resetTour(); :: MoveCounter sets back to 1; Board Clears 
                if(userPickMove()==-1){
                    resetTour();
                        return false;
                    }else{
                    //if there are moves, pick a move
                    int currentMove = userPickMove();
                     //update the knight row and knight col
                    knightRow += ROW_SHIFT[currentMove];
                    knightCol += COL_SHIFT[currentMove];
                    //update the counter
                    moveCounter++;
                    //update the board
                    board[knightRow][knightCol] = moveCounter;
                    return true;
                    }
        }
    
        public int getMoveCounter(){
            return moveCounter;
        }

    // Displays the board 
    public void displayTourPathForUserControlledTour(){
        int[][] board = getDefaultBoard();
        for(int[] nums: board){
            for(int n: nums){
                System.out.printf("%2d ", n);
            }
            System.out.println();
        }
    }

}
