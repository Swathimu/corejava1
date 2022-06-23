package corejava;
import java. util.Scanner;
class Student{
	String name;
	int roll_no;
	void display(String name,int roll_no)
	{
		System.out.println("Name:"+name+"\n+Roll_no:"+roll_no);
	}
	}
public class OopsCon{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
s.display("swathi",16);
	}

}

