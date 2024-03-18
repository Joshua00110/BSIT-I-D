import java.util.Scanner;
public class SURIG_ACTIVITY_III {
      public static void main(String[] args) {
        
        int[] scores = new int[25];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter scores:");

        for (int i = 0; i < 25; i++) {
           
                scores[i] = sc.nextInt();
            
        }

        double sum = 0;
        int count = 0;
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                sum += scores[i];
                count++;
            }
        }
        
      
        if (count != 0) {
            double average = sum / count;
            System.out.println("Average of scores: " + average);
        } else {
            System.out.println("No scores entered. Cannot calculate average.");
        }
    }
}