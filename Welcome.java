import java.util.Scanner;

public class Welcome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name :");
		String Fname = sc.nextLine();
		
		System.out.print("Enter your second name :");
		String Lname = sc.nextLine();
		
		System.out.println("Welcome to the Second Year "+ Fname +" "+ Lname);
		
	
		
	}
		
}
