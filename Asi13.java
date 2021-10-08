import java.util.*;
import java.util.Scanner;
public class Asi13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element");
int x=sc.nextInt();
int[] arr=new int[x];
for(int i=0;i<x;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<x;i++) {/////2,5,1,8,9
	
		for(int j=i+1;j<x;j++) {
			if(arr[i]>arr[j]) {
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
//System.out.println(arr[i]);
	}
}
	for(int p=0;p<x;p++) {
		System.out.println(arr[p]);
	}
	}
}

