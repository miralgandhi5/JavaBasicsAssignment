/**
 * Created by miral on 6/21/2017.
 */
public class OverloadingMethods {
    static void add(int a, int b) {
        System.out.println(" Add  integer Number: " + " " + (a + b));
    }

    static void add(double a, double b) {
        System.out.println(" Add  double  Number: " + " " + (a + b));
    }

    static void multiply(int a, int b) {
        System.out.println(" Multiply two integer Number : " + " " + a * b);
    }

    static void multiply(float a, float b) {
        System.out.println(" Multiply two float Number : " + " " + a * b);
    }



    static void concatstring(String string1, String string2) {
        System.out.println(" Concate two String : " + " " + string1.concat(string2));
    }

    static void concatstring(String string1, String string2, String string3) {
        System.out.println(" Concate Three String : " + " " + string1.concat(string2.concat(string3)));
    }

    public static void main(String[] args) {
        add(3, 8);
        add(10.5, 15.8);
        multiply(5, 5);
        multiply(0.08f, 0.08f);

        concatstring("Miral", "Gandhi");
        concatstring("Miral", "Ashwin", "Gandhi");
    }
}
