import java.util.Scanner;

public class JIMENEZ_ACTIVITY_II{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[]scores = new int[10];
        int sum = 0;
        System.out.println("Enter The 10 Scores below: ");
        for(int i = 0; i < scores.length; i++) {
            System.out.print("Enter Score " + (i + 1) + ":");       
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.println("Your Average score is: " + average);
    }
}   