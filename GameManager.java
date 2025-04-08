
//__________________________________________________________________________________________________________________________

    // GameManager Purpose: To contain the Tour Runners logic: And the Boards
public class GameManager {
        public static Knights knightJester;
    
        static final int NUM_ROWS = 8, NUM_COLS = 8;
        static int[][] board;
        static int totalMoves = 0;
        // allows knights to receive a default board
        public int[][] getDefaultBoard(){
            return board;
        }
//__________________________________________________________________________________________________________________________

        // Default sample board: For user Comprehension on how the inputs work
        public static int[][][] sampleBoardForDefaultMoveSelect = {
            { {0,0},  {0,1},  {0,2},  {0,3},  {0,4},  {0,5},  {0,6},  {0,7}},
            { {1,0},  {1,1},  {1,2},  {1,3},  {1,4},  {1,5},  {1,6},  {1,7}},                
            { {2,0},  {2,1},  {2,2},  {2,3},  {2,4},  {2,5},  {2,6},  {2,7}},
            { {3,0},  {3,1},  {3,2},  {3,3},  {3,4},  {3,5},  {3,6},  {3,7}},
            { {4,0},  {4,1},  {4,2},  {4,3},  {4,4},  {4,5},  {4,6},  {4,7}},
            { {5,0},  {5,1},  {5,2},  {5,3},  {5,4},  {5,5},  {5,6},  {5,7}},
            { {6,0},  {6,1},  {6,2},  {6,3},  {6,4},  {6,5},  {6,6},  {6,7}},
            { {7,0},  {7,1},  {7,2},  {7,3},  {7,4},  {7,5},  {7,6},  {7,7}},
        };

        // print Sample Board:
        public static void printSampleBoardForDefaultMoveSelect( ){
            for(int i = 0; i < sampleBoardForDefaultMoveSelect.length; i++){
                System.out.print("|");
                for(int j = 0; j < sampleBoardForDefaultMoveSelect[i].length; j++){
                    System.out.print("{" + sampleBoardForDefaultMoveSelect[i][j][0] + "," + sampleBoardForDefaultMoveSelect[i][j][1] + "} ");
                }
                System.out.print("|");
                System.out.println();
            }
        }
        
        // Allows user to view sample board
        public int[][][] getSampleInputBoard(){
            return sampleBoardForDefaultMoveSelect;
        }
//__________________________________________________________________________________________________________________________

        // Numeric board
        public static int[][] numericBoard = {
                              { 1,  2,  3,  4,  5,  6,  7,  8},
                              { 9, 10, 11, 12, 13, 14, 15, 16},                 
                              {17, 18, 19, 20, 21, 22, 23, 24},
                              {25, 26, 27, 28, 29, 30, 31, 32},
                              {33, 34, 35, 36, 37, 38, 39, 40},
                              {41, 42, 43, 44, 45, 46, 47, 48},
                              {49, 50, 51, 52, 53, 54, 55, 56},
                              {57, 58, 59, 60, 61, 62, 63, 64},};
        
        // Print Numeric Board   
        public static void printNuemericBoard( ){
            for(int i = 0; i < numericBoard.length; i++){
                for(int j = 0; j < numericBoard[i].length; j++){
                    System.out.print(numericBoard[i][j] + " ");
                }
                System.out.println();
            }
        }
        // allows knights to get numeric board
        public int[][] getNumericBoard(){
            return numericBoard;
        }
//__________________________________________________________________________________________________________________________
        
