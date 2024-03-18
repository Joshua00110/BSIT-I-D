import java.util.Scanner;
public class BARNIDO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [][] score= new int[5][5];
        int sum=0;
        System.out.println("Enter Score: ");
        for(int i=0;i<score.length;i++){
          for(int j=0;j<score.length;j++){
            score [i][j]=sc.nextInt();

            sum+=score[i][j];
          }
        }
        double average= (double) sum/25;
        System.out.println("Average: "+ average);
    }
}
