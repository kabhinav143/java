import java.util.*;

public class LINEARSEARCH1 {
    public static int LINEAR_SEARCH1(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]){
        String menu[]={"dosa","kadhi chawal","panner","idli","sambar","pakora","Samosa"};
        String key="panner";
        int index=LINEAR_SEARCH1(menu,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("YOUR REQUIRED ITEM "+index);
        }
    }
}