        // Chess Notation
        public static String[][] chessNotationBoard = {
                              {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},                      
                              {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
                              {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
                              {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
                              {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
                              {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
                              {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
                              {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}};
        
        // Print Chess notation board   
        public static void printChessNotationBoard( ){
            for(int i = 0; i < chessNotationBoard.length; i++){
                for(int j = 0; j < chessNotationBoard[i].length; j++){
                    System.out.print(chessNotationBoard[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        // allows knights to get Chess Notation board
        public String[][] getChessNotationBoard(){
            return chessNotationBoard;
        }
//__________________________________________________________________________________________________________________________

        // Standard Accessibility Heuristic Board
        public static int[][] accessibilityHeuristicBoard = { 
                              {2, 3, 4, 4, 4, 4, 3, 2}, 
                              {3, 4, 6, 6, 6, 6, 4, 3},
                              {4, 6, 8, 8, 8, 8, 6, 4},
                              {4, 6, 8, 8, 8, 8, 6, 4},
                              {4, 6, 8, 8, 8, 8, 6, 4},
                              {4, 6, 8, 8, 8, 8, 6, 4},
                              {3, 4, 6, 6, 6, 6, 4, 3},
                              {2, 3, 4, 4, 4, 4, 3, 2}};                      

        // Print accessibility Heuristic Board    
        public static void printAccessibilityHeuristicBoard(){
            for(int i = 0; i < accessibilityHeuristicBoard.length; i++){
                for(int j = 0; j < accessibilityHeuristicBoard[i].length; j++){
                    System.out.print(accessibilityHeuristicBoard[i][j] + " ");
                }
                System.out.println();
            }
        }
        // allows knights to get Accessibility board
        public int[][] getAccessibilityHeuristicBoard(){
            return accessibilityHeuristicBoard;
        }
//__________________________________________________________________________________________________________________________
        
        // Sample Board for UserControlledTourMove1
        public static int[][] UserControlBoardMoveSample1 = {
            {1, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 7, 0, 0, 0, 0, 0},
            {0, 6, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}};
        // entering moveset index : 0,1
        //        available moves :[6,7] 
        
            public static void printUserControlBoardMoveSample1(){
                for(int i = 0; i < UserControlBoardMoveSample1.length; i++){
                    for(int j = 0; j < UserControlBoardMoveSample1[i].length; j++){
                        System.out.print(UserControlBoardMoveSample1[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            // allows knights to get Accessibility board
            public static int[][] getUserControlBoardMoveSample1(){
                return UserControlBoardMoveSample1;
            }



             // Sample Board for UserControlledTourMove2
            public static int[][] UserControlBoardMoveSample2 = {
            {0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 2, 0, 1, 0, 0},
            {0, 0, 3, 0, 0, 0,-1, 0},
            {0, 0, 0, 0,-9, 0, 0, 0},
            {0, 0, 4, 0, 0, 0, 7, 0},
            {0, 0, 0, 5, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}};
        // (4,4) , -1 = 0,  -9 = startPosition
            public static void printUserControlBoardMoveSample2(){
                for(int i = 0; i < UserControlBoardMoveSample2.length; i++){
                    for(int j = 0; j < UserControlBoardMoveSample2[i].length; j++){
                        System.out.print(UserControlBoardMoveSample2[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            // allows knights to get Accessibility board
            public static int[][] getUserControlBoardMoveSample2(){
                return UserControlBoardMoveSample2;
            }
//__________________________________________________________________________________________________________________________
    // potentially good for thousand tours:: Brute Force
    // RandomMove Tour, takes the Knightcount Assigned by the User
        public static void KnightsForRandomMoveTour(int StartRow, int StartCol, int knightCount){ 
                    int TourSuccessCounter=0;
                    int ToursFailedCounter=0;
                    int TotalMoves = 0;
                    double TourSuccessRate =0;
                    double TourFailRate =0;                          
        
                    // Runs the amount of simulations, specified by user, creates a new knight for each one giving each ont
                        for(int i = 0; i<knightCount; i++){   
                            System.out.println(
                                             "#___________________________________#\n"+
                                             "| Knight " + i + " Tour Path               |\n"+
                                             "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n");            
                            Knights knightJester = new Knights(StartRow, StartCol);
                            GameManager.RunRandomMoveSelection(StartRow, StartCol);
                        
                            
                    // Counts how many Tours were Successful
                        if(knightJester.runTour()==true){
                            TourSuccessCounter++;
                            }else{  
                            ToursFailedCounter++;
                            }  
        
                    // Calculates the Success Rates
                        if(TourSuccessCounter != 0)
                           {TourSuccessRate = (knightCount / TourSuccessCounter) * 100;
                            }else{TourSuccessCounter =0;}
        
                    // Calculates the failure Rate
                        if(ToursFailedCounter !=0)
                            {TourFailRate = (knightCount / ToursFailedCounter) * 100;
                             }else{ToursFailedCounter =0;} 
                    
                    // get Total moves made during the simulation
                    totalMoves += knightJester.getMoveCounter();

                    }
        // Get the Success and Failure rates
        System.out.printf(
            "#___________________________________#\n"+
            "|        !!:Overall STATS:!!        |\n"+
            "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n"+
            "|     Tours Successful: " + TourSuccessCounter + "           |\n"+
            "|         Tours Failed: " + ToursFailedCounter +" " + "         |\n"+
            "|   Tours Success Rate: " + TourSuccessRate    + "         |\n"+
            "|   Tours Failure Rate: " + TourFailRate       + "       |\n"+
            "|          Total Moves: " + TotalMoves         + "           |\n"+
            "|          Best Knight:             |\n"+
            "|         Worst Knight:             |\n"+
            "#___________________________________#\n");
        }
        

        // Run Random Move Selection Tour
        public static void RunRandomMoveSelection(int StartRow, int StartCol){ 
            Knights knightJester = new Knights(StartRow, StartCol);          
                knightJester.runTour();     
                knightJester.displayTourPath(knightJester);    
        }    
//__________________________________________________________________________________________________________________________

// Knights Hueristic Tour, Takes the users KnightCount
public static void KnightsForAccessibilityHeuristic(int StartRow, int StartCol, int knightCount){ 
    int TourSuccessCounter=0;
    int ToursFailedCounter=0;
    int TotalMoves = 0;
    double TourSuccessRate =0;
    double TourFailRate =0;                          

    // Runs the amount of simulations, specified by user, creates a new knight for each one giving each ont
        for(int i = 0; i<knightCount; i++){   
            System.out.println(
                             "#___________________________________#\n"+
                             "| Knight " + (i+1) + " Tour Path                |\n"+
                             "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n");            
            KnightsHeuristic GoldenKnightHeuristic = new KnightsHeuristic(StartRow, StartCol);
            GameManager.RunAccessibilityHeuristicTour(StartRow, StartCol);
        
            
    // Counts how many Tours were Successful
        if(GoldenKnightHeuristic.runTour()==true){
            TourSuccessCounter++;
            }else{  
            ToursFailedCounter++;
            }  

    // Calculates the Success Rates
        if(TourSuccessCounter != 0)
           {TourSuccessRate = (knightCount / TourSuccessCounter) * 100;
            }else{TourSuccessCounter =0;}

    // Calculates the failure Rate
        if(ToursFailedCounter !=0)
            {TourFailRate = (knightCount / ToursFailedCounter) * 100;
             }else{ToursFailedCounter =0;} 
            }
    // get Total moves made during the simulation
    }

        // Run Accessibility Hueristic Tour
        public static void RunAccessibilityHeuristicTour(int StartRow, int StartCol){
            KnightsHeuristic GoldenKnightHeuristic = new KnightsHeuristic(StartRow, StartCol);
                GoldenKnightHeuristic.runTour();
                GoldenKnightHeuristic.displayTourPath();
        }
        
//__________________________________________________________________________________________________________________________
        
        // UserControlledTour, takes start position and knightCount:: Knight Count will be used as a tryCount
        public static void KnightsForUserControlledTour(int StartRow, int StartCol, int knightCount){
            int TourSuccessCounter=0;
            int ToursFailedCounter=0;
           
            double TourSuccessRate =0;
            double TourFailRate =0; 


            UserControlledKnight controlledKnight = new UserControlledKnight(StartRow, StartCol);

            for(int i=0; i<knightCount; i++){
                // while(controlledKnight.getAvailableMoves()!= null){
                System.out.println(
                             "#___________________________________#\n"+
                             "| Knight " + (i+1) + ":" + " Move Count: "+ totalMoves +"           |\n"+
                             "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n");
            
                GameManager.RunUserControlledTour(StartRow, StartCol, controlledKnight);
                }
                    // Counts how many Tours were Successful
                    if(controlledKnight.runTour()==true){
                        TourSuccessCounter++;
                    }else{  
                        ToursFailedCounter++;
                    }  
        
                    // Calculates the Success Rates
                    if(TourSuccessCounter != 0){
                        TourSuccessRate = (knightCount / TourSuccessCounter) * 100;
                    }else{
                        TourSuccessCounter =0;
                    }
        
                    // Calculates the failure Rate
                    if(ToursFailedCounter !=0){
                        TourFailRate = (knightCount / ToursFailedCounter) * 100;
                    }else{
                        ToursFailedCounter =0;
                    } 
                
            }
      
        
        public static void RunUserControlledTour(int StartRow, int StartCol, UserControlledKnight controlledKnight){
                   controlledKnight.runTourForUserControlledTour();
            }
        
//__________________________________________________________________________________________________________________________
        // Thousand Knight Tour
        public static void KnightsForThousandKnightsTour(int StartRow, int StartCol, int knightCount){

            int TourSuccessCounter=0;
            int ToursFailedCounter=0;
            double TourSuccessRate =0;
            double TourFailRate =0; 
            int totalMoves=0;

            

            for(int i=0; i<knightCount; i++){
                
                
                System.out.println(
                             "#___________________________________#\n"+
                             "| Knight " + (i+1) + ":" + " Move Count: "+ totalMoves +"           |\n"+
                             "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|\n");

                Knights knightJester = new Knights(StartRow, StartCol);
                GameManager.RunThousandKnightTourBruteForce(StartRow, StartCol, knightJester);
                }
                    // Counts how many Tours were Successful
                    if(knightJester.runTour()==true){
                        TourSuccessCounter++;
                    }else{  
                        ToursFailedCounter++;
                    }  
        
                    // Calculates the Success Rates
                    if(TourSuccessCounter != 0){
                        TourSuccessRate = (knightCount / TourSuccessCounter) * 100;
                    }else{
                        TourSuccessCounter =0;
                    }
                    // totalMoves
                    totalMoves += knightJester.getMoveCounter();

                    // Calculates the failure Rate
                    if(ToursFailedCounter !=0){
                        TourFailRate = (knightCount / ToursFailedCounter) * 100;
                    }else{
                        ToursFailedCounter =0;
                    } 

                    
        }
        // brute force: Thousand TourRunner
        public static void RunThousandKnightTourBruteForce(int startRow, int startCol, Knights knightJester){
           Knights knightJester2 = new Knights(startRow, startCol);
           knightJester2.runTour();
            while(!knightJester2.runTour()){
                knightJester2.resetTour();
            }
            if (knightJester2.runTour()) {
                System.out.println("Tour was succeessful! Total moves:"+ knightJester2.moveCounter);
                knightJester2.displayTourPath(knightJester2);
            }
        }
        
//__________________________________________________________________________________________________________________________

        // GameSetting Display Menu: Board:type and MoveSelect Type
        public static void MoveSelectSettings_BoardSelectSettings(int userMoveSelectSettings){
         // Board Settings & moveSelect Settings Controller 
          switch (userMoveSelectSettings) {
            case 1:
                System.out.println("Your choice was 1");
                Messages.DisplayDefaultSettings1();
                break;

            case 2:
                System.out.println("Your choice was 2");

                break;

            case 3:
                System.out.println("Your choice was 3");
                break;

            default:
                System.out.println("Please Enter Numbers: 1,2,3");
                break;
          }
        }


        
}
