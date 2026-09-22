import org.junit.jupiter.api.Nested;

public class TicTacToeTester {
    public int empty = 0;
    public int player_X = 1;
    public int player_O = 2;
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
        public TicTacToeBoard()
        {
            int[][] board = new int [3][3];
        }
        public int getCell(int row, int col)
        {
            return 20;
        }
        public boolean placeMove(int row, int col)
        {
            return false;
        }
        public boolean isValidMove(int row, int col, int player)
        {
            return true;
        }
        public int checkRowWin(int row)
        {
            return 18;
        }
        public int checkColWin(int col)
        {
            return 13;
        }
        public int checkMainDiagonalWin()
        {
            return 25;
        }
        public int checkAntiDiagonalWin()
        {
            return 11;
        }
        public int checkWinner()
        {
            return 4;
        }
        public boolean isFull()
        {
            return false;
        }
        public void displayBoard()
        {

        }
        public void resetBoard()
        {

        }
        @Nested
        public class TicTacToeTester()
        {
            public void TicTacToeTester()
            {
                int[][] board = new int [3][3];
                        for (int row=0; row < board.length; row++) {
                            for (int col=0; col < board[row].length; col++)
                            {
                                board[row][col] = 3;
                            }
                        }
            }
        }
        public int getCell(int row, int col)
        {

        }
        public boolean placeMove(int row, int col)
        {

        }
        public boolean isValidMove(int row, int col, int player)
        {

        }
        public int checkRowWin(int row)
        {

        }
        public int checkColWin(int col)
        {

        }
        public int checkMainDiagonalWin()
        {

        }
        public int checkAntiDiagonalWin()
        {

        }
        public int checkWinner()
        {

        }
        public boolean isFull()
        {

        }
        public void displayBoard()
        {

        }
        public void resetBoard()
        {

        }
}