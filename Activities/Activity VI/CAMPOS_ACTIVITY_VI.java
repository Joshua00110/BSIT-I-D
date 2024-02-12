import java.util.*;
public class CAMPOS_ACTIVITY_VI {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of seconds: ");
        int num = sc.nextInt();
        
        while (num>=0){
             System.out.println(num);
             num--;
        }
    }
}
