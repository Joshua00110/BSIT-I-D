import java.util.Scanner;
    public class FLORES_ACTIVITY_II {

        public static void main(String []args){
            Scanner sc = new Scanner (System.in);

            double []score = new double [10];
            double average;
            double sum =0;

            for(int i= 0; i < score.length; i++){
            System.out.print("Enter score"+(i+1)+":");
            score[i] = sc.nextInt();
            sum + score[i];
            
        }
        double average=sum / score.length;
        System.out.printIn(average);
    }
}