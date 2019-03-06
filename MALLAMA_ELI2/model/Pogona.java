//Class Pogona definition
public class Pogona {

	//Class Pogona constructor
	private String name="";
	private double weight=0;
	private double height=0;
	private double bim=0;
	
	
	//Class Pogona constructor
	public Pogona(String name,double weight, double height) 
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
		calculateBIM();
	}

	//get and set for every attribute

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	//calculate the body mass index
	
	public void calculateBIM() 
	{
		this.bim= weight/(height*height);
	}
	
	//calculate the right amount of water(Lts) for every pogona .
	public String calculateWater() 
   {
		return "Required water: "+bim*0.75+"Lts ";
   }
	
	
}
