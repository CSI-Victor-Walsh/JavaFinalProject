// Castle Siege
// Java 2024
// Game Logic Branch

// Javanators
// By: Juan Pablo Jiménez, Víctor Walsh, Javier Ramis


import java.util.Scanner;


import java.util.Random;


public class Checkers_Javanators {
        
    public static void main(String[] args) {
        //Initial set up

        //Variables
        //Variable for the user's choice
        int userMode = 0;

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
        playGame(p1, p2);
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
    //variables
    //empty
    static final String EMPTY = "-";
    //temporary piece storage
    static String tempPieceStorage = " ";
    //player 1
    static String cRED = "p1";
    //player 1 king
    static String cREDKING = GREEN+" "+RESET;
    //player 2
    static String cBLACK = "p2";
    //player 2 king
    static String cBLACKKING = PURPLE+" "+RESET;
    //string game board
    static String[][] board = new String[8][8];
    //game ended
    static boolean gameEnded = false;
    //red turn
    static boolean isRedTurn = true;
    //player 1 wins
    static int p1Wins = 0;
    //player 2 wins
    static int p2Wins = 0;

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
        System.out.println("\n");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Check if the first inputs are correct. If the method returns 0, they are valid
    public static int checkFirstInput(int row1, int col1) {
        //return 1 if the numbers entered are invalid
        if ((row1 < 0) || (row1 > 7) || (col1 < 0)) {
            return 1;
        }

        //return 2 if there is not a piece where the player wants to move
        if (board[row1][col1] == EMPTY ) {
            return 2;
        }

        //return 3 if it's player 1's turn and the piece is player 2's
        if ((isRedTurn) == true && board[row1][col1] == cBLACK) {
            return 3;
        }

        //return 4 if it's player2's turn and the piece is player 1's
        if ((isRedTurn) == false && board[row1][col1] == cRED) {
            return 4;
        }

        //If it's red's turn and the piece to be moved is red, accept the move
        if ((isRedTurn) == true && board[row1][col1] == cRED) {
            return 0;
        }
        
        //If it's black's turn and the piece to be moved is black, accept the move
        if ((isRedTurn) == false && board[row1][col1] == cBLACK) {
            return 0;
        }
        return 0;
        }    
    //check if the second inputs are correct
    public static int checkSecondInput(int row1, int col1, int row2, int col2) {
        //Return 1 if the inputs are invalid
        if ((row2 < 0) || (col2 < 0) || (row2 > 7) || (col2 > 7)) {
            return 1;
        }    

        //Return 3 if the space is already occupied
        if (board[row2][col2] != EMPTY) {
            return 3;
        }
        //Return 0 if the move is a vaid jumping move or 4 if it isn't
        if(Math.abs(row1-row2) == 2 && Math.abs(col1-col2) == 2) {
            //Check if the jumped space has an opponent's piece
            int space1 = (row1+row2)/2;
            int space2 = (col1+col2)/2;
            
            //check for invalid move
            if (board[space1][space2] == EMPTY) {
                return 4;
            }
            //return 0 if the move is jumping over an opponent's piece
            return 0;
        }

        //return 5 if moving backwards
        if (board[row1][col1] != cREDKING && board[row1][col1] != cBLACKKING && board[row1][col1] == cRED && row2 <= row1 || board[row1][col1] == cBLACK && row2 >= row1) {
            return 5;
        }
        
        //return 2 if the move isnt diagonal or its out of rage
        if (Math.abs(row1-row2) != 1 || Math.abs(col1-col2) != 1) {
            return 2;
        }
        //if there are no errors, return 0
        else 
        return 0;
    }

    //Make a jump move and capture enemy piece
    public static void makeJumpMove(int row1, int col1, int row2, int col2) {
        //Check if the jumped space has an opponent's piece
        if (Math.abs(row1-row2) == 2 && Math.abs(col1-col2) == 2) {
            //Capture the piece if it was jumped over
            int space1 = (row1+row2)/2;
            int space2 = (col1+col2)/2;     
            board[space1][space2] = EMPTY;      
        }
    }

    public static void makeMove(int row1, int col1, int row2, int col2, String piece) {
        //Find the piece the user entered
        piece = board[row1][col1];
        board[row1][col1] = EMPTY;
        board[row2][col2] = piece;
    }

    //Select user's piece (by highlighting it)                
    public static void selectPiece (int row, int col) {
        //save the original piece in a variable
        String piece = board[row][col];
        tempPieceStorage = piece;

        //Replace board value on user's selected coordinate with a CYAN BCKRD
        board[row][col] = CYAN_BG+" "+RESET;
    }

    //Deselect piece if user enters 9 by reverting the the string from the tempPieceStorage variable
    public static void deselectPiece (int row, int col) {
        //store the temp value back to the coordinate on the board
        board[row][col] = tempPieceStorage;

        //clear tempPieceStorage
        tempPieceStorage = " ";
    }

    //check how many pieces each player has
    public static int[] checkPieces () {
        //array for storing the amount of pieces each player has
        //0 for player 1
        //1 for player 2
        int[] pieces = new int[2];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == cRED || board[i][j] == cREDKING) {
                    pieces[0]++;
                } else if (board[i][j] == cBLACK || board[i][j] == cBLACKKING) {
                    pieces[1]++;
                }
            }
        }
        return pieces;
    }

    //check for winner
    public static int checkWin () {
        //draw
        int[] pieces = checkPieces();
        if(pieces[0] == pieces[1] && pieces[0] == 1) {
            return 0;
        }

        //player 1 wins
        if (pieces[1] == 0) {
            return 1;
        }

        //player 2 wins
        if (pieces[0] == 1) {
            return 2;
        }
        //game still continues
        else 
            return 3;
    } 

    //make sure moves are complately validated
    public static boolean checkValidInput (int row1,int col1,int row2,int col2) {
        if (checkFirstInput(row1, col1) == 0 && checkSecondInput(row1, col1, row2, col2) == 0){
            return true;
        }
        return false;        
    }

    //check for king pieces
    public static boolean checkKingPiece (int row1, int col1) {
        //for player 1
        if (board[row1][col1] == cRED && row1 == 8-1) {
            return true;
        }
        //player 2
        else if (board[row1][col1] == cBLACK && row1 == 0) {
            return true;
        }
        return false;
    }

    //make king pieces
    public static void makeKing (int row1, int col1) {
        //make a player 1 piece king
        if (board[row1][col1] == cRED && checkKingPiece(row1, col1) == true) {
            board[row1][col1] = cREDKING;
        }
        //make a player 2 piece king
        if (board[row1][col1] == cBLACK && checkKingPiece(row1, col1) == true) {
            board[row1][col1] = cBLACKKING;
        }

    }

    public static void playGame(String p1, String p2){
        cRED = p1;
        cBLACK = p2;
        Scanner scanner = new Scanner(System.in);
        initializeBoard();

            while (gameEnded != true) {
                printBoard();
                if (isRedTurn) {
                    println("\nPlayer 1's turn");
                } else {
                    println("\nPlayer 2's turn");
                }
                //Ask for FIRST user input
                print("\nEnter move: \n");

                println(YELLOW+"\nWhich piece do you want to move?"+RESET);
                print(YELLOW+"X-Input: "+RESET);
                int inRow1 = scanner.nextInt();
                //subtract 1 to the original inputs
                int row1 = inRow1-1;
                print(YELLOW+"\nY-Input: "+RESET);
                int inCol1 = scanner.nextInt();
                //subtract 1 to the original inputs
                int col1 = inCol1-1;
                
                //If the first input method returns an eror
                if (checkFirstInput(row1, col1) != 0) {
                    //invalid number, warn the user
                    while (checkFirstInput(row1, col1) == 1) {
                        println(RED+"\nNumber is not a space on the board, please try again"+RESET);
                        printBoard();

                        println(YELLOW+"\nWhich piece do you want to move?"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        row1 = inRow1-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        inCol1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        col1 = inCol1-1;
                    }
                    //space is empty, warn the user
                    while (checkFirstInput(row1, col1) == 2) {
                        println(RED+"\nSpace is empty, please try again"+RESET);
                        printBoard();

                        println(YELLOW+"\nWhich piece do you want to move?"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        row1 = inRow1-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        inCol1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        col1 = inCol1-1;
                    }
                    //there is an opposite piece in the space, warn the user
                    while (checkFirstInput(row1, col1) == 3) {
                        println(RED+"\nSpace is taken by opposite player's piece, please try again"+RESET);
                        printBoard();

                        println(YELLOW+"\nWhich piece do you want to move?"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        row1 = inRow1-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        inCol1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        col1 = inCol1-1;
                    }
                    //there is an opposite piece in the space, warn the user
                    while (checkFirstInput(row1, col1) == 4) {
                        println(RED+"\nSpace is taken by opposite player's piece, please try again"+RESET);
                        printBoard();

                        println(YELLOW+"\nWhich piece do you want to move?"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        row1 = inRow1-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        inCol1 = scanner.nextInt();
                        //subtract 1 to the original inputs
                        col1 = inCol1-1;
                    }
                }
                
                //Select the piece 
                selectPiece(row1, col1);
                printBoard();

                //ask where the user wants to move            
                println(YELLOW+"\nTo where?"+RESET);
                print(YELLOW+"X-Input: "+RESET);
                int inRow2 = scanner.nextInt();
                //subtract the inputs by one
                int row2 = inRow2-1;
                print(YELLOW+"\nY-Input: "+RESET);
                int inCol2 = scanner.nextInt();
                //subtract the inputs by one
                int col2 = inCol2-1;
                
                //if there is an error with the input
                if (!checkValidInput(row1, col1, row2, col2)) {
                    //Invalid number, warn the user
                    while (checkSecondInput(row1, col1, row2, col2) == 1) {
                        println(RED+"\nNumber is not a space on the board, please try again"+RESET);
                        printBoard();
                        println(YELLOW+"\nTo where? (Type 9 to cancel)"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow2 = scanner.nextInt();
                        //subtract the inputs by one
                        row2 = inRow2-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        col2 = scanner.nextInt();
                        //subtract the inputs by one
                        col2 = inCol2-1;
                        //check valid input and stop the loop if it is
                        checkValidInput(row1, col1, row2, col2);
                        if (checkValidInput(row1, col1, row2, col2) == true) {
                            //Deselect piece 
                            deselectPiece(row1, col1);
                            //check and make a jump move
                            makeJumpMove(row1, col1, row2, col2);
                            //make the move
                            makeMove(row1, col1, row2, col2, p1);
                            //let the game know the player's turn has ended and its the next player's turn
                            //check for king pieces
                            checkKingPiece(row1, col1);
                            //make king pieces
                            if (checkKingPiece(row1, col1) == true) {
                                makeKing(row1, col1);
                            }
                            isRedTurn = !isRedTurn;
                            break;
                        }

                        //Deselect piece if user enters 9 
                        if (inRow2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }   
                        if (inCol2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }
                    }
                    //warn the user if they tried to move vertically or horizontally
                    while (checkSecondInput(row1, col1, row2, col2) == 2) {
                        println(RED+"\nInvalid Input"+RESET);
                        println("Remember, thou can only move diagonally or jump over another piece");
                        printBoard();
                        println(YELLOW+"\nTo where? (Type 9 to cancel)"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow2 = scanner.nextInt();
                        //subtract the inputs by one
                        row2 = inRow2-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        col2 = scanner.nextInt();
                        //subtract the inputs by one
                        col2 = inCol2-1;
                        //check valid input and stop the loop if it is
                        checkValidInput(row1, col1, row2, col2);
                        if (checkValidInput(row1, col1, row2, col2) == true) {
                            //Deselect piece 
                            deselectPiece(row1, col1);
                            //check and make a jump move
                            makeJumpMove(row1, col1, row2, col2);
                            //make the move
                            makeMove(row1, col1, row2, col2, p1);
                            //let the game know the player's turn has ended and its the next player's turn
                            //check for king pieces
                            checkKingPiece(row1, col1);
                            //make king pieces
                            if (checkKingPiece(row1, col1) == true) {
                                makeKing(row1, col1);
                            }
                            isRedTurn = !isRedTurn;
                            break;
                        }

                        //Deselect piece if user enters 9
                        if (inRow2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }   
                        if (inCol2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }                    
                    }
                    //warn the user if there is already a piece in the space they want to move
                    while (checkSecondInput(row1, col1, row2, col2) == 3) {
                        println(RED+"\nInvalid Input"+RESET);
                        println("There is already a piece here");
                        printBoard();
                        println(YELLOW+"\nTo where? (Type 9 to cancel)"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow2 = scanner.nextInt();
                        //subtract the inputs by one
                        row2 = inRow2-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        col2 = scanner.nextInt();
                        //subtract the inputs by one
                        col2 = inCol2-1;
                        //check valid input and stop the loop if it is
                        checkValidInput(row1, col1, row2, col2);
                        if (checkValidInput(row1, col1, row2, col2) == true) {
                            //Deselect piece 
                            deselectPiece(row1, col1);
                            //check and make a jump move
                            makeJumpMove(row1, col1, row2, col2);
                            //make the move
                            makeMove(row1, col1, row2, col2, p1);
                            //let the game know the player's turn has ended and its the next player's turn
                            //check for king pieces
                            checkKingPiece(row1, col1);
                            //make king pieces
                            if (checkKingPiece(row1, col1) == true) {
                                makeKing(row1, col1);
                            }
                            isRedTurn = !isRedTurn;
                            break;
                        }
                        
                        //Deselect piece if user enters 9
                        if (inRow2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }   
                        if (inCol2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }                 
                    }
                    //warn the user if they tried to do an illegal jumping move
                    while (checkSecondInput(row1, col1, row2, col2) == 4) {
                        println(RED+"\nInvalid Input"+RESET);
                        println("There is no piece to jump over");
                        printBoard();
                        println(YELLOW+"\nTo where? (Type 9 to cancel)"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow2 = scanner.nextInt();
                        //subtract the inputs by one
                        row2 = inRow2-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        col2 = scanner.nextInt();
                        //subtract the inputs by one
                        col2 = inCol2-1;
                        //check valid input and stop the loop if it is
                        checkValidInput(row1, col1, row2, col2);
                        if (checkValidInput(row1, col1, row2, col2) == true) {
                            //Deselect piece 
                            deselectPiece(row1, col1);
                            //check and make a jump move
                            makeJumpMove(row1, col1, row2, col2);
                            //make the move
                            makeMove(row1, col1, row2, col2, p1);
                            //let the game know the player's turn has ended and its the next player's turn
                            //check for king pieces
                            checkKingPiece(row1, col1);
                            //make king pieces
                            if (checkKingPiece(row1, col1) == true) {
                                makeKing(row1, col1);
                            }
                            isRedTurn = !isRedTurn;
                            break;
                        }
                       
                        //Deselect piece if user enters 9
                        if (inRow2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }   
                        if (inCol2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }
                    }
                    //warn the user if they try to move backwards
                    while (checkSecondInput(row1, col1, row2, col2) == 5) {
                        println(RED+"\nInvalid Input"+RESET);
                        println("Thou cannot move backwards");
                        printBoard();
                        println(YELLOW+"\nTo where? (Type 9 to cancel)"+RESET);
                        print(YELLOW+"X-Input: "+RESET);
                        inRow2 = scanner.nextInt();
                        //subtract the inputs by one
                        row2 = inRow2-1;
                        print(YELLOW+"\nY-Input: "+RESET);
                        col2 = scanner.nextInt();
                        //subtract the inputs by one
                        col2 = inCol2-1;
                        //check valid input and stop the loop if it is
                        checkValidInput(row1, col1, row2, col2);
                        if (checkValidInput(row1, col1, row2, col2) == true) {
                            //Deselect piece 
                            deselectPiece(row1, col1);
                            //check and make a jump move
                            makeJumpMove(row1, col1, row2, col2);
                            //make the move
                            makeMove(row1, col1, row2, col2, p1);
                            //let the game know the player's turn has ended and its the next player's turn
                            //check for king pieces
                            checkKingPiece(row1, col1);
                            //make king pieces
                            if (checkKingPiece(row1, col1) == true) {
                                makeKing(row1, col1);
                            }
                            isRedTurn = !isRedTurn;
                            break;
                        }
                        
                        //Deselect piece if user enters 9
                        if (inRow2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }   
                        if (inCol2 == 9) {
                            deselectPiece(row1, col1);
                            break;
                        }
                }
            }
                //if there are no errors, continue
                    //Deselect piece 
                    deselectPiece(row1, col1);
                    //check and make a jump move
                    makeJumpMove(row1, col1, row2, col2);
                    //make the move
                    makeMove(row1, col1, row2, col2, p1);
                    //check for king pieces
                    checkKingPiece(row1, col1);
                    //make king pieces
                    if (checkKingPiece(row1, col1) == true) {
                        makeKing(row1, col1);
                    }
                    //let the game know the player's turn has ended and its the next player's turn
                    isRedTurn = !isRedTurn;
                
                checkWin();
                if (checkWin() == 0) {
                    println("Tie!");
                    gameEnded = true;
                }
                if (checkWin() == 1) {
                    println("Player 1 wins!");
                    p1Wins++;
                    gameEnded = true;
                }
                if (checkWin() == 2) {
                    println("Player 2 wins!");
                    p2Wins++;
                    gameEnded = true;
                }
                else if (checkWin() == 3) {
                    gameEnded = false;
                }
            }
    }

    //Miscellaneous Methods

    public static void print(String msg){
        System.out.print(msg);
    }

    public static void println(String msg){
        System.out.println(msg);
    }
    //String correction
    public static void checkIn(int input) {
        if (!Character.isDigit(input)) {
            println(RED+"please enter a number"+RESET);
        }
    }
    //clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

