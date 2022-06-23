package corejava;

public class StrBuildOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuilder sb=new StringBuilder("Hello World");
   System.out.println("length------>"+sb.length());
   System.out.println("capacity------>"+sb.capacity());
   System.out.println("insert----->"+sb.insert(1, "swathi"));
   System.out.println("replace---->"+sb.replace(4, 6, "saru"));
   System.out.println("delete------>"+sb.delete(4, 7));
   System.out.println("reverse----->"+sb.reverse());
   System.out.println("append------>"+sb.append("orange"));
   sb.ensureCapacity(20);
   System.out.println("capacity---->"+sb.capacity());
   StringBuilder sb1=new StringBuilder();
   System.out.println("capacity------>"+sb1.capacity());
	}

}
