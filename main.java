import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input;
    int confirm;
    input = new Scanner(System.in);
    TicTacToe game = new TicTacToe();
    System.out.println("Would you like to play? Put in 3 to play and 4 to quit");
    confirm = input.nextInt();
    
    if(confirm == 3){
      while(game.endGame() == false){
      game.displayBoard();
      game.playerMove();
      }
    }
  }
}
