import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        ages[0] = 20;
        ages[1] = 19;
        ages[2] = 24;

        System.out.println(ages[0]);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }

        int[][] twoDimArray = new int[3][3];




    }
}
