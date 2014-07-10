package cinema.model;

public enum Seans {
    ON(10), ONIKI(12), ONDORT(14), ONALTI(16),
    ONSEKIZ(18), YIRMI(20), YIRMIIKI(22);
    
    public int seans;
    private Seans(int seans){
    	this.seans = seans;
    }
    public int getSeans(){
    	return seans;
    }
}
