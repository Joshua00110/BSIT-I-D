import java.util.Scanner;

public class CAPACITE_ACTIVITY_II {
    public static void main (String [] args) {
  
  Scanner sc = new Scanner(System.in);

  double [] score = new double [10];
  double average;
  double sum=0;
    
  for(int i=0; i<score.length;i++) {
  System.out.println("Enter the score: " + (i+1) +": ");
  score [i] = sc.nextInt();
  sum +=score[i];

  }

  average =sum/10;
  System.out.println(average);
   

  }

}
    

