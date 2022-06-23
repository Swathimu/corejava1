package corejava;

public class Panlindrom {
public static void main(String args[]) {
	String myString="amma";
	StringBuffer buf=new StringBuffer(myString);
	buf.reverse();
	String data=buf.toString();
	System.out.print("reverse the string:"+data);
	if(myString.equals(data)) {
		System.out.println(" your word is palindrome");
	}else {
		System.out.println(" your word is not palindrome");
	}
}
}
