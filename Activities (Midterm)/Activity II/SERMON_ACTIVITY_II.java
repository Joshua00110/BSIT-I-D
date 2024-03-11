import java.util.Scanner;
public class SERMON_ACTIVITY_II {

      public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];
        
        
        System.out.println("Enter 10 scores");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        
        
        System.out.println("Average score: " + average);
    }
}