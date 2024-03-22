import java.util.Scanner;
public class AGUILOS_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] scores = new int[5][5];
        
        int sum = 0;
        int num = 0;
    
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("Enter scores: ");
                scores[i][j] = sc.nextInt();
                sum += scores[i][j];
                num++;
            }
        }
        double average =  sum / num;
        
        System.out.println("Average score: " + average);
    }
}
