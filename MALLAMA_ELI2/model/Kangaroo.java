//Class Kangaroo definition
public class Kangaroo {

	
	//Kangaroo attributes
	private String name="";
	private double weight=0;
	private double height=0;
	private char sex='N';
	private String bloodType="N";
	private int dayBirth=0;
	private int monthBirth=0;
	private int yearBirth=0;
	private double bmi=0;
	private String time="";
	
	
	
	//Class Kangaroo constructor
	public Kangaroo(String name,double weight, double height, char sex, String bloodType, int dayBirth, int monthBirth, int yearBirth) 
	{
	this.name=name;
	this.weight=weight;
	this.height=height;
	this.sex=sex;
	this.bloodType=bloodType;
	this.dayBirth=dayBirth;
	this.monthBirth=monthBirth;
	this.yearBirth=yearBirth;
	calculateBMI();
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


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public String getBloodType() {
		return bloodType;
	}


	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}


	public int getDayBirth() {
		return dayBirth;
	}


	public void setDayBirth(int dayBirth) {
		this.dayBirth = dayBirth;
	}


	public int getMonthBirth() {
		return monthBirth;
	}


	public void setMonthBirth(int monthBirth) {
		this.monthBirth = monthBirth;
	}


	public int getYearBirth() {
		return yearBirth;
	}


	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	
	//calculate the body mass index
	
	public void calculateBMI() 
	{
		this.bmi= weight/(height*height);
	}
	
	
	//calculate the risk of heart diseases.
	public String calculateRisk() {
		
		String riesgo="";
		if(bmi<18) 
		{
			
			if(bloodType=="A"||bloodType=="AB") 
			{
				riesgo="Low risk";
			}
			else 
			{
				riesgo="Moderate risk";
			}
		}
		
		if(bmi>=18 && bmi<=25) 
		{
			riesgo="Low risk";
		}
		
		if(bmi>25) 
		{
			if(bloodType=="A"||bloodType=="B"||bloodType=="O") 
			{
				riesgo="High risk";
			}
			
			if(bloodType=="AB") 
			{
				riesgo="Moderate risk";
			}
			
		}
		return riesgo;
	}
	
	
	//calculate the right amount of food(Kg) for every kangaroo .
	
	public String calculateDiet() 
	{
		double diet=0;
		if(weight<30) {diet= weight*0.80;}
		if(weight>=30 && weight<=48) {diet= weight+(weight*0.10);}
		if(weight>48){diet=((weight-48)*0.4)+40;}
		return "Required diet:"+diet+"Kg ";
	}
	
	//calculate the right amount of water(Lts) for every kangaroo .
	public String calculateWater() 
	{
		return "Required water"+bmi*1.5+"Lts ";
	}
	
	
	//calculate the area for every kangaroo
	public double calculateArea() 
	{
		return height*8;
	}

	//calculate the time to the vaccine for every kangaroo
	public void timeToVaccine(int year,int month,int day) 
	{
		
		int years=year-yearBirth;
		int months=month-monthBirth;
		int days=day-dayBirth;
		int weeks=-4*months;
		if(months <= 0) 
		{ 
		  years--;
		}
		if(years>=1) {time="Vaccine is not required";}
		else {time=weeks+" weeks and "+days+ " days left to the vaccine";}
	   
	}
	
	//Show the information about every kangaroo
	public String toString() 
	{
		return "name="+ name + ", weight=" + weight + ", height=" + height + ", sex=" + sex + ", bloodType="
				+ bloodType + ", Birthday=" + dayBirth+"/"+ monthBirth+ "/"+ yearBirth
				+ ", BMI=" + bmi + ", " + calculateDiet()+ ", "+calculateRisk()+", "+calculateWater()+", "+time;
	}
	

	
	
	
}

