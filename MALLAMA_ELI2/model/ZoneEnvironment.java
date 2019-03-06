
//Class ZoneEnvironment definition
public class ZoneEnvironment {
	
	//ZoneEnvironment attributes
	private int environmentNumber=0;
	private double area=0;
	private Kangaroo[] kangaroos=new Kangaroo[3]; 
	boolean male=false;
	int currentKangaroos=0;
	int maxKangaroos=3;
	int maxPogonas=2;
	
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
  
	public boolean getMale() {
		return male;
		}
	
	//Add a kangaroo to the monitor system

	public boolean addKangaroo(Kangaroo kangaroo) 
	{
	boolean added=true;

	if(kangaroo.getSex()=='M') 
	{
	isMale();	
	if(!male) 
	{
	if(currentKangaroos==0) {kangaroos[0]=kangaroo;}
	if(currentKangaroos==1) {kangaroos[1]=kangaroo;}
	if(currentKangaroos==2) {kangaroos[2]=kangaroo;}
	if(currentKangaroos>2){added=false;}
	else {currentKangaroos++;}
	calculateEnvironmentArea();
	}else {added=false;}

	if(added) {isMale();}
	}
	else {
	if(currentKangaroos==0) {kangaroos[0]=kangaroo;}
	if(currentKangaroos==1) {kangaroos[1]=kangaroo;}
	if(currentKangaroos==2) {kangaroos[2]=kangaroo;}
	if(currentKangaroos>2){added=false;}
	else {currentKangaroos++;}
	calculateEnvironmentArea();
	}

	return added;
	}

	//Verify if the kangaroo to add is male or female
	public void isMale() 
	{
	if(kangaroos[0]!=null) {
	if(kangaroos[0].getSex()=='M' ) {male=true;}}

	if(kangaroos[1]!=null) {
	if(kangaroos[1].getSex()=='M' ) {male=true;}}
	if(kangaroos[2]!=null) {
	if(kangaroos[2].getSex()=='M' ) {male=true;}}
	}

	
	//Calculate the total area for the environment
	
	public double calculateEnvironmentArea() {
		double i=0;
		if(kangaroos[0]!=null) {
		i=i+kangaroos[0].getHeight()*8;
		}
		if(kangaroos[1]!=null) {
		i=i+kangaroos[0].getHeight()*8;
		}
		if(kangaroos[2]!=null) {
		i=i+kangaroos[0].getHeight()*8;
		}

		this.area=i;
		return i;
		}

	
	//Show environment information
	public String toString() {
		
		String infoK="";
		if(kangaroos[0]!=null) {infoK+=" "+kangaroos[0].toString();}
		if(kangaroos[1]!=null) {infoK+=" "+kangaroos[1].toString();}
		if(kangaroos[2]!=null) {infoK+=" "+kangaroos[2].toString();}
		
		return "Environment=" + environmentNumber + ", area=" + area + ", maxKangaroos="
		+ maxKangaroos + ", maxPogonas=" + maxPogonas + ", currentKangaroos=" + currentKangaroos
		+ ", kangaroos=" + " "+infoK;
		}
	
	
}