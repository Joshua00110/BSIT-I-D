import java.util.Scanner;

public class PAUSTOR_ACTIVITY_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];

        for(int s = 0; s < 10; s++) { 
          System.out.println("Enter Score" + (s + 1) + ": ");
          scores[s] = sc.nextDouble();
        }


        double sum = 0;
        for(double s: scores){
            sum += s;
        }
        double average = sum / scores.length;
        System.out.println("Average" + average);

    }
}

