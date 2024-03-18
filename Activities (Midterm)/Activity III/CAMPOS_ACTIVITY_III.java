import java.util.*;
public class CAMPOS_ACTIVITY_III {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         
        int [][] scores = new int [5][5];
        int sum=0;


        System.out.println("Enter score: ");
        for(int i=0; i<scores.length;i++){
        for(int k= 0; k<scores.length; k++){ 
                scores [i][k]= sc.nextInt();
            
                sum+=scores[i][k];
            }
        }
            double average= (double)sum/25;
            System.out.println("average: "+average);
        
        }
    
}
