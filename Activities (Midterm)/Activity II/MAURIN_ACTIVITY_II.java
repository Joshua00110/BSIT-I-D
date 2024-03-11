import java.util.Scanner;
public class MAURIN_ACTIVITY_II{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        double [] scores = new double[10];
        double sum = 0;

        for(int i=0; i < 10; i++){
            System.out.print("Enter scores: " + (i+1)+ ": " );
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        double average = sum/scores.length;

        System.out.println("Average score: " +average);    }
}