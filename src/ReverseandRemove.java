/**
 * Created by miral on 6/21/2017.
 */
public class ReverseandRemove {
    static void reverseAndremove(String string) {

        StringBuffer strbuf = new StringBuffer(string);
        strbuf.reverse();
        System.out.println("String after reverse : " + strbuf);
        strbuf.replace(4,10,"");
        System.out.println("String after remove: " + strbuf);
    }

    public static void main(String[] args) {

        String string = "Miral Gandhi";
        System.out.println("String is : " + string);
        reverseAndremove(string);
    }
}
