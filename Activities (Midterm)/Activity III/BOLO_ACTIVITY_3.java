import java.util.Scanner;
public class BOLO_ACTIVITY_3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int [] [] scores = new int [5] [5];

        int prod = 0;
        int qout = 0;
    

        for(int i = 0; i < scores.length; i++){
            for(int x = 0; x < 5; x++){
                System.out.print("Enter your score for row "+ (i+1) + " and column "+ (x+1) +  ":");
                scores [i] [x] = sc.nextInt();
                prod += scores[i] [x];
                qout++;
            }
        }
        double average = prod / qout;
        System.out.println("You`re average scores is "+ average);

    }
}