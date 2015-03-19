import java.util.Scanner;
public class Switchcase {
	public static void main(String [] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Choose the people's role" );
		System.out.println( "1,Admin" );
		System.out.println( "2,Faculty" );
		System.out.println( "3,Student" );
		System.out.println( "4,Admin" );
		System.out.println( "5,Guest" );
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



