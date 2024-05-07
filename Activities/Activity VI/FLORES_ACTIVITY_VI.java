import java.util.Scanner;
  public class FLORES_ACTIVITY_VI{
    public static void main( String []args) {
    Scanner sc = new Scanner(System.in);

    System.out.print(" Enter Countdown: ");
    int count = sc.nextInt();
    
    while(count>=0 ) {
    System.out.println(count);
    sc.close();
    count --;

      }  
  }