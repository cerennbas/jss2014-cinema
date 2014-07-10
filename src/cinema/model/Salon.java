package cinema.model;

public class Salon {
	private int id;
    private int row;
    private int col;
    private String name;
    
    
    
    public Salon(int row, int col, String name) {
		super();
		this.row = row;
		this.col = col;
		this.name = name;
	}

	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Salon [rows=" + row+ ", cols=" + col + ", name=" + name
				+ "]";
	}
    

}
