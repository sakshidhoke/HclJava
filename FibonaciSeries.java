package Hw;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=0;
		int x2=1;
		int temp;
		System.out.print(x1+" "+x2);   //0 1
		for(int i=2;i<=10;i++) {
			int x3=x1+x2;   //1
			System.out.print(" "+x3);  //011
			temp=x1;       
			x1=x2;
			x2=x3;
			x3=temp;
		}

	}

}
