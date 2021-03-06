import java.util.Scanner;

public class TicTacToe {

  //instance variables
  private char [][] board;
  private char player;
  private Scanner input;
  private boolean gameOver;


  
  //*********************************************************
  public TicTacToe(char player) {

    board = new char[3][3];
    gameOver = false;

    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[0].length; col++) {
        board[row][col] = ' ';
      }
    }
    this.player = player;
    input = new Scanner(System.in);
  } //end TicTacToe()
  //*********************************************************



  //*********************************************************
  public void clearBoard() {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[0].length; col++) {
        board[row][col] = ' ';
      }
    }
  } //end clearBoard()
  //*********************************************************


  
  //*********************************************************
  public void displayBoard() {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[0].length; col++) {
        System.out.print(board[row][col]);
        if(col < 2) {
          System.out.print("|");
        }
      }
      System.out.println();
    }
  } //end displayBoard()
  //*********************************************************

  
  //*********************************************************
  public void playerMove(){
    int r = 0, c = 0;
    boolean canMove = false;

    while(!canMove){
      System.out.println("Player " + player + " where to move (row)? If you would like to quit put 4 for both row and column");
      r = input.nextInt();
      System.out.println("Player " + player + " where to move (column)? If you would like to quit put 4 for both row and column");
      c = input.nextInt();
      canMove = checkMove(r, c);
      }
    if( gameOver ){
      System.out.println("Thanks for playing!");
    }
    else if (player == 'X') {
      board[r][c] = 'X';
      if(!(r == 4) && (c == 4)){
        board[r][c] = 'X';
      }
      if(isWinner()) {
        gameOver = true;
        System.out.println("Game over! Player " + player + " wins!");
      }
      player = 'O';
      }
    else {
      board[r][c] = 'O';
      if(isWinner()) {
        gameOver = true;
        System.out.println("Game over! Player " + player + " wins!");
      }
      player = 'X';
    }
  } //end playerMove()
  //*********************************************************
  

  
  //*********************************************************
  public boolean checkMove(int r, int c) {

    //int row = r;
    //int column = c;

    if((r < 0) || (r > 2) || (c < 0) || (c > 2)) {
      if((r == 4) && (c == 4)) {
        gameOver = true;
        return gameOver;
      }
      System.out.println("That move is invalid, please try again in the range of 0 - 2");
      return false;
      
    }
    else if(board[r][c] == ' '){
      return true;
    }
    else if(board[r][c] == player) {
      System.out.println("You already moved there.");
      return false;
    }
    else if(isFull()){
      return gameOver;
    }
    else {
      System.out.println("The other player already moved there.");
      return false;
      }
  } //end checkMove()
  //*********************************************************

  
  
  //*********************************************************
  public boolean checkRows() {
    for(int rows = 0; rows < board.length; rows++) {
      if ((board[rows][0] == player) && (board[rows][1] == player) && (board[rows][2] == player)) {
        return true;
      }
    }
    return false;
  } //end checkRows()
  //*********************************************************



  //*********************************************************
  public boolean isWinner() {
    if (checkRows())
      return true;
    if (checkCols())
      return true;
    if (checkDiag())
      return true;
    return false;
  } //end isWinner()
  //*********************************************************

  

  //*********************************************************
  public boolean checkCols() {
    for(int cols = 0; cols < board.length; cols++) {
      if((board[0][cols] == player) && (board[1][cols] == player) && (board[2][cols] == player)) {
        return true;
      }
    }
    return false;
  } //end checkCols()
  //*********************************************************



  //*********************************************************
  public boolean checkDiag() {
    if((board[0][0] == player) && (board[1][1] == player) && (board[2][2] == player)) {
      return true;
    }
    if((board[2][2] == player) && (board[1][1] == player) && (board[0][0] == player)) {
      return true;
    }
    return false;
  } //end checkDiag()
  //*********************************************************



  //*********************************************************
  public boolean isFull() {
    
    int count = 0;
    
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[0].length; col++) {
        if((board[row][col] == 'X') || (board[row][col] == 'O')) {
          count++;
          if(count == 9){
            gameOver = true;
            return gameOver;
          }
        }
      }
    }
    return false;
  } //end isFull()
  //*********************************************************



  //*********************************************************
  public boolean endGame() { 
    return gameOver;
    //return replayGame();
  } //end endGame()
  //*********************************************************



  //*********************************************************
  public boolean replayGame() {
    int replayName;

    System.out.println("Would you like to play again? 3 for yes 4 for no");
    replayName = input.nextInt();
    //input.nextLine();

    if(replayName == 3) {
      gameOver = false;
      clearBoard();
    }
    return gameOver;
  } //end replayGame()
  //*********************************************************

}//end TicTacToe
