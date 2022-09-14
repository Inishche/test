import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Bitcoin price: ");
	    Scanner scanner = new Scanner(System.in); 
	    double first = scanner.nextDouble();
	    System.out.println("How much dollars: ");
	    Scanner sec = new Scanner(System.in); 
	    double second = sec.nextDouble();
	    double bitc = second / first;
	System.out.print(String.format("%.7f", bitc));
	System.out.print(" BTC");
}
}
