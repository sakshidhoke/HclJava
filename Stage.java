package Idesign5;

public class Stage extends Event {
	// private static String String;

	

	public Integer noOfShows;
     public Integer noOfSeatsPerShow;
     
     public void setNoOfShows(Integer noOfShows){
         this.noOfShows=noOfShows;
     }
     public Integer getNoOfShow1(){
         return this.noOfShows;
     }
     public void setNoOfSeatsShows(Integer noOfSeatsPerShow){
         this.noOfSeatsPerShow=noOfSeatsPerShow;
     }
     public Integer getNoOfShow(){
         return this.noOfSeatsPerShow;
     }
     public Stage(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerShow){
        super(name,detail,ownerName);
        this.noOfShows=noOfShows;
         this.noOfSeatsPerShow=noOfSeatsPerShow;
     }
     
    
	@Override
	public Double projectRevenue() {
		// TODO Auto-generated method stub
		 double value=noOfShows*noOfSeatsPerShow*50;
         return value;
		
	}
       
}

