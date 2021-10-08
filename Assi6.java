import java.util.*;
import java.util.Scanner;

public class Assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("branding expense");
double bd=sc.nextDouble();
System.out.println("food expense");
double fe=sc.nextDouble();
System.out.println("travel expense");
double te=sc.nextDouble();
System.out.println("logistic expense");
double le=sc.nextDouble();
float total =(float)(bd+fe+te+le);
float bd1=(float)bd/total;
float bd2=(float)bd1*100;
String bd3=String.format("%.2f",bd2);
System.out.println("Branding expense percentage:"+bd3);


	}

}
