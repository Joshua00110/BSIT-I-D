import java.util.Scanner;
public class TABASA_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] scores = new int[10];
        int sum = 0;
        
        for (int x = 0; x < scores.length; x++ ){
            System.out.print("Enter scores: "+ (x +1)+ ":");
            scores[x] = input.nextInt();
            sum += scores[x];
        }

        double Average = (double) sum / scores.length;
        System.out.println("The Average score: "+Average);

    }
}