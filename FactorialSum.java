package ClassWork;
//import java.lang.NumberFormat;
//import java.util.Formatter;
public class FactorialSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int fact=1;
 int sum=0;
for(int i=1;i<=10;i++) {
	fact =fact*i;
}
String factorial=""+fact;
for(int i =0;i<factorial.length();i++) {
	sum+=factorial.charAt(i)-'0';
}
System.out.println(Integer.toString(sum));
	}

}
