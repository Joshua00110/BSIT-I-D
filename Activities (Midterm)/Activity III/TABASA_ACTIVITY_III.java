import java.util.Scanner;
public class TABASA_ACTIVITY_III {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int [][] scores = new int[5][5];

        for (int i = 0; i < scores.length; i++){
            System.out.println("Enter scores "+ (i+1)+ ":");
            for (int x = 0; x < scores[i].length; x++){
                scores [i][x] = input.nextInt();
            }
        }

        double sum = 0;
        int count = 0;
        for (int i = 0; i < scores.length; i++){
            for (int x = 0; x < scores[i].length; x++){
                sum += scores [i][x];
                count++;
            }
        }

        double average = sum/count;
        System.out.println("The average of all scores: "+ average);
    }
}
