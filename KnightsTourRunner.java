import java.util.InputMismatchException;
import java.util.Scanner;

public class KnightsTourRunner {
    public static Knights knightJester;
    static int TourChoice;
    public static Object input;
        public static void main(String[] args) {
            Messages.displayTourWelcoming();
            Scanner input = new Scanner(System.in);
        

// In the End setting this with a while loop that has a warden, :: Ie . Enter -1 to return to the Menu :: For Secret Tour Enter: 'Cash-out' :: returns the be            
        // exception handling currently terminates program after invalid input :: Needs to be fixed 
        try{
            TourChoice = input.nextInt();
            
        } catch(InputMismatchException e){
            System.out.println("Please enter numbers: 1 through 9.");
        }

        // Switch:: Game Menu Controller
        switch(TourChoice) {

            // RandomMoveTour
            case 1:
                // confirm user's choice
                System.out.println("Your choice was 1");

                // Display welcoming:: Standard Tour
                Messages.displayWelcomingForRandomMoveTour();

                // Get user's input for continuation
                String case1Input = input.next(); 

                // Continuation after z input 
                if(case1Input.equalsIgnoreCase("z") || case1Input.equalsIgnoreCase("Z")){
                    System.out.println("User pressed Z , <.,.> Yeah!");

//_____________________________________________________________________________________________________________________
    // * Method Decomposition * //

                    // Menu Display user's move Select Settings
                    Messages.displayMovementSelectControlsSettingsMenu();

                    // Get user's preference
                    int userMoveSelectSettings = input.nextInt();

                    // User Chooses Board && Movement selection type: dependant on input selection
                    GameManager.MoveSelectSettings_BoardSelectSettings(userMoveSelectSettings);
                   
                    // Display prompt Enter Start Position
                    Messages.EnterKnightStartPosition();

                    // Set start row
                    Messages.setStartRowPosition();
                    int StartRow = input.nextInt();
                    
                    // Set start col
                    Messages.setStartColPosition();
                    int StartCol = input.nextInt();
                    
                    // Set knightCount
                    Messages.setHowManyKnights();
                    int knightCount = input.nextInt();
//_____________________________________________________________________________________________________________________
                    // Takess user's :How many Knights, Method takes the entered starting position: && Runs the RandomMoveTour: Standard
                    GameManager.KnightsForRandomMoveTour(StartRow, StartCol, knightCount);
                }
                break;

            // AccessibiltyHeuristicTour
            case 2:
                // Confirm user's Choice
                System.out.println("Your choice was 2");
                
                // Display Welcoming for Heuristic Knight Tour
                Messages.displayWelcomingForAccessibiltyHueristicTour();

                // Get users preference 
                String case2Input = input.next(); 

                // Continuation after z input 
                if(case2Input.equalsIgnoreCase("z") || case2Input.equalsIgnoreCase("Z")){
                    System.out.println("User pressed Z , <.,.> Yeah!");
//_____________________________________________________________________________________________________________________
    // * Method Decomposition * 
    // Might not be able :: when i tried,the values from the user:: StartRow, StartCol, KnightCount, need to be given to the GameManager.KnightsForAcce etc maybe though; try again later
    // This Code Block will be needed for just about all of "GameModes"
                    // Menu Display user's move Select Settings
                    Messages.displayMovementSelectControlsSettingsMenu();

                    // Get user's preference
                    int userMoveSelectSettings = input.nextInt();

                    // User Chooses Board && Movement selection type: dependant on input selection
                    GameManager.MoveSelectSettings_BoardSelectSettings(userMoveSelectSettings);
                   
                    // Display prompt Enter Start Position
                    Messages.EnterKnightStartPosition();

                    // Set start row
                    Messages.setStartRowPosition();
                    int StartRow = input.nextInt();
                    
                    // Set start col
                    Messages.setStartColPosition();
                    int StartCol = input.nextInt();
                    
                    // Set knightCount
                    Messages.setHowManyKnights();
                    int knightCount = input.nextInt();
//_____________________________________________________________________________________________________________________
                    // Takes users knight count:: Runs Heuristic knight tour
                    GameManager.KnightsForAccessibilityHeuristic(StartRow, StartCol, knightCount);
                }
                break;

            case 3: // ThousandTours
            // Confirm User's choice
                System.out.println("Your choice was 3");
                
                // Display GameType and HowToPlay, request z input
                Messages.displayWelcomingForThouasandMoveTour();
                
                // get user input for continuation    
                String case3Input = input.next();


                // continuation after z input
                if(case3Input.equalsIgnoreCase("z") || case3Input.equalsIgnoreCase("Z")){

                // confirms User's progression through menu
                System.out.println("User pressed Z , <.,.> Yeah!");
                    
                
                 // Menu Display user's move Select Settings
                 Messages.displayMovementSelectControlsSettingsMenu();

                 // Get user's preference
                 int userMoveSelectSettings = input.nextInt();

                 // User Chooses Board && Movement selection type: dependant on input selection
                 GameManager.MoveSelectSettings_BoardSelectSettings(userMoveSelectSettings);

                 // Display prompt Enter Start Position
                 Messages.EnterKnightStartPosition();

                 // Set start row
                 Messages.setStartRowPosition();
                 int StartRow = input.nextInt();
                 
                 // Set start col
                 Messages.setStartColPosition();
                 int StartCol = input.nextInt();
                 
                 // Set knightCount
                 Messages.setHowManyKnights();
                 int knightCount = input.nextInt();

                // Run Brute force Tour
                GameManager.KnightsForThousandKnightsTour(StartRow, StartCol, knightCount);

                }
                break;

            // UserControlled Tour :: 
            case 4: 
            // confirm user's choice
                System.out.println("Your choice was 4");
                // Display GameType and HowToPlay, request z input
                Messages.displayWelcomingForUsersTour();

                // get user input for continuation    
                String case4Input = input.next();

                // continuation after z input
                if(case4Input.equalsIgnoreCase("z") || case4Input.equalsIgnoreCase("Z")){
                    
                    // confirms User's progression through menu
                    System.out.println("User pressed Z , <.,.> Yeah!");
                    
                    // Entering moves: Use's Tour :: explanation with examples
                    Messages.displayHowToEnterMovesExample();
                    
                    // {SAMPLE MOVES EXample} GameManager. {Board, And filled positions}
                    // Illustrates: available move set indexing and, when there are only two possiblle choices
                    GameManager.getUserControlBoardMoveSample1();
                    // Illustrates: Move types and there corresponding move numberType on the board
                    GameManager.getUserControlBoardMoveSample2();

                    // Menu Display user's move Select Settings
                    Messages.displayMovementSelectControlsSettingsMenu();

                    // Get user's preference
                    int userMoveSelectSettings = input.nextInt();

                    // User Chooses Board && Movement selection type: dependant on input selection
                    GameManager.MoveSelectSettings_BoardSelectSettings(userMoveSelectSettings);

                    // Display prompt Enter Start Position
                    Messages.EnterKnightStartPosition();

                    // Set start row
                    Messages.setStartRowPosition();
                    int StartRow = input.nextInt();
                    
                    // Set start col
                    Messages.setStartColPosition();
                    int StartCol = input.nextInt();
                    
                    // Set knightCount
                    Messages.setHowManyKnights();
                    int knightCount = input.nextInt();

                    // Takes users knight count:: Runs UserControlled tour
                    GameManager.KnightsForUserControlledTour(StartRow, StartCol, knightCount);
                }

                // Display user's stats:: TOTALITYMoveCounter, BestKnight, worstKnight, moveCounterAvg, 
                // Display Stats :: :Overview: Display path they took -ie the board-, :MicroView: Display array Moveset of travel :Then Store: ,  
                // Display :: origin position start:  :termination position: 
                // How many moves were you able to get?

                break;

            // Secret Tour    
            case 5:
                System.out.println("Your choice was 5");
                
                
                
                break;
            
            // Queen's Tour
            case 6:
                System.out.println("Your choice was 6");
                
                
                
                break;
            
            // Closed Tour 
            case 7:
                System.out.println("Your choice was 7");
                
                
                
                break;

            // Random Tour
            case 8: 
                System.out.println("Your choice was 8");
                
                
                
                break;

            // Chess Game
            case 9: 
                System.out.println("Your Choice was 9");
                
                
                
                break;
            }
    }
}


