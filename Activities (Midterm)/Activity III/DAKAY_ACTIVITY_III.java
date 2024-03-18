import java.util.Scanner;
public class DAKAY_ACTIVITY_III{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[5][5];
        System.out.println("Enter score: ");
        for (int x = 0; x < score. length; x++){
            for (int y = 0; y < score.length; y++){
                System.out.print("Enter score for ROW " + (x + 1) +" and COLUMN " + (y+1) + ":");
                score[x][y] = sc.nextInt();
            }
        }
        int sum = 0;
        int count = 0;
        for (int x = 0; x < score. length; x++) {
            for (int y = 0; y < score.length; y++) {
                 sum += score [x][y]; 
                 count++;
            }
        }
        int average = (int) sum / count;
        System.out.println("The Average of the Scored: " + average);
    }
}