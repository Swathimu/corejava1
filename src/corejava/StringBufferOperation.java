package corejava;

public class StringBufferOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer  sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		/*sb.ensurecapacity(40);
		sb.ensurecapacity(50);
		sb.ensurecapacity(60);*/
		 
	}

}
