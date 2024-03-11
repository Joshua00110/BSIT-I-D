import java.util.Scanner;
public class PALAO_ACTIVITY_II {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int [] scores = new int[10]; 

    int sum = 0;
    for(int i = 0; i < scores.length; i++){
        System.out.println("Enter score " +(i + 1) + ": ");
        scores [i]= sc.nextInt();
        sum +=scores[i]; 
    }

    double average = sum / scores.length;

    System.out.println(average);

    
    }
}


