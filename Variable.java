public class Variable {
    //Primitive DataTypes
    // Int, Float, byte
    int number = 10;
    long min_number = -25984818;

    float price = 2957.15F;
    double price2 = 2789486.4857F;


    //char
    char symbol = '!';

    //boolean
    boolean active = true;
    boolean inactive = false;

    //Non-Primitive DataTypes
    //String, Class, Objects, Interface, Array

    static String name = "Kana";
    String surname = new String("Omirzak");

    static int sizeOfName = name.length();

    public static void main(String[] args) {
//        int a = 5;
//        int b = 15;
//        System.out.println(a);
//
//        a++;
//        System.out.println(a);
//        System.out.println(name);
//        System.out.println(sizeOfName);

        int one = 48;
        int two = 90;

        System.out.println("One is " + one + " and two is " + two);

        int temp = one;
        one = two;
        two = temp;

        System.out.println("One is " + one + " and two is " + two);

    }




}
