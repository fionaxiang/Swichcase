import java.util.Scanner;
public class Switchcase {
	public static void main(String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter this people's role");
		String role =keyboard .nextLine();
		String a,b,c,d,e;
		a="Admin";
		b="Faculty";
		c="Staff";
		d="Student";
		e="Guest";
		switch(role){
		case "Admin": System.out.println("Welcome " +  a);break;
		case "Faculty": System.out.println("Welcome " + b);break;
		case "Staff": System.out.println("Welcome " + c);break;
		case "Student": System.out.println("Welcome " + d);break;
		case "Guest": System.out.println("Welcome " + e);break;
	
		}
		}
	}



