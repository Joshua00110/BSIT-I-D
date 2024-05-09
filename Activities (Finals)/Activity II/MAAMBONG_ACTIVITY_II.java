import java.util.*;

public class MAAMBONG_ACTIVITY_II {
    static void Feet(double feet) {
        System.out.println(feet * 12);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the feet : ");
        int feet = sc.nextInt();
        System.out.print("Inches : ");
        Feet(feet);

        sc.close();
    }
}
