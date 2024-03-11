import java.util.Scanner;

public class PINILI_ACTIVITY_II{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[]scores = new int[10];
        double sum = 0;
        System.out.println("Enter 10 scores: ");
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter score " + (i + 1) + ":");       
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        double average = sum / 10;

        System.out.println("Your Average score is: " + average);
    }
}
