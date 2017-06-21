package edu.purdue.anjalimalik;

/**
 * Created by anjalimalik
 */
import java.util.Random;
import java.util.Scanner;

public class TwentyFortyEight {


    private int[][] board; 	//This instance variable represents the board. Use this to make changes.
    private int score; 		//This variable keeps track of the current score.
    private int boardWidth;

    //Constructor
    public TwentyFortyEight(int boardWidth){

        this.boardWidth = boardWidth;
        reset();
    }

    //This function resets the board to its initial state
    public void reset() {
        board = new int[boardWidth][boardWidth];
        score = 0;
        placeRandom();
    }

    //This function returns the total number of blank spaces on the board
    public int numBlanks() {
        int blankCount = 0;
        for(int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardWidth; j++){
                if (board[i][j] == 0) {
                    blankCount++;
                }
            }
        }

        return blankCount;
    }

    //This function places a 2 at a random blank space on the board.
    //It does nothing if there are no blank spaces.
    public void placeRandom(){
        int blanks = numBlanks();
        if (blanks != 0) {
            while(true) {
                Random random = new Random();
                int num_x = random.nextInt(boardWidth);
                int num_y = random.nextInt(boardWidth);
                // Check if coordinate already full
                if (board[num_x][num_y] == 0) {
                    board[num_x][num_y] = 2;
                    break;
                }
            }
        }

    }

    //This function attempts to move a cell at coordinates fromRow,fromCol to
    //the cell toRow,toCol. Refer to the handout for movement rules.
    public boolean moveTo(int fromRow, int fromCol, int toRow, int toCol) {
        // Check Out of Bounds Error
        if (fromRow < 0 || fromRow > (boardWidth-1)) { return false;}
        if (fromCol < 0 || fromCol > (boardWidth-1)) { return false;}
        if (toRow < 0 || toRow > (boardWidth-1)) { return false;}
        if (toCol < 0 || toCol > (boardWidth-1)) { return false;}
        // Check if on same Row or same Column (Not on same line)
        if ((fromRow != toRow) && (fromCol != toCol)) { return false; }
        // Check if Adjacent
        if (Math.abs(toRow - fromRow) > 1 || Math.abs(toCol - fromCol) > 1) { return false;}
        // Check if From Piece is Zero
        if (board[fromRow][fromCol] == 0) {return false;}
        // Check if To cell is 0
        if (board[toRow][toCol] == 0) {
            board[toRow][toCol] = board[fromRow][fromCol];
            board[fromRow][fromCol] = 0;
            return true;
        }
        // If From and To Piece have same values
        if (board[fromRow][fromCol] == board[toRow][toCol]) {
            board[toRow][toCol] = 2* board[toRow][toCol];
            board[fromRow][fromCol] = 0;
            return true;
        }
        // Otherwise if cell values are not equal and greater than 0
        return false;
    }

    //The following four functions move the board in a single direction.
    public boolean moveUp(){
        boolean oneMoveMade = false;
        for(int i = 1 ; i< boardWidth; i++) {
            for(int j = 0; j < boardWidth; j++) {
                boolean moved = moveTo(i, j, 0, j);
                if (moved) { oneMoveMade = true;}
            }
        }
        update_score();
        if (oneMoveMade) {
            return true;
        }
        return false;
    }

    public boolean moveDown() {
        boolean oneMoveMade = false;
        for(int i = boardWidth-2; i>=0; i--) {
            for(int j = 0; j < boardWidth; j++) {
                boolean moved = moveTo(i, j, boardWidth-1, j);
                if (moved) { oneMoveMade = true;}
            }
        }
        update_score();
        if (oneMoveMade) {
            return true;
        }
        return false;
    }

    public boolean moveRight() {
        boolean oneMoveMade = false;
        for(int j = boardWidth-2; j>=0; j--) {
            for(int i = 0; i < boardWidth; i++) {
                boolean moved = moveTo(i, j, i, boardWidth-1);
                if (moved) { oneMoveMade = true;}
            }
        }
        update_score();
        if (oneMoveMade) {
            return true;
        }
        return false;
    }

    public boolean moveLeft() {
        boolean oneMoveMade = false;
        for(int j = 1; j < boardWidth; j++) {
            for(int i = 0; i < boardWidth; i++) {
                boolean moved = moveTo(i, j, i, 0);
                if (moved) { oneMoveMade = true;}
            }
        }
        update_score();
        if (oneMoveMade) {
            return true;
        }
        return false;

    }

    public void update_score() {
        // Finding Maximum Number on the Board
        for (int i = 0; i < boardWidth; i++) {
            for (int j = 0; j < boardWidth; j++) {
                if (board[i][j] > score) {
                    score = board[i][j];
                }
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////
    // Do not edit the methods below, they are for testing and running the
    // program.
    ////////////////////////////////////////////////////////////////////////
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] newBoard) {
        board = newBoard;
    }


    /**
     * The main will allow you to play the game.
     *
     * @param args
     */
    public static void main(String args[]) {
        TwentyFortyEight tfe = new TwentyFortyEight(4);


        Scanner s = new Scanner(System.in);
        int bestScore = 0;
        boolean resetFlag = false;

        while(true) {
            System.out.println("Current score: " + tfe.getScore() + " | Best score: " + bestScore);
            tfe.showBoard();

            System.out.println("Enter up, down, left or right to move in that direction.");
            System.out.println("Enter reset to reset the game or quit to exit.");
            String line = s.nextLine();

            switch(line){
                case "up":
                    while(tfe.moveUp()){
                        // do nothing
                    }
                    break;
                case "down":
                    while(tfe.moveDown()){
                        // do nothing
                    }
                    break;
                case "left":
                    while(tfe.moveLeft()){
                        // do nothing
                    }
                    break;
                case "right":
                    while(tfe.moveRight()){
                        // do nothing
                    }
                    break;
                case "reset":
                    tfe.reset();
                    resetFlag = true;
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Invalid move, Please try again!!!!\n");
                    continue;

            }

            bestScore = Math.max(bestScore, tfe.getScore());
            if(!resetFlag) {
                tfe.placeRandom();
                resetFlag = false;
            }
        }
    }



    public void showBoard() {
        for(int x = 0; x < boardWidth * 6 + 1; x++){
            System.out.print("-");
        }
        System.out.println();

        for(int x = 0; x < boardWidth; x++) {
            for(int y = 0; y < boardWidth; y++) {
                String square = (board[x][y] == 0)? "":board[x][y] + "";
                System.out.printf("|%5s", square);
            }
            System.out.println("|");

            for(int y = 0; y < boardWidth * 6 + 1; y++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public int getScore() {
        return score;
    }

}
