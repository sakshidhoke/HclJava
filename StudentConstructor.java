package Example;

public class StudentConstructor {
int reg;
String Name;
String place;
double marks;
int	rollno;
String name;
StudentConstructor(){//default
	System.out.println("Constructor created");
}
StudentConstructor(int r,String N){  //paramertized cons
	reg=r;
	Name=N;
	System.out.println("the name"+Name+"and reg is "+reg);
}
StudentConstructor(int r,String N,double m,String p){
	reg=r;
	Name=N;
	marks=m;
	place=p;
	System.out.println("the name"+Name+"and reg is "+reg+" marks is"+marks+"and place will be "+place);
}
StudentConstructor(StudentConstructor sb1){///copy constructor
	rollno =sb1.reg;
	name =sb1.Name;
	System.out.println("the name"+name+"and reg is "+rollno);
}
void display() {
	
	System.out.println("the name"+Name+"and reg is "+reg);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentConstructor sb=new StudentConstructor();//default constructor
StudentConstructor sb1=new StudentConstructor(123,"Sakshi");//paramterized constructor
StudentConstructor sb2=new StudentConstructor(123,"Sakshi",99.5,"Nagpur");//  constructor overloading
StudentConstructor sb3=new StudentConstructor(sb1);
//sb3.display();
//sb1.display();
	}

}
