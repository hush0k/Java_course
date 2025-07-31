public class Loops {

    public static void main(String[] args) {
        //While, Do-While, For;

        //FOR standard
//        for (int i = 1; i < 10; i *= 2){
//            System.out.println(i);
//        }
//
//        String[] names = {"Alan", "Akosh", "Kana"};
//        //For each
//        for (String name : names){
//            System.out.println(name);
//        }

        //While Loop
        boolean live = true;
        int hp = 10;
        while (live){
            System.out.println("Hello World ");
            if (hp == 0){
                System.out.println("HP is zero");
                live = false;
            } else {
                System.out.println("You will alive\nNow your HP is " + hp);
                hp--;
            }
        }
    }
}
