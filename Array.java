import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variant 1 for creating of array
        int[] numbers;
        numbers = new int[5];

        //Variant 2 for creating of array
        String[] names = new String[10];

        //Initializing of array
        int[] ages = {16, 17, 15, 16, 19};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

//        System.out.println(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Single Dimension Array
        int[] speeds = new int[10];

        //Multi Dimension Array
        int[][] adresses = new int[4][4];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                adresses[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(adresses[i][j] + " ");
            }
            System.out.println();
        }
    }
}
