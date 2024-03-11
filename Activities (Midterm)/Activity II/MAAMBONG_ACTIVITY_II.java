import java.util.*;

public class MAAMBONG_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (double basta : arr) {
            sum = sum + basta;
        }

        double average = sum / arr.length;
        System.out.println("Average score: " + average);

    }
}
