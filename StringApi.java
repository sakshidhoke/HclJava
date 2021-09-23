
public class StringApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello";
		String msg1 = "Hello";
		System.out.println("Message - "+msg);
		System.out.println("3rd character of word today - "+msg.charAt(3));
		System.out.println(" Hello World compare to Hello: "+msg.compareTo("World"));// when 2 strings are equal =0
		System.out.println("Is Hello World equals to Holiday- "+msg.equals("Holiday")); //st1>st2=+ve value ;str1<str2=-ve
		//System.out.println(msg=="Hello");
		System.out.println(msg==msg1);
		
		System.out.println("Length of sentence : "+msg.length());
		System.out.println("Replace e's with s - "+msg.replace('e', 's'));
		int index= msg.indexOf('l');
		System.out.println(index);
		String t= msg.substring(3);
		System.out.println(t);
		

	}

}
