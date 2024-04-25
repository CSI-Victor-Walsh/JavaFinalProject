/*  CSI Checkers 2024
* Below you will find a template for creating your Checkers game.

* TO-DO comments:
* Notice the "TO-DO" (without the '-') code comments, so that you may keep track of the code that is left to
* be written. To see the list of TO-DO comments, go to View -> Tool Windows -> TO-DO.
* Make sure to remove the TO-DO (without the '-') word when the code implementation in
* that section of code has been completed
*
* The DEBUGGER is a powerful tool for troubleshooting your code, especially for logical errors. ]
*    Use it while you can!
*
* Make sure to personalize this Checkers game app.
*
* Happy coding!!!
*
* Template provided by prof. Reynaldo Belfort, S.J.
* */

//TODO: ^^^ Remove the comments above ^^^


//TODO << YOUR TEAM NAME HERE >>
    //TODO << YOUR TEAM MEMBERS HERE >>


import java.util.Scanner;

public class Checkers_Javanators {

    static final char EMPTY = '-';
    static final char RED = 'R';
    static final char BLACK = 'B';
    static char[][] board = new char[8][8];
    static boolean isRedTurn = true; // Red goes first

    public static void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    if (i < 3) {
                        board[i][j] = RED;
                    } else if (i > 4) {
                        board[i][j] = BLACK;
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
        //TODO: YOUR CODE HERE
        return true;
    }

