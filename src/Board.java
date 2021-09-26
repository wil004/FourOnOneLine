public class Board {

    private Field[] board;

    public Board() {
        this.board = new Field[36];
        for (int i = 0; i < 36; i++) {
            this.board[i] = new Field ("*");

        }
    }

    public void setBoard(Field[] board) {
        for (int i = 0; i < board.length; i ++) {
            System.out.print(board[i].getField());
            for (int j = 0; j < 1; j++) {

                System.out.print("  |  ");


            }

            if ((i + 1) % 6 == 0) {
                System.out.println("");
            }
        }
    }

    public Field[] getBoard() {
        return this.board;
    }


}