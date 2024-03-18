import java.util.*;
public class MAGSAYO_ACTIVITY_III {
    public static void main(String[] args) {
        int [][]scores = new int [5][5];
        Scanner arr = new Scanner(System.in);   
        System.out.println("Enter scores: ");
        for(int i = 0; i < scores.length; i++){
            for(int k = 0; k < scores[i].length; k++){
                scores[i][k] = arr.nextInt();
            }
        }
        int sum = 0;
        int count = 0;
        for(int i = 0; i < scores.length; i++){
            for(int k = 0; k < scores[i].length; k++){
                sum += scores[i][k];
                count ++;


            }
    
        }
        double average = (double) sum/count;
        System.out.println("Average: " + average);
    }
    
}

        