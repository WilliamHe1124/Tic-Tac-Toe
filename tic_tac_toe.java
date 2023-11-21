import java.util.Scanner;
public class tic_tac_toe{
    public void game() {
    Scanner input = new Scanner(System.in);
    int row, col;
    int count = 0;
    boolean Xwin = false;
    boolean Owin = false;
    boolean Xmove = true;
    boolean Omove = false;
    boolean newGame = true;
    boolean gameEnds = true;
    String[][] table = new String[3][3];
    while (newGame) {
        if (gameEnds) {
            for (int i = 0; i < 3; i++) {
                for (int x = 0; x < 3; x++) {
                    table[i][x] = " ";
                }
            }
            gameEnds = false;
        }
        // Display the game table
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("[" + table[i][x] + "]");
            }
            System.out.println("");
        }
        // X's move
        if (Xmove) {
            System.out.print("X, make your move: ");
            row = input.nextInt();
            col = input.nextInt();
            if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
                if (table[row][col].equals(" ")) {
                    table[row][col] = "X";
                    Xmove = false;
                    Omove = true;
                } else {
                    System.out.println("The spot is taken, try another one!");
                }
            } else {
                System.out.println("There is no such spot on the table, try another one!");
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("[" + table[i][x] + "]");
            }
            System.out.println("");
        }
        // Check winning conditions for X
        for (int x = 0; x < 3; x++) {
            if (table[x][0].equals(table[x][1]) && table[x][1].equals(table[x][2])) {
                if (table[x][0].equals("X")) {
                    Xwin = true;
                    break;
                }
            }
            if (table[0][x].equals(table[1][x]) && table[1][x].equals(table[2][x])) {
                if (table[0][x].equals("X")) {
                    Xwin = true;
                    break;
                }
            }
        }
        if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2])) {
            if (table[0][0].equals("X")) {
                Xwin = true;
            }
        }
        if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0])) {
            if (table[0][2].equals("X")) {
                Xwin = true;
            }
        }
        // X wins
        if (Xwin) {
            System.out.println("X won!");
            System.out.println("Play again? Y/N");
            String ans = input.next();
            if (ans.equals("Y")) {
                Xwin = false;
                Owin = false;
                newGame = true;
                gameEnds = true;
                continue;
            } else {
                newGame = false;
                break;
            }
        }
        // Check for a tie
        count = 0;
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                if (!table[i][x].equals(" ")) {
                    count++;
                }
            }
        }
        if (count >= 9) {
            System.out.println("It's a Tie!");
            System.out.println("Play again? Y/N");
            String ans = input.next();
            if (ans.equals("Y")) {
                Xwin = false;
                Owin = false;
                newGame = true;
                gameEnds = true;
                continue;
            } else {
                newGame = false;
                break;
            }
        }
        // O's move
        if (Omove) {
            System.out.print("O, make your move: ");
            row = input.nextInt();
            col = input.nextInt();
            if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
                if (table[row][col].equals(" ")) {
                    table[row][col] = "O";
                    Omove = false;
                    Xmove = true;
                } else {
                    System.out.println("The spot is taken, try another one!");
                }
            } else {
                System.out.println("There is no such spot on the table, try another one!");
            }
        }
        // Check winning conditions for O
        for (int x = 0; x < 3; x++) {
            if (table[x][0].equals(table[x][1]) && table[x][1].equals(table[x][2])) {
                if (table[x][0].equals("O")) {
                    Owin = true;
                    break;
                }
            }
            if (table[0][x].equals(table[1][x]) && table[1][x].equals(table[2][x])) {
                if (table[0][x].equals("O")) {
                    Owin = true;
                    break;
                }
            }
        }
        if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2])) {
            if (table[0][0].equals("O")) {
                Owin = true;
            }
        }
        if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0])) {
            if (table[0][2].equals("O")) {
                Owin = true;
            }
        }
        // O wins
        if (Owin) {
            System.out.println("O won!");
            System.out.println("Play again? Y/N");
            String ans = input.next();
            if (ans.equals("Y")) {
                Xwin = false;
                Owin = false;
                newGame = true;
                gameEnds = true;
                continue;
            } else {
                newGame = false;
                break;
            }
        }
    }
}
}
