import java.util.Scanner;

public class TicTacToe {

  //instance variables
  private char [][] board;
  private char player;
  private Scanner input;
  private boolean gameOver;


  
  //*********************************************************
  public TicTacToe() {

    board = new char[3][3];

    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[0].length; col++) {
        board[row][col] = ' ';
      }
    }
    player = 'X';
    input = new Scanner(System.in);
  } //end TicTacToe()
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
      System.out.println("Player " + player + " where to move (row)?");
      r = input.nextInt();
      System.out.println("Player " + player + " where to move (column)?");
      c = input.nextInt();
      canMove = checkMove(r, c);
      }

    if (player == 'X') {
      board[r][c] = 'X';
      if(isWinner()) {
        System.out.println("Game over! Player " + player + "wins!");
        gameOver = true;
      }
      player = 'O';
      }
    else {
      board[r][c] = 'O';
      if(isWinner()) {
        System.out.println("Game over! Player " + player + "wins!");
        gameOver = true;
      }
      player = 'X';
    }
    
  } //end playerMove()
  //*********************************************************
  

  
  //*********************************************************
  public boolean checkMove(int r, int c){

    if(board[r][c] == ' '){
      return true;
    }
    else if(board[r][c] == player) {
      System.out.println("You already moved there.");
      return false;
    }
    else {
      System.out.println("The other player already moved there.");
      return false;
      }
  } //end checkMove()

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
  }

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
  }
  //*********************************************************



  //*********************************************************
  public boolean endGame() {
    gameOver = false;
    
    /*if(isWinner() == true) {
      System.out.println("Player " + player + " wins!");
      gameOver = true;
    }*/
    
    return gameOver;
  }
  //*********************************************************
  
}//end TicTacToe
