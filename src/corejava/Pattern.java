package corejava;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
for(int i=0; i<=n; i++) {
	for(int j=0; j<=i; i++ ) {
		System.out.println("*");
	}
	System.out.println();
	
}
	}

}
