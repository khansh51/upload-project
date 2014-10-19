import java.io.IOException;
import java.util.Scanner;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class test {
	
	
	public static void main(String[] args) throws IOException
	{
		boolean loggedIn = false;
		boolean run = true;
		Scanner userInput = new Scanner(System.in);
		String username = "", password, command = "";
		
		String tabs = new String(new char[7]).replace("\0", "\t");
		
		System.out.println(ansi().fg(BLUE).bold().a(getChars(200, "*")));
		System.out.println();
		System.out.println(tabs + "~~Welcome To Your TimeTable~~");
		System.out.println();
		System.out.println(getChars(200, "*"));
		ansi().reset();
		
		while(run){
			if(!loggedIn){
				println(2);
				System.out.println(ansi().reset().fg(RED).a(getChars(5, "\t") + getChars(60, "~")));
				System.out.println(getChars(8, "\t") + "You Must Log In");
				System.out.println(ansi().reset().fg(RED).a(getChars(8, "\t") + "----------------"));
				System.out.print(getChars(8, "\t") + "Username: ");
				username = userInput.nextLine();
				System.out.print(getChars(8, "\t") + "Password: ");
				password = userInput.nextLine();				
				System.out.println(getChars(5, "\t") + getChars(60, "~"));
				ansi().reset();
				
				loggedIn = true;
				println(5);
				System.out.println(ansi().fg(BLACK).bold().a(getChars(20, "-")));
				System.out.println(ansi().fg(BLACK).bold().a("Hello " + username));
				System.out.println(ansi().fg(BLACK).bold().a(getChars(20, "-")).reset());
			}
			
			println(2);
			System.out.print(ansi().fg(BLACK).a("Type One of the Commands (Add, Show, Log Out, Exit): ").reset());
			System.out.print(ansi().fg(BLUE).bold().a(""));
			command = userInput.nextLine();
			ansi().reset();
			
			if(command.toLowerCase().equals("add")){
				System.out.println(ansi().fg(MAGENTA).a("ok add").reset());
			}
			
			else if(command.toLowerCase().equals("show")){
				System.out.println(ansi().fg(MAGENTA).a("ok show").reset());
			}
			
			else if(command.toLowerCase().equals("log out")){
				System.out.println(ansi().fg(RED).a("You have logged out").reset());
				loggedIn = false;
			}
			
			else if(command.toLowerCase().equals("exit")){
				System.out.println(ansi().fg(RED).a("Program Closed").reset());
				run = false;
			}
			else{
				System.out.println(ansi().fg(MAGENTA).a("Sorry Did Not Reconize Your Command").reset());
			}			
			
		}
	
	}
	
	public static void println(int num){
		for(int i = 1; i <= num; i++){
			System.out.println();
		}
	}
	
	public static String getChars(int num, String sequence){
		String stars = new String(new char[num]).replace("\0", sequence);
		return stars;
	}	
	

}
