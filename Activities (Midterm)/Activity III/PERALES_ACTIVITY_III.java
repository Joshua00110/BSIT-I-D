import java.util.Scanner;
public class PERALES_ACTIVITY_III{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int [][] scores = new int [5][5];
    int sum=0;
    for(int i=0; i<scores.length;i++){
    System.out.println("User no. "+(i+1)+": ");
    for(int k= 0; k<scores.length; k++){
    System.out.println("Enter score: "+(k+1));
            scores [i][k]= sc.nextInt();

            sum+=scores[i][k];
        }
    }



         double average= (double)sum/25;
         System.out.println("average: "+average);
    
    }    
           
}        
           
        

    
    
