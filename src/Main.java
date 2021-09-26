import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);

        System.out.println("Speler 1 voer uw naam in:");

        String setName = input.next();

        System.out.println("Speler 2 voer uw naam in:");

        String setName2 = input.next();

        Name userNameA = new Name(setName);
        Name userNameB = new Name(setName2);


        Player playerA = new Player(userNameA.getName(), "X");
        Player playerB = new Player(userNameB.getName(), "O");

        Game game = new Game(playerA, playerB);

        Board board = new Board();


        System.out.println("Kies een nummer van 0 - 5");
        System.out.println(" 0  |  1  |  2  |  3  |  4  |  5  |");
        System.out.println("------------------------------------");
        board.setBoard(board.getBoard());


        System.out.println(game.getCurrentPlayer().getPlayer() + " u begint met het spel!");


        while(true) {

            int userInput = input.nextInt();



            game.fourOnOneLine(board.getBoard(), userInput);
            System.out.println("Kies een nummer van 0 - 5");
            System.out.println(" 0  |  1  |  2  |  3  |  4  |  5  |");
            System.out.println("------------------------------------");
            board.setBoard(board.getBoard());
            boolean hasWon = game.gameWinCondition(board.getBoard());
            if (hasWon) {
                System.out.println("Congratulations " + game.getCurrentPlayer().getPlayer() + " has won the game!");
                break;
            }

            game.switchPlayer();

        }



    }

}
