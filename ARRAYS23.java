import java.util.*;
public class ARRAYS23{
    public static int ARRAYS14(int numbers[],int key){
        int start=0;end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10};
        int key=6;
        System.out.println("Index at "+ARRAYS14(numbers,key));
    }

    }
}