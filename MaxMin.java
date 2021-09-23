
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  double a=9,b=2,min=0,max=0;
  MaxMin obj=new MaxMin();////creating the object
  max=obj.findmax(a,b);///calling functions
  min=obj.findmin(a,b);//calling functions
  System.out.println("the max value is "+max);
  System.out.println("the min value is "+min);
  System.out.println(findmin( a, b ));              ////actual parameter
	}
	public static double findmax(double a,double b)///defining function  //formal parameter// calling in the parameter
	{
		if(a>b) {
			return a;
		}
		else
		{
			return b;
		}
	}
	public static double findmin(double a,double b)//defining function  //formal parameter
	{
		if(a<b) {
			return a;
		}
		else
		{
			return b;
		}
	}
}
	

