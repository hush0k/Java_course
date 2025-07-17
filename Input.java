import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Enter an word: ");
        String word = input.next();

        System.out.print("The number is: " + number + "\nThe word is: " + word);
    }
}
