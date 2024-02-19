import java.util.Scanner;
public class QUIAPO_ACTIVITY_V{
    public static void main(String[] args) {
        Scanner ages = new Scanner(System.in);
        int age;
        System.out.print("Input your age: ");
        age = ages.nextInt();

        if (age>=0 && age>=11){
            System.out.print("Child");
        }
        else if (age>=12 && age>=17)
        System.out.print("Teen");
        else if (age>=18 && age>=64)
        System.out.print("Adult");
       
    }
}