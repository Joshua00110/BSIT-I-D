import java.util.Scanner;
public class PINILI_ACTIVITY_II{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int fnum = sc.nextInt();
        System.out.print("Second number: ");
        int snum = sc.nextInt();

        int sum = fnum + snum;
        int diff = fnum - snum;
        int product = fnum * snum;
        int quotient = fnum / snum;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
    }
}
