package Idesign5;

public class Exhibition extends Event {
	 public Integer noOfStalls;
     
     public void setNoOfStalls(int noOfStalls){
         this.noOfStalls=noOfStalls;
     }
     public Integer getNoOfStalls(){
         return this.noOfStalls;
     }
     
     public Exhibition(String name, String detail, String ownerName, Integer noOfStalls){
         super(name,detail,ownerName);
         this.noOfStalls=noOfStalls;
     }
     @Override
     public Double projectRevenue(){
       double value= noOfStalls*10000;
       return value;
         //System.out.println(value);
     }
}

