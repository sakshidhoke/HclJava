package eBox;
import java.util.Scanner;

public class ArraySingleDimension {
	public static void main(String[] args) {
		int [] item_id;
		float[]  item_price;
		item_id=new int[3];
		item_price=new float[3];
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the value of item id 1");
		item_id[0]=sc.nextInt();
		System.out.println("enter the value of item price 1");
		item_price[0]=sc.nextFloat();
		System.out.println("enter the value of item id 2");
		item_id[1]=sc.nextInt();
		System.out.println("enter the value of item price 2 ");
		item_price[1]=sc.nextFloat();
		System.out.println("enter the value of item id 3");
		item_id[2]=sc.nextInt();
		System.out.println("enter the value of item price 3 ");
		item_price[2]=sc.nextFloat();
		System.out.println("the value of item id "+item_id[0]+"price is"+item_price[0]);*/
		for(int i=0;i<3;i++) {
			System.out.println("Enter the value of team "+i);
			item_id[i]=sc.nextInt();
			item_price[i]=sc.nextFloat();
			
		}
		for(int i=0;i<3;i++) {
			System.out.println("item "+item_id[i]+"price " +item_price[i]);
		}
		
	
	}
}
