
import java.util.Scanner;

public class test {
    // Constants for board size
    private static final int BOARD_SIZE = 8;

    // Constants for pieces
    private static final char EMPTY = '-';
    private static final char PLAYER_1 = 'X';
    private static final char PLAYER_2 = 'O';

    // The board represented as a 2D array
    private char[][] board;

    // Constructor to initialize the board
    public test() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    // Method to initialize the board with pieces
    private void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if ((i + j) % 2 == 0) {
                    if (i < 3) {
                        board[i][j] = PLAYER_1;
                    } else if (i > 4) {
                        board[i][j] = PLAYER_2;
                    } else {
                        board[i][j] = EMPTY;
                    }
                } else {
                    board[i][j] = EMPTY;
                }
            }
        }
    }

    // Method to display the current state of the board
    private void displayBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to move a piece
    private void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        char piece = board[fromRow][fromCol];
        board[fromRow][fromCol] = EMPTY;
        board[toRow][toCol] = piece;
    }

    // Method to check if a move is valid
    private boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, char player) {
        // Add conditions for valid moves here
        return true; // For simplicity, considering all moves as valid for now
    }

    // Method to start the game
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;
        boolean player1Turn = true;

        while (gameOn) {
            displayBoard();
            char currentPlayer = player1Turn ? PLAYER_1 : PLAYER_2;
            System.out.println("Player " + currentPlayer + "'s turn");

            System.out.print("Enter the row and column of the piece to move (e.g., 2 3): ");
            int fromRow = scanner.nextInt();
            int fromCol = scanner.nextInt();

            System.out.print("Enter the row and column to move the piece to (e.g., 3 4): ");
            int toRow = scanner.nextInt();
            int toCol = scanner.nextInt();

            if (isValidMove(fromRow, fromCol, toRow, toCol, currentPlayer)) {
                movePiece(fromRow, fromCol, toRow, toCol);
                player1Turn = !player1Turn;
            } else {
                System.out.println("Invalid move. Try again.");
            }

            // Add conditions for game end here
        }

        scanner.close();
    }

    public static void main(String[] args) {
        test game = new test();
        game.play();
    }
}