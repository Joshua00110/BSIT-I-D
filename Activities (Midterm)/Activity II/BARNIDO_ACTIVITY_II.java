import java.util.Scanner;
public class BARNIDO_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [] score= new int [10];
        double average;
        int sum=0;

        for(int i=0;i<score.length;i++){
            System.out.println("Enter score "+(i+1)+": ");
            score [i]= sc.nextInt();
            sum +=score[i];
        }
        average=(double)sum/10;
        System.out.println("Average: "+average);
        

    }
}
