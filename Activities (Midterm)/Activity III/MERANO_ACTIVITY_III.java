import java.util.Scanner;
public class MERANO_ACTIVITY_III {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int[][] scores = new int[5][5]; 
       
    System.out.println("Enter scores: ");

        for (int i = 0; i < scores.length; i++) {
            for (int k = 0; k < scores[i].length; k++) {
                scores[i][k] = sc.nextInt();
            }
        }

    
       int sum = 0;
       int count = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int k= 0;k < scores[i].length; k++) {
                sum += scores[i][k];
                count++;
            }
       } 
    double average = (double) sum / count;
        System.out.println("Average: " + average);

    }
    
}
