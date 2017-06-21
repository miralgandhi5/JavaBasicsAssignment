/**
 * Created by miral on 6/21/2017.
 */
public class CommonElementsInArray {
    static void commonElements(int [] arrayone , int [] arraytwo){

        for(int i=0;i<arrayone.length ; i++){
            for (int j=0;j<arraytwo.length ; j++){
                if(arrayone[i] == arraytwo[j]){
                    System.out.println(arrayone[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int [] arrayone ={1,2,3,4};
        int [] arraytwo ={1,4};
        commonElements(arrayone,arraytwo);
    }
}
