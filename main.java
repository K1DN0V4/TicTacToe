import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input;
    int confirm;
    String player;
    char player2;
    input = new Scanner(System.in);
    TicTacToe game;
    boolean again = false;
    
    /*System.out.println("Would you like to play? Put in 3 to play and 4 to quit");
    confirm = input.nextInt();
    input.nextLine();*/
    System.out.println("Would you like to use X or O? Input a single character to choose");
    player = input.nextLine();
    player = player.substring(0,1).toUpperCase();
    player2 = player.charAt(0);

    game = new TicTacToe(player2);
    
      while((game.endGame() == false)) {
        game.displayBoard();
        game.playerMove();
      }
      System.out.println("Would you like to play again? Put in 3 to play and 4 to quit");
      confirm = input.nextInt();
    input.nextLine();
    if(confirm == 3) {
      again = true;
      game.clearBoard();
      while(again != false) {
        game.displayBoard();
        game.playerMove();
      }
      System.out.println("Would you like to play again? Put in 3 to play and 4 to quit");
      confirm = input.nextInt();
    }
  }
}
