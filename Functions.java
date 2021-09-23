
public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number=12,result=0;
		
		Functions obj=new Functions();
		result=obj.findcube(number);
		result=obj.findsquare(number);
		//System.out.println(findcube(number));
		System.out.println("the cube of number "+number+"is"+result);
		System.out.println("the square of number "+number+"is"+result);
	}
	public static double findcube(double number) {
		double cubevalue= number*number*number;
		return cubevalue;
	}
	public static double findsquare(double number) {
		double squarevalue= number*number*number;
		return squarevalue;}

}
