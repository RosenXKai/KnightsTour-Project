

public class Messages {
    // Welcoming Menu:
    public static void displayTourWelcoming(){
        System.out.println(
                          "#____________________________________#\n"+
                          "|                                    |\n"+
                          "|      Welcome To Knights Tour!      |\n"+
                          "#____________________________________#\n"+
                        
                                          "\n"+
                          "#____________________________________#\n"
                        + "|            TOUR MENU               |\n"
                        + "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n"
                        + "| -[1]-    Random move selection     |\n"   
                        + "| -[2]-    Accessibility Heuristic   |\n" 
                        + "| -[3]-    Thousand Tours            |\n"
                        + "| -[4]-    User's Tour               |\n"
                        + "| -[5]-    Secret Tour               |\n"
                        + "| -[6]-    Queen's Tour              |\n"
                        + "| -[7]-    Closed Tour               |\n"
                        + "| -[8]-    Random Tour               |\n"
                        + "| -[9]-    Chess Game                |\n"
                        + "#____________________________________#"
                        );
    }
//___________________________________________________________________________
    // SECRET TOUR BETTING :: // CASE 5 // USES Random Move Tour:: As the game type:: Betting system :: 
    public static void displayWelcomingForRandomMoveSelectionTourBETTING(){
        System.out.println(
                           "*___________________________________*\n"+
                           "|    Selection: Secret Casino Tour! |\n" +
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| How To Play:                      |\n"+
                           "|  Secret Casino Tour; enter as many|\n"+
                           "| knights you want! The random move |\n"+
                           "| tour will control the knights by  |\n"+
                           "| using a random output algrithm.   |\n"+
                           "| * Choose your knight positions!   |\n"+
                           "| * Place your bets!                |\n"+
                           "|  - On knights                     |\n"+
                           "|  - On Stats                       |\n"+
                           "|  - On Squares                     |\n"+
                           "|   Enter 'Z' for Betting controls  |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| WIN Condition:                    |\n"+
                           "|   Inorder to win, your parlay has |\n"+ 
                           "| to be matched, to the board.      |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| Lose Conditions:                  |\n"+
                           "|  * Running out of tokens          |\n"+ 
                           "|  * No parlays are matched         |\n"+
                           "|  * leaving the table, 'game exit' |\n"+
                           "|___________________________________|\n"+
                           "|   Enter 'z' To continue   <.,.>/  |\n"+
                           "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n"
        );          
    }

    // display betting rules :: BETTING
    public static void displayBettingRules(){
        System.out.println(
            "#___________________________________#\n"+
            "| Betting Rules:                    |\n"+
            "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
            "| How to bet:                       |\n"+
            "|   Enter the number of bets you'd  |\n"+
            "| like to place. Select the types of|\n"+
            "| bets: if you don't have enough    |\n"+           
            "| tokens you'll be escorted out of  |\n"+
            "| the game. 'game exit' <.,.>/      |\n"+
            "#___________________________________#\n"
           );  
    }

    // display available parlays :: BETTING
    public static void displayAvailableParlays(){
        System.out.println(
            "#___________________________________#\n"+                  
            "| Available Parlays:                |\n"+
            "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
            "| *Position bets: are bets on the   |\n"+
            "| locations the knight may or may   |\n"+ 
            "| not travel to.                    |\n"+
            "|   Column Bet: locations in col    |\n"+
            "|      Row Bet: locations in row    |\n"+
            "| Location Bet: occupied location   |\n"+
            "|    Empty Bet: location not visited|\n"+
            "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
            "| *Stats bets: bets that are placed |\n"+
            "| on statistical data.              |\n"+
            "|  Success Bet: Tours completed     |\n"+
            "|   Failed Bet: Tours incompleted   |\n"+
            "|Travelers Bet: Total squares visitd|\n"+
            "#___________________________________#\n"
        );
    }
//___________________________________________________________________________
    // This is for the UsersTour, movement commands will be specified by user, default will be (startRow, startCol) //CASE 4
    public static void displayWelcomingForUsersTour(){
        System.out.println(
                           "#___________________________________#\n"+
                           "|    Selection:   User's Tour!      |\n" +
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| How To Play:                      |\n"+
                           "|   User's Tour; is a knight's sim, |\n"+
                           "| controlled by YOU! Try to jump to |\n"+
                           "| every square on the board without |\n"+
                           "| jumping to previously occupied    |\n"+
                           "| squares.                          |\n"+
                           "|   Enter 'Z' for movement controls |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| WIN Condition:                    |\n"+
                           "|   Inorder to win you must jump to |\n"+ 
                           "| each square without revisiting a  |\n"+
                           "| square you previously occupied.   |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| Lose Conditions:                  |\n"+
                           "|  * Running out of moves           |\n"+ 
                           "|  * Running out of knights         |\n"+
                           "|  * No open squares are available  |\n"+ 
                           "|___________________________________|\n"+
                           "|   Enter 'z' To continue   <.,.>   |\n"+
                           "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n"
                           );              
    }


