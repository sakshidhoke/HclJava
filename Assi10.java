import java.util.*;
import java.util.Scanner;

public class Assi10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int x=sc.nextInt();
if(x%10==3 || x%10==8) {
	System.out.println("Lucky Winner");
}
else
{
	System.out.println("not a winner");
}
	}

}
