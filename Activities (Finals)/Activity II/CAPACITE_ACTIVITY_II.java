import java.util.Scanner;

public class CAPACITE_ACTIVITY_II {
    static void getfeet(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the feet: ");
    int feet = getfeet();
    int inches = feet * 12;
    System.out.println(inches);
    } 
   public static void main(String [] args){
        getfeet();
        
    }  
}