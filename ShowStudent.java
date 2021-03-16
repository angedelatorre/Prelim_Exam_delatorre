import java.util.Scanner;
public class ShowStudent {
	   public static void main(String[] args) {
	       Scanner sd = new Scanner(System.in);
	       System.out.print("Enter ID Number: ");
	       int IDnum = sd.nextInt();
	       System.out.print("Enter number of points: ");
	       int points = sd.nextInt();
	       System.out.print("Enter number of credit: ");
	       int credithours = sd.nextInt();
	       Student a = new Student(IDnum, credithours, points);
	       System.out.print(a);
	       
	       
	   }
	}