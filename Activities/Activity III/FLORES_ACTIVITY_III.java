import java.util.Scanner;
public class FLORES_ACTIVITY_III {
  public static void main (String []args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input temperature in Celsius!");
    int x = sc.nextInt();
    if(x >= 100) {
      System.out.println("Boiling");
    } else {
      System.out.println("Not Boiling");
    }
  }
}