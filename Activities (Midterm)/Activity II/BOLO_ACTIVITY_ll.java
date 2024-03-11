import java.util.Scanner;
public class BOLO_ACTIVITY_ll{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double[] scores = new double[10];
        double sum = 0;
        double average = 0;

    for(int x = 0; x < 10; x++){
      System.out.print("Enter a Scores: " + (x + 1) + ":");
      scores [x] = sc.nextInt();
      sum += scores[x];
    }

      average = sum / scores.length;

      System.out.println("The total of your average is: "+ average);

    

    }
}