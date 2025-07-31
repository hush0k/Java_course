import java.util.Scanner;


public class Looops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //FOR standard
//        for (int i = 1; i < 100; i += 2){
//            System.out.println(i);
//        }
//        //FOR each
//        String[] names = {"Alan", "Alash", "Kama"};
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        //while
//        boolean live = true;
//        int hp = 10;
//        while (live){
//            System.out.println("Living now");
//            if (hp == 0) {
//                System.out.println("HP is 0");
//
//
//            } else {
//                System.out.println("HP is " + hp);
//                hp = hp--;
//            }
//        }
//
//        //Do-While
//        do {
//            int hamlet = sc.nextInt();
//            if (hamlet > 0){
//                System.out.println("You have a hamlet, now you can fight, Hamlet is " + hamlet);
//            } else {
//                System.out.println("You have a no hamlet, Hamlet is " + hamlet);
//            }
//        } while (hp > 0);
//
//        int n = 0;
//        boolean flag = false;
//
//        while (flag){
//            n++;
//        }
//
//        System.out.println("While variant: " + n);
//
//        n = 0;
//        flag = false;
//
//        do {
//            n++;
//        } while (flag);
//
//        System.out.println("Do-While variant: " + n);

        int n1 = 0;
        //Nested Loop
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(n1);
            }
            System.out.println();
        }
    }



}
