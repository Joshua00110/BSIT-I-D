import java.util.Scanner;

public class PAUSTOR_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[5][5]; 

        for(int i = 0; i < 5; i++){
            System.out.println("Enter Score " + (i + 1) + ": ");
            for(int j = 0; j < 5; j++) {
                System.out.println("Enter Score " + (j + 1) + ": ");
            scores[i][j] = sc.nextInt();
            }

        }

        int sum = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                sum += scores[i][j];
            }
        }

        double average = (double) sum / (5 * 5);
        System.out.println("Average " + average);

    }
}