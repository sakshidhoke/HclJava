package Idesign5;

public abstract class Event {
	protected String name;
    protected String detail;
    protected String ownerName;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
    public String getDetail(){
        return this.detail;
    }
    public void setOwnerName(String ownername){
        this.ownerName=ownername;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    
    public Event(String name, String detail, String ownerName){
        this.name=name;
        this.detail=detail;
        this.ownerName=ownerName;
    }
    
    public abstract Double projectRevenue();
}
