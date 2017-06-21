/**
 * Created by miral on 6/21/2017.
 */
public class DisplayEnum {
    enum houses {
        bhk1(20), bhk2(40);
        private final int price;

        houses(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }


    }

    ;

    public static void main(String[] args) {

        System.out.println("All Houses prices:");
        for (houses h : houses.values())
            System.out.println(h + " costs " + h.getPrice() + " Lakhs");
    }
}
