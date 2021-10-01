import java.util.Scanner;

public class RemoveElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int x=sc.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
		int index=-1;
		System.out.println("enter the element to be removed");
		int y=sc.nextInt();
		for(int i=0;i<x;i++) {
			if(arr[i] == y) {
				index=i;
			}
		}
		if(index != -1) {
			for(int i=index;i<x-1;i++) {
				arr[i]=arr[i+1];
			}
		}
		for(int i=0;i<x-1;i++) {
System.out.println(arr[i]);
	}}

}
