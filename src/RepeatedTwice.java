/**
 * Created by miral on 6/21/2017.
 */
public class RepeatedTwice {
    static int findSingle(int arr[]){

        int res=0;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println( res=res^arr[i]);
        }
        return res;

    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,3,2,1};
        int element = findSingle(arr);
        System.out.println(element);
    }
}
