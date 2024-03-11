import java.util.Scanner;

public class MACAPAZ_ACTIVITY_II{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


       double [] scores = new double[10];
       double sum = 0;
       double average;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter score" + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            sum += scores [1];            
        }
        average = sum / scores.length;

        System.out.println("The total Average score:" + average);
    }
}