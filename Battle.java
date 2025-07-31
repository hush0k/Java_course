import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < board.length; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j < board.length; j+=2) {
                    board[i][j] = '|';
                }
            } else {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = '-';
                }
            }
        }

        boolean start = true;
        boolean isX = false;
        System.out.println("Первый ход делает Икс, Кординаты?");
        while(start) {
            printBoard(board);
            enterCoordinate(board, isX);
            isX = !isX;
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void enterCoordinate(char[][] board, boolean isX) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X:");
        int x = sc.nextInt();
        x = correctMove(x);


        System.out.print("\nY:");
        int y = sc.nextInt();
        y = correctMove(y);

        if (isX) {
            board[x][y] = 'X';
        } else {
            board[x][y] = 'O';
        }

    }

    public static int correctMove(int x){
        return switch (x) {
            case 1 -> 0;
            case 2 -> 2;
            case 3 -> 4;
            default -> 10;
        };
    }
}
