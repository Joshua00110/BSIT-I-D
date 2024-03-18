import java.util.Scanner;
public class PALAO_ACTIVITY_III{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    int [][] score = new int [5][5];
    System.out.println("Enter scores: ");
    for (int x = 0; x < score.length; x++){
        for(int y = 0; y < score.length; y++){
            System.out.print("Enter score for row" + (x+1) + ",colon" +(y+1) + ":");
            score[x][y] = scanner.nextInt();
            sum+=score[x][y];

        }
    }
    
    double average = (double) sum /25;
    System.out.println("Enter Average of the Scores: " + average);

    }
}            
        



