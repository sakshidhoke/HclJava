import java.util.*;
import java.util.Scanner;
	
public class Assi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
String name=sc.nextLine();
System.out.println("Enter the Roll no");
int rollno=sc.nextInt();
System.out.println("Enter the Subject");
String subject=sc.next();
System.out.println("Enter the grade");
char grade=sc.next().charAt(0);
System.out.println(name+" Details:");
System.out.println("Roll No: "+rollno);
System.out.println("Subject:"+subject);
System.out.println("Grade: "+grade);


	}

}
