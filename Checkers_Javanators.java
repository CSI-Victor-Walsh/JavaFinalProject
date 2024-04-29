// Castle Siege
// Java 2024
//Game Logic Branch

// Javanators
// By: Juan Pablo Jiménez, Víctor Walsh, Javier Ramis


import java.util.Scanner;
import java.util.Random;


public class Checkers_Javanators {

    static final char EMPTY = '-';
    static final char cRED = 'R';
    static final char cBLACK = 'B';
    static char[][] board = new char[8][8];
    static boolean isRedTurn = true; // Red goes first

    public static void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    if (i < 3) {
                        board[i][j] = cRED;
                    } else if (i > 4) {
                        board[i][j] = cBLACK;
                    } else {
                        board[i][j] = EMPTY;
                    }
                } else {
                    board[i][j] = EMPTY;
                }
            }
        }
    }

    public static void printBoard() {
        //TODO: YOUR CODE HERE

        System.out.println("\n");

        System.out.println("----- YOUR BOARD HERE-----");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidMove(int row1, int col1, int row2, int col2) {
        //return false if the numbers entered are invalid
        if ((row1 < 0) || (row1 > 7) || (col1 < 0) || (row2 < 0) || (col2 < 0) || (col1 > 7) || (row2 > 7) || (col2 > 7)) {
            return false;
        }
        
        //Make sure there is a piece in the space the user wants to move 
        if (board[row1][col1] == EMPTY ) {
            println("Space is empty, please try again");
            return false;
        }

        if ((isRedTurn) == true && board[row1][col1] == cBLACK) {
            println("Space is taken by another piece, please try again");
            return false;
        }

        if ((isRedTurn) == false && board[row1][col1] == cRED) {
            println("Space is taken by another piece, please try again");
            return false;
        }

        //If its red's turn and the piece to be moved is red, accept the move
        if ((isRedTurn) == true && board[row1][col1] == cRED) {
            return true;
        }

        if ((isRedTurn) == false && board[row1][col1] == cBLACK) {
            return true;
        }

        return true;
    }

    public static void makeMove(int row1, int col1, int row2, int col2) {
        //Find the piece the user entered
    }

    public static void playGame(){

        //TODO: MODIFY TEMPLATE CODE

        Scanner scanner = new Scanner(System.in);

        while (true) {

            printBoard();

            if (isRedTurn) {
                System.out.println("Red's turn");
            } else {
                System.out.println("Black's turn");
            }

            System.out.print("Enter move (row1 col1 row2 col2): ");
            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();
            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();

            if (isValidMove(row1, col1, row2, col2) == true) {
                makeMove(row1, col1, row2, col2);
            } 
            else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    
    public static void main(String[] args) {
        //Initial set up

        //Variables
        //Variable for the user's choice
        int userMode = 0;
        int p1Wins = 0;
        int p2Wins = 0;
        //Introduce the game with animations
        do {
            //Allow the user to choose to play against a human or against an "AI"
            println("Select a game mode");
            println("1. vs Human");
            println("2. vs AI");
            println("0. Quit");
    
            Scanner uScanner = new Scanner(System.in);
    
            print("\nPlease select an option: ");
            userMode = uScanner.nextInt();
    
            clearScreen();
            
            //Human Opponent
            if (userMode == 1) {
                println("\n\nWelcome to Trick-Trap-Throw! \nPlease enter your name");
                // Prompt the user to enter their name
                print("Player 1: ");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
        
                // Extract the first letter of the name
                char firstLetter = name.charAt(0);
        
                // Print the first letter of the name
                println("The letter of your name that will be used is: " + firstLetter+"\n");
        
                // Prompt the user to enter their name
                System.out.print("Player 2: ");
                String name2 = scanner.nextLine();
        
                // Extract the first letter of the name
                char firstLetter2 = name2.charAt(0);
        
                //Warn the second user if their initial is the same as the first user
                while(String.valueOf(firstLetter).equals(String.valueOf(firstLetter2))) {
                    println("That initial is already taken, please type another one");
                    // Prompt the user to enter their name
                    System.out.print("Enter Player 2 name: ");
                    name2 = scanner.nextLine();
        
                    // Extract the first letter of the name
                    firstLetter2 = name2.charAt(0);
                }
        
                //Variables for storing the player's initials
                String p1 = String.valueOf(firstLetter);
                String p2 = String.valueOf(firstLetter2);
        
                // Print the first letter of the name
                println("The letter of your name that will be used is: " + firstLetter2+"\n");
        
                //Ask the user to choose a color
                // Menu for colors
                println("\n"+name+", please choose your color : ");
                println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
                println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
                println("Press 3 for "+RED+" RED "+RESET+": ");
                println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
                println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
                int p1Col = scanner.nextInt();
        
                //Deal with out of range inputs
                while ((p1Col < 1) || (p1Col > 5)) {
                    println("That number does not correspond to a color. Please select another one");
                    println("\n"+name+", please choose your color : ");
                    println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
                    println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
                    println("Press 3 for "+RED+" RED "+RESET+": ");
                    println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
                    println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
                    p1Col = scanner.nextInt();
                }
        
                //Change the user's character depending on their option
                switch(p1Col) {
                    case 1:
                        p1 = BLUE+firstLetter+RESET;
                        break;
                    case 2:
                        p1 = YELLOW+firstLetter+RESET;
                        break;
                    case 3:
                        p1 = RED+firstLetter+RESET;
                        break;
                    case 4:
                        p1 = PURPLE+firstLetter+RESET;
                        break;
                    case 5:
                        p1 = GREEN+firstLetter+RESET;
                        break;
                }
        
                println("\n"+name+"'s character is "+p1);
        
                // Menu for colors
                println("\n"+name2+", please choose your color : ");
                println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
                println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
                println("Press 3 for "+RED+" RED "+RESET+": ");
                println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
                println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
                int p2Col = scanner.nextInt();
        
                //Deal with out of range inputs
                while ((p2Col < 1) || (p2Col > 5)) {
                    println("That number does not correspond to a color. Please select another one");
                    println("\n"+name+", please choose your color : ");
                    println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
                    println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
                    println("Press 3 for "+RED+" RED "+RESET+": ");
                    println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
                    println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
                    p2Col = scanner.nextInt();
                }
        
                //Change the user's character depending on their option
                switch(p2Col) {
                    case 1:
                        p2 = BLUE+firstLetter2+RESET;
                        break;
                    case 2:
                        p2 = YELLOW+firstLetter2+RESET;
                        break;
                    case 3:
                        p2 = RED+firstLetter2+RESET;
                        break;
                    case 4:
                        p2 = PURPLE+firstLetter2+RESET;
                        break;
                    case 5:
                        p2 = GREEN+firstLetter2+RESET;
                        break;
                }
        
                //Warn the user if the color they selected is the same as the other user
                while(p1Col == p2Col) {
                    println("\nThat color is already taken. Please choose another one");
                    // Menu for colors
                    println("\n"+name2+", please choose your color : ");
                    println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
                    println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
                    println("Press 3 for "+RED+" RED "+RESET+": ");
                    println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
                    println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
                    p2Col = scanner.nextInt();
        
                    //Deal with out of range inputs
                    while ((p2Col < 1) || (p2Col > 5)) {
                        println("That number does not correspond to a color. Please select another one");
                        println("\n"+name2+", please choose your color : ");
                        println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
                        println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
                        println("Press 3 for "+RED+" RED "+RESET+": ");
                        println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
                        println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
                        p2Col = scanner.nextInt();
                    }
        
                    switch(p2Col) {
                        case 1:
                            p2 = BLUE+firstLetter2+RESET;
                            break;
                        case 2:
                            p2 = YELLOW+firstLetter2+RESET;
                            break;
                        case 3:
                            p2 = RED+firstLetter2+RESET;
                            break;
                        case 4:
                            p2 = PURPLE+firstLetter2+RESET;
                            break;
                        case 5:
                            p2 = GREEN+firstLetter2+RESET;
                            break;
                    }
                }
        
                println("\n"+name2+"'s character is "+p2);
        
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();


        System.out.println("------------CHECKERS----------");

        //Initial set up

        initializeBoard();

        //Start the game
        playGame();
}
while (userMode == 2) {
    println("");
    println("\n\nWelcome to Trick-Trap-Throw! \nPlease enter your name");
    // Prompt the user to enter their name
    print("Player 1: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    // Extract the first letter of the name
    char firstLetter = name.charAt(0);

    // Print the first letter of the name
    println("The letter of your name that will be used is: " + firstLetter+"\n");
    
    //Variables for storing the player's initials
    String p1 = String.valueOf(firstLetter);

    //Ask the user to choose a color
    // Menu for colors
    println("\n"+name+", please choose your color : ");
    println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
    println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
    println("Press 3 for "+RED+" RED "+RESET+": ");
    println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
    println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
    int p1Col = scanner.nextInt();

    //Deal with out of range inputs
    while ((p1Col < 1) || (p1Col > 5)) {
        println("That number does not correspond to a color. Please select another one");
        println("\n"+name+", please choose your color : ");
        println("Press 1 for "+BLUE+" BLUE "+RESET+": ");
        println("Press 2 for "+YELLOW+" YELLOW "+RESET+": ");
        println("Press 3 for "+RED+" RED "+RESET+": ");
        println("Press 4 for "+PURPLE+" PURPLE "+RESET+": ");
        println("Press 5 for "+GREEN+" GREEN "+RESET+": ");
        p1Col = scanner.nextInt();
    }

    //Change the user's character depending on their option
    switch(p1Col) {
        case 1:
            p1 = BLUE+firstLetter+RESET;
            break;
        case 2:
            p1 = YELLOW+firstLetter+RESET;
            break;
        case 3:
            p1 = RED+firstLetter+RESET;
            break;
        case 4:
            p1 = PURPLE+firstLetter+RESET;
            break;
        case 5:
            p1 = GREEN+firstLetter+RESET;
            break;
    }

    println("\n"+name+"'s character is "+p1);

    //Choose a random name for the AI opponent
    Random rand = new Random();
    int randNum = rand.nextInt(9);
    String aiName = " ";
    switch (randNum) {
        case 0:
            aiName = "James";
            break;
        case 1:
             aiName = "Kerry";
            break;
        case 2:
             aiName = "Tom";
            break;
        case 3:
             aiName = "Dave";
            break;
        case 4:
             aiName = "Chuck";
            break;
        case 5:
             aiName = "Lars";
            break;
        case 6:
             aiName = "Max";
            break;
        case 7:
             aiName = "Iggor";
            break;
        case 8:
             aiName = "Phil";
            break;
        case 9:
             aiName = "Scott";
            break;  
    }
    // Extract the first letter of the name
    char firstLetter2 = aiName.charAt(0);
    String aiNameLow = String.valueOf(Character.toLowerCase(firstLetter2));

    //Run if the AI's initial is the same as the first user
     if((String.valueOf(firstLetter).equals(String.valueOf(firstLetter2))) ||  (String.valueOf(firstLetter).equals(aiNameLow))) {
        while((String.valueOf(firstLetter).equals(String.valueOf(firstLetter2))) ||  (String.valueOf(firstLetter).equals(aiNameLow))) {
            randNum = rand.nextInt(10);
            switch (randNum) {
                case 0:
                    aiName = "James";
                    break;
                case 1:
                     aiName = "Kerry";
                    break;
                case 2:
                     aiName = "Tom";
                    break;
                case 3:
                     aiName = "Dave";
                    break;
                case 4:
                     aiName = "Chuck";
                    break;
                case 5:
                     aiName = "Lars";
                    break;
                case 6:
                     aiName = "Max";
                    break;
                case 7:
                     aiName = "Iggor";
                    break;
                case 8:
                     aiName = "Phil";
                    break;
                case 9:
                     aiName = "Scott";
                    break;  
            }
            println("Your opponent is: "+aiName);
            break;
        }
        
    println("Your opponent is: "+aiName);
    try {
        Thread.sleep(1000);
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
    clearScreen();
}
    if (userMode > 2) {
        println(RED+"Invalid number, please try again\n"+RESET);
    }
    while (userMode != 0) {
    println("\nGOODBYE!");
    }
 
    } 
    } while (userMode != 0);
    }
     

    //Start the game with the animation

    //Miscellaneous Methods
    //ANSI Escape Codes
        //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println 
        public static final String RESET = "\u001B[0m";
        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
        public static final String BLACK_BG = "\u001B[40m";
        public static final String RED_BG = "\u001B[41m";
        public static final String GREEN_BG = "\u001B[42m";
        public static final String YELLOW_BG = "\u001B[43m";
        public static final String BLUE_BG = "\u001B[44m";
        public static final String PURPLE_BG = "\u001B[45m";
        public static final String CYAN_BG = "\u001B[46m";
        public static final String WHITE_BG = "\u001B[47m";

        public static void print(String msg){
            System.out.print(msg);
        }
    
        public static void println(String msg){
            System.out.println(msg);
        }

    //clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

