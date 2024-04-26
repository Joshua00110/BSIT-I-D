import java.util.Scanner;

public class QUIAPO_ACTIVITY_II {

    public static void main(String[] args) {
        Scanner activity = new Scanner(System.in);
        double[] scores = new double[10];
        
        for(int s = 0; s < 10; s++){
            System.out.println("Enter Score" + (s + 1) + ": ");
            scores[s] = activity.nextDouble();

        }

        double sum = 0;
        for(double s: scores){
            sum += s;
        }
        double average = sum / scores.length;
        System.out.println("Average Score: " + average);
        
    }
}