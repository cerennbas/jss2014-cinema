package cinema.model;

public class Bilet {
    private Seans seans;
    private Salon salon;
    private int id;
    private int row;
    private int col;
    
    
    
    
	public Bilet(Seans seans, Salon salon, int row, int col) {
		super();
		this.seans = seans;
		this.salon = salon;
		this.row = row;
		this.col = col;
	}
	public Bilet(Seans seans, Salon salon, int id, int row, int col) {
		super();
		this.seans = seans;
		this.salon = salon;
		this.id = id;
		this.row = row;
		this.col = col;
	}
	public Seans getSeans() {
		return seans;
	}
	
	public Salon getSalon() {
		return salon;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
}
