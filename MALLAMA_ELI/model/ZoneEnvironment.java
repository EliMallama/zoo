//Class ZoneEnvironment definition
public class ZoneEnvironment {
	
	//ZoneEnvironment attributes
	private int environmentNumber=0;
	private double area=0;
	private Kangaroo one=null;
	private Kangaroo two=null;
	private Kangaroo three=null;
	
	
	//Class ZoneEnvironment constructor
	public ZoneEnvironment(int number)
	{
		this.environmentNumber=number;
	}
    
	//get and set for every attribute
	public int getEnvironmentNumber() {
		return environmentNumber;
	}

	public void setEnvironmentNumber(int environmentNumber) {
		this.environmentNumber = environmentNumber;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
    
	
	public Kangaroo getOne() {
		return one;
	}


	public void setOne(Kangaroo one) {
		this.one = one;
	}


	public Kangaroo getTwo() {
		return two;
	}


	public void setTwo(Kangaroo two) {
		this.two = two;
	}


	public Kangaroo getThree() {
		return three;
	}


	public void setThree(Kangaroo three) {
		this.three = three;
	}


	

	
	
}