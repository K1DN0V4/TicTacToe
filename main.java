class Main {
  public static void main(String[] args) {
    
    TicTacToe game = new TicTacToe();

    while(game.endGame() == false){
      game.displayBoard();
      game.playerMove();
    }
    
  }
}
