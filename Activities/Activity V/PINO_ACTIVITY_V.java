import java.util.Scanner;
 public class PINO_ACTIVITY_V{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = in.nextInt();
        
        if(age>=0){
        System.out.print("Child");
        }
        else if(age>=11){
        System.out.print("Teen");
        }
        else if(age>=18){
        System.out.print("Adult");
        }



    }
 }