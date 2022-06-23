package corejava;

public class SuperClass {
void parent()
{
	System.out.println("it is the parent class");
}
class Subclass extends SuperClass{
	void parent()
	{
		System.out.println("same as parent method");
	}
}
public class MethodOverriding {
	public static void main(String[]args) {
		SuperClass obj=new Subclass();
	obj.parent();
	}
}
