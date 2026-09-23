import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class TicTacToeTester {
    private int board[][];
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
        public class TicTacToeTester() {
            public void TicTacToeTester() {
                int[][] board = new int[3][3];
                for (int row = 0; row < board.length; row++) {
                    for (int col = 0; col < board[row].length; col++) {
                        board[row][col] = empty;
                    }
                }
                for (int row = 0; row < board.length; row++) {
                    for (int col = 0; col < board[row].length; col++) {
                        assertEquals(empty, empty, "The board is empty.");
                    }
                }

            }
        }
        @Test
        public int getCell(int row, int col) {
            int temp;
            if ((0 <= row && row < 3) && (0 <= col && col < 3)) {
                temp = board[row][col];
                assertEquals(temp, empty, "The slot is empty.");
                assertEquals(temp, player_X, "The slot is 0.");
                assertEquals(temp, player_O, "The slot is 1.");
            }
            return board[row][col];
        }
        @Test
        public boolean isValidMove(int row, int col)
        {
            boolean condition = false;
            if(((0<= row && row < 3) && (0<= col && col < 3))&&(board[row][col]==empty))
            {
                assertFalse(condition , "That move is valid");
                return condition;
            }
        }
        @Test
        public boolean placeMove(int row, int col, int player)
        {
            if ((player == player_O) || (player ==player_X))
            {
                if(isValidMove(row,col)==true)
                {
                    board[row][col] = player;
                }
            }
            assertEquals(player, player, "Move was placed");
        }
        @Test
        public int checkRowWin(int row) {
            if (0 <= row && row < 3) {
                for (int row = 0; row < board.length; row++)
                {
                    int temp = 0;
                            int temp1 = 0;
                 for (int col = 0; col < board[row].length; col++)
                 {
                     if(board[row][col] == player_O)
                     {
                         temp++;
                     }
                     if(board[row][col] == player_X)
                     {
                         temp1++;
                     }
                     if(temp == 3)
                     {
                         return player_O;

                     }
                     if(temp1 == 3)
                     {
                         return player_X;
                     }
                     assertEquals(player_X, player_X, "Player_X wins.");
                     assertEquals(player_O, player_O, "Player_O wins.");
                 }
                }
            }
        }
        @Test
        public int checkColWin(int col)
        {
            if (0 <= col && col < 3) {
                for (int col = 0; col < board.length; col++)
                {
                    int temp = 0;
                    int temp1 = 0;
                    for (int row = 0; row < board[col].length; row++)
                    {
                        if(board[row][col] == player_O)
                        {
                            temp++;
                        }
                        if(board[row][col] == player_X)
                        {
                            temp1++;
                        }
                        if(temp == 3)
                        {
                            return player_O;

                        }
                        if(temp1 == 3)
                        {
                            return player_X;
                        }
                        assertEquals(player_X, player_X, "Player_X wins.");
                        assertEquals(player_O, player_O, "Player_O wins.");
                    }
                }
            }
        }
        }
        @Test
        public int checkMainDiagonalWin()
        {

        }
        @Test
        public int checkAntiDiagonalWin()
        {

        }
        @Test
        public int checkWinner()
        {

        }
        @Test
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