import java.util.Scanner;
public class CANEZARES_ACTIVITY_II{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);


        int [] scores = new int[10];
        double sum = 0;
        double average;
        
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        average = sum / scores.length;

        System.out.println("The total Average score: " + average);
    }
}