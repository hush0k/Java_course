import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("This is a number 1");
                break;
            case 2:
                System.out.println("This is a number 2");
                break;
            case 3:
                System.out.println("This is a number 3");
                break;
            default:
                System.out.println("Invalid choice");
        }


        boolean ready = true;

        if (!ready){
            System.out.println("Где у вас болит? \n1.Голова\n2.Живот");
        }

    }
}
