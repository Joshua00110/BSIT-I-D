import java.util.Scanner;
public class ESTUDILLO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] scores = new int[5][5];
        
        int sum = 0;
        int num = 0;
        
        System.out.println("Enter scores from 1-25:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter score for row " + (i + 1) + ", column " + (j + 1) + ": ");
                scores[i][j] = sc.nextInt();
                sum += scores[i][j];
                num++;
            }
        }
        double average =  sum / num;
        
        System.out.println("Average score: " + average);
    }
}