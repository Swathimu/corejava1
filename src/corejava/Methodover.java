package corejava;

public class Methodover {
void sum(int a,int b) {
	System.out.println(a+b);
}
void sum(int a,int b,int c) {
	System.out.println(a+b+c);
	
}
void sum(double a,double b) {
	System.out.println(a+b);
	
}
void sum(int a,double b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodover obj=new Methodover();
obj.sum(20,20,20);
obj.sum(10,10);
obj.sum(13.3,15.5);
obj.sum(10,11);
	}

	}


