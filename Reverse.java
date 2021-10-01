package StringBuffer;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sb=new String("SAKSHI");  /////////////I REVERSE THE STRING WITHOUT USING REVERSE OPERATOR
char [] c=sb.toCharArray();
for(int i=5;i>=0;i--) {
	System.out.print(c[i]);
}

System.out.println();
StringBuffer sb1=new StringBuffer("MADHURI");
sb1.reverse();
System.out.println(sb1);
	}

}
