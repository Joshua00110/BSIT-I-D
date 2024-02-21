import java.util.Scanner;
	public class BOYLES_ACTIVITY_VI{
        public static void main(String[] args) {
            Scanner S = new Scanner(System.in);
        
            System.out.print("Enter Amount of Seconds:");
            int time;
            time = S.nextInt();
            while(time >=0){
                System.out.println(time);
                time--;
            }

        }


    }
        