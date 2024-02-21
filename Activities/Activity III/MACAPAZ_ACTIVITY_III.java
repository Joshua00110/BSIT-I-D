import java.util.Scanner;
public class MACAPAZ_ACTIVITY_III{
public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    int temp;

    System.out.println("Enter Celcius: ");
    temp = sc.nextInt();
    
    if(temp>=100){
System.out.println("Boiling");

    }else
    System.out.println("Not boiling");
}

}