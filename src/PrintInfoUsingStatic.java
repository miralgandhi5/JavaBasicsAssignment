/**
 * Created by miral on 6/21/2017.
 */
public class PrintInfoUsingStatic {
    static String firstName="Miral";
    static String lastName="gandhi";
    static int age = 23;

    static public void getDetails() {
        System.out.println("Üsing Static Method");
        System.out.println("firstName:" + firstName + " lastName:" + lastName + " age:" + age);
    }

    static {

        System.out.println("Üsing Static Block");
        System.out.println("firstName:" + firstName + " lastName:" + lastName + " age:" + age);
    }


    public static void main(String[] args) {
       PrintInfoUsingStatic.getDetails();
        System.out.println("Üsing Static variables");
        System.out.println("firstName:" + firstName + " lastName:" + lastName + " age:" + age);
    }

}
