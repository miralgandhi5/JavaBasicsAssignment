/**
 * Created by miral on 6/21/2017.
 */
public class OccurrencesoftheDuplicateWords {
    static void duplicatesWords(String string){

        String[] words=string.split(" ");


        int[] fr=new int[words.length];

        for(int i=0;i<fr.length;i++)
            fr[i]=1;


        for(int i=0;i<words.length;i++){
            if(words[i]!="EOF"){
                for(int j=i+1;j<words.length;j++){
                    if(words[i].equals(words[j])){
                        fr[i]+=1;
                        words[j]="EOF";
                    }
                }
            }
        }




        System.out.println("Duplicate words:");
        for(int i=0;i<fr.length;i++){
            if(fr[i]>1){
                System.out.println(words[i]+"="+fr[i]);

            }
        }

    }

    public static void main(String[] args) {
        duplicatesWords("hello Miral Gandhi, Miral is a unique name, Gandhi is surname of Mahatma ");
    }

}
