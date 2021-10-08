import java.util.*;
import java.util.Scanner;

public class Assi11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("side 1");
int x=sc.nextInt();
System.out.println("side 2");
int y=sc.nextInt();
System.out.println("side 3");
int z=sc.nextInt();
int total=(x+y+z);
if(total==180) {
	//System.out.println("Prize 1");

if(x==90 || y==90  || z==90) {
	System.out.println("Prize 2");
}
else if(x==60 && y==60 && z==60) {
	System.out.println("Prize 3");
}
	else {
		System.out.println("Prize 1");
	}
}

else
{
	System.out.println("No Prize");
}
	}

}
