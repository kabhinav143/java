import java.util.*;
public class BINARYSEARCH{
    public static int BINARY_SEARCH(int numbers[],int key){
        int start=0;int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if(mid==key){// found
                return mid;
            }
            if(mid<key){
                start=mid+1;
                
            }else{
                start=mid-1;
            }

        }
        return -1;
    }
    public static void main(String args){
        int numbers[]={2,4,6,8,10,12};
        key=10;
        System.out.println("INDEX AT "+ BINARY_SEARCH(numbers,key));
    }
}