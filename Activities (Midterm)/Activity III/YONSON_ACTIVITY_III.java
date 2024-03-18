import java.util.Scanner;

public class YONSON_ACTIVITY_III {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[5][5];

        System.out.println("Enter a score: ");

        for(int i=0; i<scores.length; i++){
            for(int y=0; y<scores[i].length; y++){
                scores[i][y]= sc.nextInt();
            }
        }
        int sum = 0;
        for(int [] row : scores){
            for(int score : row){
                sum+=score;
            }
        }
        double average = (double) sum / 25;
        System.out.println("The average of the score your entered is : " + average);


    }
    
}
