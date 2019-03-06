//Class Zoo definition
public class Zoo {

	//Zoo attributes
	private String name="Cali's Zoo";
	private String exhibition="Australia, where the water is gold";
	private double exhibitionArea=1500;
	private Zone one=null;


	//Class Zoo constructor
	public Zoo() 
	{
		one=new Zone("Kangaroo's Zone");
	}

	//get and set for every attribute
	public Zone getOne() {
		return one;
	}


	public void setOne(Zone one) {
		this.one = one;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getExhibition() {
		return exhibition;
	}


	public void setExhibition(String exhibition) {
		this.exhibition = exhibition;
	}


	public double getExhibitionArea() {
		return exhibitionArea;
	}


	public void setExhibitionArea(double exhibitionArea) {
		this.exhibitionArea = exhibitionArea;
	}


 
	
	
	
	
}

