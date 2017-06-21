import java.util.Scanner;

/**
 * Created by miral on 6/21/2017.
 */
public class ReplaceSubstring {
    public static String subStringReplace(String str, String sub, String replace) {
        String changedString = str.replaceAll(sub, replace);
        return changedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String orignalString = sc.next();
        System.out.println("enter the substring");
        String subString = sc.next();

        if (!orignalString.contains(subString))
            System.out.println("error");
        else {
            System.out.println("enter the string to replace");
            String replace = sc.next();

            String result = ReplaceSubstring.subStringReplace(orignalString, subString, replace);
            System.out.println(result);
        }


    }
}
