/**
 * Created by miral on 6/21/2017.
 */
public class CalculatePercentageOfDifferentCharacter {
    static  void calculatePercentage(String str){


        int whitespace=0 , spl =0,digit = 0, lowerchar =0,upperchar =0;
        for (int i=0; i < str.length() ; i++){
            if(Character.isLowerCase(str.charAt(i))){
                lowerchar++;
            }else if(Character.isUpperCase(str.charAt(i))){
                upperchar++;
            }else if(Character.isDigit(str.charAt(i))){
                digit++;
            }else if(Character.isWhitespace(str.charAt(i))){
                whitespace++;
            }else {
                spl++;
            }
        }

        System.out.println(" string length = " + str.length());
        System.out.println(" lowerchar count = " + lowerchar + " Percentage = "+lowerchar*100/str.length() + "%");
        System.out.println(" upperchar count = " + upperchar + " Percentage  = "+ upperchar*100/str.length() + "%");
        System.out.println(" digit count = " + digit +" Percentage = "+ digit*100/str.length()+ "%");
        System.out.println(" whitespace count = "+ whitespace + " Percentage = "+ whitespace*100/str.length() + "%");
        System.out.println(" spl count = " + spl + " Percentage = "+ spl*100/str.length() + "%");
    }

    public static void main(String[] args) {
        calculatePercentage("ThiS Is the stRing @12");
    }
}


