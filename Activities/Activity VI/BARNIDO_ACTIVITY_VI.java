import java.util.Scanner;
public class BARNIDO_ACTIVITY_VI {
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the time in seconds: ");

    int num= sc.nextInt();

    while(num>=0){
        System.out.println(num);
        num--;
    }
  }  
}
