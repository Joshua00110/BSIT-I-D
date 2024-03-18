import java.util.Scanner;
public class LARVIO_ACTIVITY_III{
    public static void main(String [] argas){
    Scanner sc = new Scanner(System.in);

    int [][] score = new int [5][5];
    for (int x = 0; x < score.length; x++){
        for (int y = 0; y < score.length; y++){
            System.out.print("Enter score for row" + (x+1) + ",colomn" +(y+1) + ":");
            score[x][y] = sc.nextInt();

        }
    }
     
    int sum = 0;
    int count = 0;

    System.out.println("Enter Scores:");
    for (int x = 0; x < score.length; x++){
        for (int y = 0; y < score.length; y++){
            sum+=score[x][y];
        }
    }
    
    double average = (double) sum / 25;
    System.out.println("Enter Average of the Scores: " + average);

    }
}

    

