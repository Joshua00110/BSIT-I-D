public class DAKAY_ACTIVITY_I{
    static void myMethod(int a){
        int length = getLength();
        int width = getWidth();
        int area = getArea();
        System.out.println("Area ="+ area);
    }
    static int getLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        return sc.nextInt();
    }
    static int getWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        return sc.nextInt();
    }