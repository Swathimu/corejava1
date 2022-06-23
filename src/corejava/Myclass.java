package corejava;

abstract class Myclass {
abstract void calculate(double x);
}
class Square extends Myclass
{
	void calculate(double x)
	{
		System.out.println("Square"+(x*x));
}
}
class SquareRoot extends Myclass
{
	void calculate(double x)
	{
		System.out.println("squareRoot"+Math.sqrt(x));
	}
}
class Arithmatic
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square object1=new Square();
object1.calculate(4);
SquareRoot object2=new SquareRoot();
object2.calculate(4);
Myclass reference;
reference=object1;
object1.calculate(5);
}

}
