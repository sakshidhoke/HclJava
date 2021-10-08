import java.util.Scanner;
import java.util.*;

public class Asi12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int [] arr1=new int[x];
int [] arr2=new int[x];
for(int i=0;i<x;i++) {
	arr1[i]=sc.nextInt();
}
for(int j=0;j<x;j++) {
	arr2[j]=sc.nextInt();
}
int [] sum=new int[x];
for(int i=0;i<x;i++)  {
		sum[i]=arr1[i]+arr2[i];
		System.out.print(sum[i]+"");
	}


	}
}

