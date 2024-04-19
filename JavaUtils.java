    //Java simple sample code that: 
    //clears console, show colors, show a sample game plate, shows animation using delay mechanism

    //Crated by Reynaldo Belfort, S.J.

    import java.security.spec.MGF1ParameterSpec;
    import java.util.Scanner;

    public class JavaUtils {

        //ANSI Escape Codes
        //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println 
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
        public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
        public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        public static void print(String msg){
            System.out.print(msg);
        }
    
        public static void println(String msg){
            System.out.println(msg);
        }

        public static void printColor(String msg, int color){
            switch (color) {
                case 0:
                    print(ANSI_BLUE + msg + ANSI_RESET);
                    break;

                case 1:
                    print(ANSI_RED + msg + ANSI_RESET);
                    break;

                case 2:
                     print(ANSI_PURPLE + msg + ANSI_RESET);
                    break;

                case 3:
                    print(ANSI_GREEN + msg + ANSI_RESET);
                    break;

                case 4:
                    print(ANSI_YELLOW + msg + ANSI_RESET);
                    break;

                case 5:
                    print(ANSI_CYAN + msg + ANSI_RESET);
                    break;

                case 6:
                    print(ANSI_BLACK + msg + ANSI_RESET);
                    break;

                case 7: 
                    print(ANSI_WHITE + msg + ANSI_RESET);
                    break;
            }
        }
        
        /*
         * There is some discrepancy in the Java community as for
         * what is the best way to clear the screen in console-based
         * Java applications. See discussion for alternatives: 
         * https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
         * or
         * https://rootstack.com/en/blog/java-clear-screen
         */
        public static void clearScreen() {  
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        } 


        //------------------ PROGRAM STARTS HERE ------------------
        public static void main(String[] args){
            
            Scanner keyboard = new Scanner(System.in);
            int currentPageNumber = 0;

            print("\n\n");
            println("-------- Page [" + currentPageNumber +  "] --------");

            print("\n\nJava Code Utilities!\n\n");
            print("\n---Press any key to continue---\n\n");
            
            //Program will continue independend of whatever info user enters
            keyboard.nextLine();
            currentPageNumber++; //To add a visual marker of pages shown thus far.
            clearScreen(); //Clear the console
            
            //ASCII Colors

            println("-------- Page [" + currentPageNumber +  "] --------");

            println("");
            println("Our first line.");
            printColor("Our second line.\n", 0);

            print("Our ");  
            printColor(" third ", 1); 
            print("line.\n");


            printColor("Our ", 0);  
            printColor(" fourth ", 1); 
            printColor("line.\n", 2);



            printColor("O", 0);  
            printColor("U", 1); 
            printColor("R", 2);
            printColor(" fifth ", 1); 
            printColor("line.\n", 2);


            //Wait before next page
            print("\n---Press any key to continue---\n\n");
            keyboard.nextLine();
            currentPageNumber++; //To add a visual marker of pages shown thus far.
            clearScreen(); //Clear the console


            //Show sample text graphic (CSI). 
            
            println("-------- Page [" + currentPageNumber +  "] --------");

            println("\n------ Sample Text Plate ------\n");

            //ASCII Art generated here: https://patorjk.com/software/taag/#p=display&f=Doom&t=CSI
                //Just simly copy the generated ASCII art and paste it between the "" in print("");
            print(" _____  _____ _____ \r\n" + //
                    "/  __ \\/  ___|_   _|\r\n" + //
                    "| /  \\/\\ `--.  | |  \r\n" + //
                    "| |     `--. \\ | |  \r\n" + //
                    "| \\__/\\/\\__/ /_| |_ \r\n" + //
                    " \\____/\\____/ \\___/ \r\n" + //
                    "                    \r\n" + //
                    "                    ");

            print(" \n\n"); //Leaving space between ASCII arts

            print(" _        _______  _______  _        _______  _______  _ \r\n" + //
                                "( \\      (  ____ \\(  ___  )( (    /|(  ____ \\(  ____ \\( )\r\n" + //
                                "| (      | (    \\/| (   ) ||  \\  ( || (    \\/| (    \\/| |\r\n" + //
                                "| |      | (__    | |   | ||   \\ | || (__    | (_____ | |\r\n" + //
                                "| |      |  __)   | |   | || (\\ \\) ||  __)   (_____  )| |\r\n" + //
                                "| |      | (      | |   | || | \\   || (            ) |(_)\r\n" + //
                                "| (____/\\| (____/\\| (___) || )  \\  || (____/\\/\\____) | _ \r\n" + //
                                "(_______/(_______/(_______)|/    )_)(_______/\\_______)(_)\r\n" + //
                                "                                                         ");


            //Wait before next page
            print("\n---Press any key to continue---\n\n");
            keyboard.nextLine();
            currentPageNumber++; //To add a visual marker of pages shown thus far.
            clearScreen(); //Clear the console


            //Animate another text graphic (CSI), generated from a web site:
            println("-------- Page [" + currentPageNumber +  "] --------");

               //NOTE on ASCII ART: '\' is an escape cursor. Thus, an extra '\' must be added to
                    //so that system can print it on console.

            //On pausing a Java app: https://ioflood.com/blog/java-sleep/
            try {
                Thread.sleep(300); //pause this Java app for 300ms
                println("  _____  _____ _____");
                Thread.sleep(300); //pause this Java app for 300ms
                println(" /  __ \\/  ___|_   _|");
                Thread.sleep(300); //pause this Java app for 300ms
                println(" | /  \\/\\ `--.  | |  ");
                Thread.sleep(300); //pause this Java app for 300ms
                println(" | |     `--. \\ | |  ");
                Thread.sleep(300); //pause this Java app for 300ms
                println(" | \\__/\\/\\__/ /_| |_ ");
                Thread.sleep(300); //pause this Java app for 300ms
                println(" \\____/ \\____/ \\___/ ");
                Thread.sleep(300); //pause this Java app for 300ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //Wait before next page
            print("\n---Press any key to continue---\n\n");
            keyboard.nextLine();
            currentPageNumber++; //To add a visual marker of pages shown thus far.
            clearScreen(); //Clear the console

            //Farewell screen


            println("-------- Page [" + currentPageNumber +  "] --------");
            
            print("\n");
            println("---------------------");
            printColor("-     Goodbye!!     -\n", 0);
            println("---------------------");
            print("");

            //Wait before next page
            print("\n---Press any key to continue---\n\n");
            keyboard.nextLine();
            currentPageNumber++; //To add a visual marker of pages shown thus far.
            clearScreen(); //Clear the console

        }
    
    }