    // Sample MoveSelectForUserControlledTour
    public static void displayHowToEnterMovesExample(){
        System.out.println( 
                           "#________________________________________#\n"+
                           "| How to Enter Move Choice:              |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "|  The set of available moves is indexed |\n"+
                           "| from zero to seven: to choose a move   |\n"+
                           "| type, enter in 0-7, with respect to the|\n"+
                           "| given size of the available move set.  |\n"+
                           "#________________________________________#\n"+
                           "| Sample Move Choice:                    |\n"+
                           "#________________________________________#\n"+
                           "|    Move index:  0, 1, 2, 3, 4, 5, 6, 7 |\n"+
                           "| Available Set: [6, 7]                  |\n"+
                           "|----------------------------------------|\n"+
                           "| Enter move index: (user_input) = 0     |\n"+
                           "|****************************************|\n"+
                           "| The user entered index 0, this selects |\n"+
                           "| knight move-type 6                     |\n"+
                           "#________________________________________#\n"+
                           "|   Enter 'z' To continue   <.,.>        |\n"+
                           "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n");
    } 
    // MoveChoices from set : availableMoves()
    public void displayMoveChoicesForUserControlledTour(){
        System.out.print(
                         "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                         "| Move Set Numbers:  0, 1, 2, 3, 4, 5, 6, 7         |\n"
                        );
    }
//___________________________________________________________________________
    // Movement Controls :: Display
    public static void displayMovementSelectControlsSettingsMenu(){
        System.out.println(
                           "#___________________________________#\n"+
                           "| Start Position Settings:          |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| -[1]- Enter: (startRow,startCol)  |\n"+
                           "| -[2]- Enter: Cordinates, a1, f3   |\n"+
                           "| -[3]- Enter: 1 - 64               |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
                          +"| Please choose a setting  <.,.>    |\n"+
                           "#___________________________________#\n"
                          );  
    }
//___________________________________________________________________________
    // Display Menu for entering Knight StartPosition
    public static void EnterKnightStartPosition(){
             System.out.print(
                 "#___________________________________#\n"+
                 "| Enter Starting Position:          |\n"+
                 "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"
                 );
            
    }
    // display prompt for startRow
    public static void setStartRowPosition(){
        System.out.print(" <- Enter StartRow: ");
    }
    // display prompt for startCol
    public static void setStartColPosition(){
        System.out.print(" <- Enter StartCol: ");
    }
    // display prompt for How many Knights
    public static void setHowManyKnights(){
        System.out.print(" <- Enter Number of Knights: ");
    }

//_____________________________________________________________________________
    // Display Default settings1
    public static void DisplayDefaultSettings1(){
        System.out.println("#___________________________________#\n"+
                           "| Start Position Setting Selected:  |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| -[1]- Enter: (startRow,startCol)  |\n"+
                           "| Enter the starting position by    |\n"+
                           "| inputing the startRow and then the|\n"+
                           "| startCol. The range from (0-7,0-7)|\n"+
                           "|___________________________________|\n"+
                           "| Example Move Selection:           |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| <- Enter StartRow: (userinput) = 0|\n"+
                           "| <- Enter StartCol: (userinput) = 0|\n"+
                           "| <- Knight will start at (0,0)     |\n"+
                           "| ! The position (0,0) will set the |\n"+
                           "| original knight position in the   |\n"+
                           "| top left corner of the board.     |\n"+
                           "#___________________________________#\n"  
                           );
        System.out.println("#________________________________________________#\n"+
                           "|           :Sample Input Selections:            |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|"
                           );
        // Displays the 3d array: where the {element0,element1}
        GameManager.printSampleBoardForDefaultMoveSelect();
        System.out.println("#________________________________________________#\n");
    }
//________________________________________________________________________________________________
    // Random Move Tour: Standard
    public static void displayWelcomingForRandomMoveTour(){
        System.out.println("*___________________________________*\n"+
                           "|    Selection: Random Move Tour!   |\n" +
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| How To Play:                      |\n"+
                           "|   Random Move Tour; enter as many |\n"+
                           "| knights you want! The random move |\n"+
                           "| tour will control the knights by  |\n"+
                           "| using a random output algrithm.   |\n"+
                           "| * Choose your knight positions!   |\n"+
                           "#___________________________________#\n"+
                           "|   Enter 'z' To continue   <.,.>   |\n"+
                           "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n");
    }
//__________________________________________________________________________________________________________________________
    // Knight Heuristic Tour: Standard
    public static void displayWelcomingForAccessibiltyHueristicTour(){
        System.out.println("#_____________________________________________#\n"+
                           "|  Selection: Accessibility Heuristic Tour!   |\n" +
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| How To Play:                                |\n"+
                           "|   Accessibility Heuristic Tour; enter as    |\n"+
                           "| many knights you want! The Accessibility    |\n"+
                           "| Heuristc tour controls the knights by using |\n"+
                           "| a heuristic of accessibility. The algorithm |\n"+
                           "| assess the knights position, and makes moves|\n"+
                           "| according to tile accessibiblty.            |\n"+
                           "| * Choose your knight positions!             |\n"+
                           "|_____________________________________________|\n"+
                           "|   Enter 'z' To continue   <.,.>             |\n"+
                           "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n");
    }
    
//___________________________________________________________________________
    // Thousand move Tour: Messages 
    public static void displayWelcomingForThouasandMoveTour(){
        System.out.println("#___________________________________#\n"+
                           "|    Selection: Thousand Move Tour! |\n" +
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n"+
                           "| How To Play:                      |\n"+
                           "|   Thousand Move Tour; is a knight |\n"+
                           "| simualtor that runs...you guessed |\n"+
                           "| it! ONE Thousand knight tour sims!|\n"+
                           "| The tour will run a thousand tours|\n"+
                           "| from your specified location.     |\n"+
                           "|   Thousand Move Tour, uses a brute|\n"+
                           "| force algorithim/principal. Using |\n"+
                           "| a while loop, to force the program|\n"+
                           "| to run until a specified criteria |\n"+
                           "| is met. In our situation we want  |\n"+
                           "| the program to run until there is |\n"+
                           "| one succesful knight tour.        |\n"+
                           "|___________________________________|\n"+ // Might be good for the user's tour : message :'Enter 'Z' for movement controls' fits a bit better
                           "|   Enter 'Z' for movement controls |\n"+
                           "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n");
    }
//___________________________________________________________________________

public static void displayAllSixtyFourPositionsTour(){

}



}
