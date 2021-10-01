package StringBuffer;

public class StringBufferAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("Hello");   ///in the earlier string we can change the value once it is assign but in string buffer we can do that
sb.append("world");   ///without creating anyother object we can easily append it to the orignal value
System.out.println(sb);
	}

}
