import java.util.Scanner;
public class JIMENEZ_ACTIVITY_III{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int[][] scores =new int[5][5];


        System.out.println("Enter Scores from 1-25");

        for(int i=0; i<scores.length; i++){
            for(int j=0; j<scores.length; j++){
                scores[i][j]=sc.nextInt();
                
            }
        }
        int sum =0;
        for (int i =0; i <scores.length ; i++){
            for(int j = 0; j<scores.length ; j++){
                sum += scores[i][j];
            }
        }

        double average = (double)sum/ (scores.length * scores.length);
        System.out.println("Average all Scores: "+ average);
     
        
    }
}
