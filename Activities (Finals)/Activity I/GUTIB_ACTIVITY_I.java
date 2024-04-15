import java.util.Scanner;

public class GUTIB_ACTIVITY_I {

    static int width() {
        System.out.print("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int length() {
        System.out.print("Enter the width: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int width = width();
        int length = length();
        int result = width() * length();
        System.out.println("Area of the rectangle is " + result);

    }
}