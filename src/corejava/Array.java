package corejava;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new
		Scanner(System.in);		
//int age[]= {12,5,9,10,4};
//System.out.println("Accessing element of array");
//System.out.println("first element:"+age[0]);
/*System.out.println("Length"+age.length);
for(int i=0;i<age.length;i++){
	System.out.println(age[i]);*/
System.out.println("Enter the size of array:");
int n=scan.nextInt();
int num[]=new int[n];
System.out.println("Enter array element:");
for(int i=0;i<n;i++) {
	num[i]=scan.nextInt();
}
System.out.println("array elements");
for(int i=0;i<n;i++);


	
	};

}
		//matrix of array;
/*Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 name");
String name[]=new String[5];
for (int i=0;i<name.length;i++) {
	name[i]=sc.nextLine();
}
{
	System.out.println("names are........");
	for(int i=0;i<name.length;i++)
	{
		System.out.println(name[i]);
	}
}
	}
}*/