    public static void makeMove(int row1, int col1, int row2, int col2) {
        //TODO: YOUR CODE HERE
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

            if (isValidMove(row1, col1, row2, col2)) {

                makeMove(row1, col1, row2, col2);
                

            } else {
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
        clearScreen();
        try {
            Thread.sleep(300); //pause this Java app for 300ms
            println(" ___   _____    _      _         _____                   _____ _                          ___ ");
            Thread.sleep(300); //pause this Java app for 300ms
            println("|  _| |_   _|  (_)    | |       |_   _|                 |_   _| |                        |_  |");
            Thread.sleep(300); //pause this Java app for 300ms
            println("| |     | |_ __ _  ___| | ________| |_ __ __ _ _ __ ______| | | |__  _ __ _____      __    | |");
            Thread.sleep(300); //pause this Java app for 300ms
            println("| |     | | '__| |/ __| |/ /______| | '__/ _` | '_ \\______| | | '_ \\| '__/ _ \\ \\ /\\ / /    | |");
            Thread.sleep(300); //pause this Java app for 300ms
            println("| |     | | |  | | (__|   <       | | | | (_| | |_) |     | | | | | | | | (_) \\ V  V /     | |");
            Thread.sleep(300); //pause this Java app for 300ms
            println("| |_    \\_/_|  |_|\\___|_|\\_\\      \\_/_|  \\__,_| .__/      \\_/ |_| |_|_|  \\___/ \\_/\\_/     _| |");
            Thread.sleep(300); //pause this Java app for 300ms
            println("|___|                                         | |                                        |___|");
            Thread.sleep(300); //pause this Java app for 300ms
            println("                                              |_|                                       ");
            Thread.sleep(300); //pause this Java app for 300ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
            println("Press 1 for "+ANSI_BLUE+" BLUE "+ANSI_RESET+": ");
            println("Press 2 for "+ANSI_YELLOW+" YELLOW "+ANSI_RESET+": ");
            println("Press 3 for "+ANSI_RED+" RED "+ANSI_RESET+": ");
            println("Press 4 for "+ANSI_PURPLE+" PURPLE "+ANSI_RESET+": ");
            println("Press 5 for "+ANSI_GREEN+" GREEN "+ANSI_RESET+": ");
            int p1Col = scanner.nextInt();
    
            //Deal with out of range inputs
            while ((p1Col < 1) || (p1Col > 5)) {
                println("That number does not correspond to a color. Please select another one");
                println("\n"+name+", please choose your color : ");
                println("Press 1 for "+ANSI_BLUE+" BLUE "+ANSI_RESET+": ");
                println("Press 2 for "+ANSI_YELLOW+" YELLOW "+ANSI_RESET+": ");
                println("Press 3 for "+ANSI_RED+" RED "+ANSI_RESET+": ");
                println("Press 4 for "+ANSI_PURPLE+" PURPLE "+ANSI_RESET+": ");
                println("Press 5 for "+ANSI_GREEN+" GREEN "+ANSI_RESET+": ");
                p1Col = scanner.nextInt();
            }
    
            //Change the user's character depending on their option
            switch(p1Col) {
                case 1:
                    p1 = ANSI_BLUE+firstLetter+ANSI_RESET;
                    break;
                case 2:
                    p1 = ANSI_YELLOW+firstLetter+ANSI_RESET;
                    break;
                case 3:
                    p1 = ANSI_RED+firstLetter+ANSI_RESET;
                    break;
                case 4:
                    p1 = ANSI_PURPLE+firstLetter+ANSI_RESET;
                    break;
                case 5:
                    p1 = ANSI_GREEN+firstLetter+ANSI_RESET;
                    break;
            }
    
            println("\n"+name+"'s character is "+p1);
    
            // Menu for colors
            println("\n"+name2+", please choose your color : ");
            println("Press 1 for "+ANSI_BLUE+" BLUE "+ANSI_RESET+": ");
            println("Press 2 for "+ANSI_YELLOW+" YELLOW "+ANSI_RESET+": ");
            println("Press 3 for "+ANSI_RED+" RED "+ANSI_RESET+": ");
            println("Press 4 for "+ANSI_PURPLE+" PURPLE "+ANSI_RESET+": ");
            println("Press 5 for "+ANSI_GREEN+" GREEN "+ANSI_RESET+": ");
            int p2Col = scanner.nextInt();
    
            //Deal with out of range inputs
            while ((p2Col < 1) || (p2Col > 5)) {
                println("That number does not correspond to a color. Please select another one");
                println("\n"+name+", please choose your color : ");
                println("Press 1 for "+ANSI_BLUE+" BLUE "+ANSI_RESET+": ");
                println("Press 2 for "+ANSI_YELLOW+" YELLOW "+ANSI_RESET+": ");
                println("Press 3 for "+ANSI_RED+" RED "+ANSI_RESET+": ");
                println("Press 4 for "+ANSI_PURPLE+" PURPLE "+ANSI_RESET+": ");
                println("Press 5 for "+ANSI_GREEN+" GREEN "+ANSI_RESET+": ");
                p2Col = scanner.nextInt();
            }
    
            //Change the user's character depending on their option
            switch(p2Col) {
                case 1:
                    p2 = ANSI_BLUE+firstLetter2+ANSI_RESET;
                    break;
                case 2:
                    p2 = ANSI_YELLOW+firstLetter2+ANSI_RESET;
                    break;
                case 3:
                    p2 = ANSI_RED+firstLetter2+ANSI_RESET;
                    break;
                case 4:
                    p2 = ANSI_PURPLE+firstLetter2+ANSI_RESET;
                    break;
                case 5:
                    p2 = ANSI_GREEN+firstLetter2+ANSI_RESET;
                    break;
            }
    
            //Warn the user if the color they selected is the same as the other user
            while(p1Col == p2Col) {
                println("\nThat color is already taken. Please choose another one");
                // Menu for colors
                println("\n"+name2+", please choose your color : ");
                println("Press 1 for "+ANSI_BLUE+" BLUE "+ANSI_RESET+": ");
                println("Press 2 for "+ANSI_YELLOW+" YELLOW "+ANSI_RESET+": ");
                println("Press 3 for "+ANSI_RED+" RED "+ANSI_RESET+": ");
                println("Press 4 for "+ANSI_PURPLE+" PURPLE "+ANSI_RESET+": ");
                println("Press 5 for "+ANSI_GREEN+" GREEN "+ANSI_RESET+": ");
                p2Col = scanner.nextInt();
    
                //Deal with out of range inputs
                while ((p2Col < 1) || (p2Col > 5)) {
                    println("That number does not correspond to a color. Please select another one");
                    println("\n"+name2+", please choose your color : ");
                    println("Press 1 for "+ANSI_BLUE+" BLUE "+ANSI_RESET+": ");
                    println("Press 2 for "+ANSI_YELLOW+" YELLOW "+ANSI_RESET+": ");
                    println("Press 3 for "+ANSI_RED+" RED "+ANSI_RESET+": ");
                    println("Press 4 for "+ANSI_PURPLE+" PURPLE "+ANSI_RESET+": ");
                    println("Press 5 for "+ANSI_GREEN+" GREEN "+ANSI_RESET+": ");
                    p2Col = scanner.nextInt();
                }
    
                switch(p2Col) {
                    case 1:
                        p2 = ANSI_BLUE+firstLetter2+ANSI_RESET;
                        break;
                    case 2:
                        p2 = ANSI_YELLOW+firstLetter2+ANSI_RESET;
                        break;
                    case 3:
                        p2 = ANSI_RED+firstLetter2+ANSI_RESET;
                        break;
                    case 4:
                        p2 = ANSI_PURPLE+firstLetter2+ANSI_RESET;
                        break;
                    case 5:
                        p2 = ANSI_GREEN+firstLetter2+ANSI_RESET;
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
}
