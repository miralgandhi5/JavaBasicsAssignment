import java.util.Scanner;

/**
 * Created by miral on 6/21/2017.
 */
public class OccurencesOfCharacter {
    private static int countCharacters(String s, char c, int index, int count) {
        if (index < s.length()) {
            if (c == s.charAt(index)) {
                count++;
            }
            index++;
            count = countCharacters(s, c, index, count);
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next().toLowerCase();

        System.out.println("Enter a character to count in the string " + s);
        char c = sc.next().toLowerCase().charAt(0);

        int cn = countCharacters(s, c, 0, 0);
        System.out.println(c + " occurs " + cn + " times in " + s);
        sc.close();


    }
}
