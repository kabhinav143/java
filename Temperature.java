import java.util.*;

public class Temperature {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day) {
            case 1:System.out.println("Enter first day of week"+day);
                break;
            case 2:System.out.println("Enter second day of week"+day);
                break;
            case 3:System.out.println("Enter third day of week"+day);
                break;
            case 4:System.out.println("Enter fourth day of week"+day);
                break;
            case 5:System.out.println("Enter fifth day of week"+day);
                break;
            case 6:System.out.println("Enter sixth day of week"+day);
            default:System.out.println("NO DAY");

                break;
            }    
        }
    }