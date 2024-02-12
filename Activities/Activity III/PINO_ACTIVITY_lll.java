import java.util.Scanner;
public class PINO_ACTIVITY_lll{
	public static void main(String args[]){
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		int temp = input.nextInt();

		if(temp >= 100){
			System.out.println("Boiling");
		}else
			System.out.println("Not boiling");

		}
	}