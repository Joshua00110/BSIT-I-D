import java.util.Scanner;
public class MAURIN_ACTIVITY_VII{
    public static void main ( String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter factorial number:");
        
        int  num = sc.nextInt();

        long fact = 1;
        
    for(int i=1; i<= num; i++){
            fact *=i;
        }
        System.out.println(fact);
    }
    
}