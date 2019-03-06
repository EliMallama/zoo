//Class Zone definition
public class Zone {
	
	//Zone attributes
	private String name="";
	private ZoneEnvironment[] environments=new ZoneEnvironment[3];
	private Pogona onePogona=null;
	private Pogona twoPogona=null;
	private int tempMaxPogona=40;
	private int tempMinPogona=35;
    private int minDiet=5;
	
//Class Zone constructor
	public Zone(String name) 
	{
		this.name=name;
		environments[0]=new ZoneEnvironment(1);
		environments[1]=new ZoneEnvironment(2);
		environments[2]=new ZoneEnvironment(3);
			
	}
		
	//get and set for every attribute

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public Pogona getOnePogona() {
		return onePogona;
	}

	public void setOnePogona(Pogona onePogona) {
		this.onePogona = onePogona;
	}

	public Pogona getTwoPogona() {
		return twoPogona;
	}

	public void setTwoPogona(Pogona twoPogona) {
		this.twoPogona = twoPogona;
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

  public ZoneEnvironment[] getEnvironments() {
		return environments;
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