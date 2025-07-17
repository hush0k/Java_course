public class Operators {

    public static void main(String[] args) {
        int x = 10, y = 20;

        //Addition
        System.out.println(x + y);
        //x = x + y => x += y

        //Subtraction
        System.out.println(x - y);
        //x = x - y => x -= y

        //Multiplication
        System.out.println(x * y);
        //x = x * y => x *= y

        //Division
        System.out.println(x / y);
        //x = x / y => x /= y

        //Modulo
        System.out.println(x % y);

        //12/5=2  29/7=4
        //12%5=2  29%7=1



        //Relation Operators
        //Equal to
        System.out.println("Equal: " + (x == y));

        //Not Equal
        System.out.println("Not equal: " + (x != y));

        //Greater than
        System.out.println("Greater: " + (x > y));

        //Less than
        System.out.println("Less: " + (x < y));

        //Greater or equal
        System.out.println("GreaterOrEqual: " + (x >= y));

        //Less or equal
        System.out.println("LessOrEqual: " + (x <= y));

        int a = 84;

        //Logic Operators
        //AND, OR, NOT => &&, ||, !

        if (a > x && a > y) {
            System.out.println("A is the biggest number");
        } else if (x < a && x < y) {
            System.out.println("X is the biggest number");
        } else if (y > a && y < x) {
            System.out.println("Y is the biggest number");
        }

        if (a > y || a > x) {
            System.out.println("A can be greater than x and y");
        }

        if (!(a > x)){
            System.out.println("A can't be greater than x");
        }

    }
}
