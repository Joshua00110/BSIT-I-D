import java.util.Scanner;
public class MAASIN_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner arith = new Scanner(System.in);
        
        System.out.print("First Number: ");
        int fn = arith.nextInt();
        System.out.print("Second Number: ");
        int sn = arith.nextInt();

        int Sum = fn + sn;
        int Diff = fn - sn;
        int Pro = fn * sn;
        int Quo = fn / sn;

        System.out.println("Sum= "+ Sum);
        System.out.println("Diff= "+ Diff);
        System.out.println("Pro= "+ Pro);
        System.out.println("Quo= "+ Quo);


        
    }
    
}