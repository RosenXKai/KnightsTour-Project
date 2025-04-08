public class KnightsHeuristic extends Knights {
    static Knights knightJester;
        
        int [][]accessibilityHeuristicBoard;
        
        private static int StartRow;
        private static int StartCol;
            // KnightHueristcKnight :: Takes the accessabilityBoard: 
                static KnightsHeuristic GoldenKnightHeuristic = new KnightsHeuristic(StartRow, StartCol);

                public KnightsHeuristic(int startRow, int starCol) {
                        super(startRow, starCol);
                        this.accessibilityHeuristicBoard = GameManager.accessibilityHeuristicBoard;
                        int knightHeuristicRow = StartRow;
                        int knightHeuristicCol = StartCol;
                        accessibilityHeuristicBoard[knightHeuristicRow][knightHeuristicCol] = 1;
                        }
       
                
                
                // allows accessibility heuristic knights to get accessibility heuristic boards 
                public int[][] getAccessibilityHeuristicBoard(){
                    return accessibilityHeuristicBoard;
                }
        
                // Overides DisplayTourPath For Heuristic Knights  
                public void displayTourPath(){
                    int[][] accessabilityHeuristicBoard = ((KnightsHeuristic) GoldenKnightHeuristic).getAccessibilityHeuristicBoard();
                for(int[] nums: accessabilityHeuristicBoard){
                    for(int n: nums){
                        System.out.printf("%2d ", n);
                    }
                System.out.println();
                }



        }
}
