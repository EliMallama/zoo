//Class Zone definition
public class Zone {
	
	//Zone attributes
	private String name="";
	private ZoneEnvironment one=null;
	private ZoneEnvironment two=null;
	private ZoneEnvironment three=null;
	private Pogona onep=null;
	private Pogona Twop=null;
	private int tempMaxPogona=40;
	private int tempMinPogona=35;
    private int minDiet=5;
	
  //Class Zone constructor
	public Zone(String name) 
	{
		this.name=name;
		one=new ZoneEnvironment(1);
		two=new ZoneEnvironment(2);
		three=new ZoneEnvironment(3);
		
		
	}
		
	//get and set for every attribute

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public ZoneEnvironment getOne() {
		return one;
	}



	public void setOne(ZoneEnvironment one) {
		this.one = one;
	}



	public ZoneEnvironment getTwo() {
		return two;
	}



	public void setTwo(ZoneEnvironment two) {
		this.two = two;
	}



	public ZoneEnvironment getThree() {
		return three;
	}



	public void setThree(ZoneEnvironment three) {
		this.three = three;
	}



	public Pogona getOnep() {
		return onep;
	}



	public void setOnep(Pogona onep) {
		this.onep = onep;
	}



	public Pogona getTwop() {
		return Twop;
	}



	public void setTwop(Pogona twop) {
		Twop = twop;
	}
	
	public int getTempMaxPogona() {
		return tempMaxPogona;
	}



	public void setTempMaxPogona(int tempMaxPogona) {
		this.tempMaxPogona = tempMaxPogona;
	}



	public int getTempMinPogona() {
		return tempMinPogona;
	}



	public void setTempMinPogona(int tempMinPogona) {
		this.tempMinPogona = tempMinPogona;
	}



	public int getMinDiet() {
		return minDiet;
	}



	public void setMinDiet(int minDiet) {
		this.minDiet = minDiet;
	}



    //Validate the temperature for the environment
	public String validateTemperature(int temp) {
		if(temp<tempMinPogona || temp>tempMaxPogona) 
		{return "Warning, temperature outside normal values(35-40)";}
		else {return "Temperature OK";}
	}
    
	//calculate the right amount of food(Kg) for every Pogona .
    public String validatePogonasDiet(int diet) {
    	if(diet<minDiet) 
    	{return "You must add food to the Pogona container";}
    	else {return "Amount of food OK";}
    }
	
	
}