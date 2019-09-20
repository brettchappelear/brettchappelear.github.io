import java.util.Scanner;

public class Encryption {
	public static void main(String[] args ) {
		Scanner scnr = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int temp1;
		int temp2;
		
		n1 = scnr.nextInt();
		n2 = scnr.nextInt();
		n3 = scnr.nextInt();
		n4 = scnr.nextInt();
		
		n1 = n1 + 7;
		n1 = n1 % 10;
		n2 = n2 + 7;
		n2 = n2 % 10;
		n3 = n3 + 7;
		n3 = n3 % 10;
		n4 = n4 + 7;
		n4 = n4 % 10;
		
		temp1 = n1;
		n1 = n3;
		n3 = temp1;
		temp2 = n2;
		n2 = n4;
		n4 = temp2;
		
		System.out.println(n1 + n2 + n3 + n4);
		scnr.close();
		
		
	}
}
