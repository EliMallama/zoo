import java.util.Scanner;

//Class Executable definition
public class Executable {

	// main method
	public static void main(String[] args) {

		// variables
		int currentTemp = 36;
		int currentDiet = 10;
		// today
		int year = 2019;
		int month = 3;
		int day = 6;

		// new objects
		// object zoo
		Zoo zoo = new Zoo();
		// object zone
		Zone zoneKangaroo = zoo.getOne();
		//objects type environment
		ZoneEnvironment oneE=zoo.getOne().getEnvironments()[0];
		ZoneEnvironment twoE=zoo.getOne().getEnvironments()[1];
		ZoneEnvironment threeE=zoo.getOne().getEnvironments()[2];
		
		// Object to get user entries
		Scanner in = new Scanner(System.in);

		// Initializing monitoring system
		System.out.println("Monitoring...");
		System.out.println(zoo.getName());
		System.out.println(zoo.getExhibition());
		System.out.println("Exhibition Area " + zoo.getExhibitionArea() + "mts2");
		System.out.println("Arid Zone");
		System.out.println("------------------------");
		System.out.println(zoneKangaroo.getName());
		System.out.println();

		// The user must to add 3 kangaroos and 2 pogonas
		//----------------------------------------------------------------------------------------------//
		
		System.out.println("Please type the kangaroo's information");

		// The user must to type the kangaroo's information
		System.out.println("Kangaroo's name");
		String name1 = in.nextLine();
		System.out.println("Kangaroo's weight");
		double weight1 = in.nextDouble();
		in.nextLine();
		System.out.println("Kangaroo's height");
		double height1 = in.nextDouble();
		in.nextLine();
		System.out.println("Kangaroo's sex");
		String sex1 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's blood Type");
		String bloodType1 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's dayBirth");
		int dayBirth1 = in.nextInt();
		in.nextLine();
		System.out.println("Kangaroo's monthBirth");
		int monthBirth1 = in.nextInt();
		in.nextLine();
		System.out.println("Kangaroo's yearBirth");
		int yearBirth1 = in.nextInt();
		in.nextLine();
		System.out.println("Number of the Environment 1,2 or 3");
		int environment1 = in.nextInt();
		in.nextLine();
		in.nextLine();
		// First Kangaroo object
		Kangaroo objectKangaroo1 = new Kangaroo(name1, weight1, height1, sex1.charAt(0), bloodType1, dayBirth1,
				monthBirth1, yearBirth1);


		
		System.out.println("Please type the kangaroo's information");
		
		// The user must to type the kangaroo's information
		System.out.println("Kangaroo's name");
		String name2 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's weight");
		double weight2 = in.nextDouble();
		in.nextLine();
		System.out.println("Kangaroo's height");
		double height2 = in.nextDouble();
		in.nextLine();
		System.out.println("Kangaroo's sex");
		String sex2 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's blood Type");
		String bloodType2 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's dayBirth");
		int dayBirth2 = in.nextInt();
		in.nextLine();
		System.out.println("Kangaroo's monthBirth");
		int monthBirth2 = in.nextInt();
		in.nextLine();
		System.out.println("Kangaroo's yearBirth");
		int yearBirth2 = in.nextInt();
		in.nextLine();
		System.out.println("Number of the Environment 1,2 or 3");
		int environment2 = in.nextInt();
		in.nextLine();
		in.nextLine();
		// Second Kangaroo object
		Kangaroo objectKangaroo2 = new Kangaroo(name2, weight2, height2, sex2.charAt(0), bloodType2, dayBirth2,
				monthBirth2, yearBirth2);
		
		
		System.out.println("Please type the kangaroo's information");
		// The user must to type the kangaroo's information
		System.out.println("Kangaroo's name");
		String name3 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's weight");
		double weight3 = in.nextDouble();
		in.nextLine();
		System.out.println("Kangaroo's height");
		double height3 = in.nextDouble();
		in.nextLine();
		System.out.println("Kangaroo's sex");
		String sex3 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's blood Type");
		String bloodType3 = in.nextLine();
		in.nextLine();
		System.out.println("Kangaroo's dayBirth");
		int dayBirth3 = in.nextInt();
		in.nextLine();
		System.out.println("Kangaroo's monthBirth");
		int monthBirth3 = in.nextInt();
		in.nextLine();
		System.out.println("Kangaroo's yearBirth");
		int yearBirth3 = in.nextInt();
		in.nextLine();
		System.out.println("Number of the Environment 1,2 or 3");
		int environment3 = in.nextInt();
		in.nextLine();
		in.nextLine();
		// Third Kangaroo object
		Kangaroo objectKangaroo3 = new Kangaroo(name3, weight3, height3, sex3.charAt(0), bloodType3, dayBirth3,
				monthBirth3, yearBirth3);

	
	   //The user must to add 2 pogonas-----------
		System.out.println("Please type the pogona's information");
		
		// The user must to type the kangaroo's information
		System.out.println("Pogona's name");
		String name4=in.nextLine();
		System.out.println("Pogona's weight");
		double weight4=in.nextDouble();
		in.nextLine();
		System.out.println("Pogona's height");
		double height4=in.nextDouble();
		in.nextLine();
		// First pogona object
		Pogona objectPogona4=new Pogona(name4,weight4,height4);
		
	
		
		System.out.println("Please type the pogona's information");
		// The user must to type the kangaroo's information
		System.out.println("Pogona's name");
		String name5=in.nextLine();
		in.nextLine();
		System.out.println("Pogona's weight");
		double weight5=in.nextDouble();	
		in.nextLine();
		System.out.println("Pogona's height");
		double height5=in.nextDouble();
		in.nextLine();

		// Second Kangaroo object
		Pogona objectPogona5=new Pogona(name5,weight5,height5);
	//-----------------------------------------------------------------------------------------------------
	
		
		//Add pogonas to the Kangaroo's zone
		zoneKangaroo.setOnePogona(objectPogona4);
		zoneKangaroo.setOnePogona(objectPogona5);
		
		
		//Add the kangaroos to the environment selected
		boolean add1=false;
		boolean add2=false;
		boolean add3=false;
		
		if(environment1==1) 
		{
			add1=oneE.addKangaroo(objectKangaroo1);
		}
		else {
			if(environment1==2) 
			{
				add1=twoE.addKangaroo(objectKangaroo1);
			}
			else {
				add1=threeE.addKangaroo(objectKangaroo1);
				
			}
			
		}
		
		if(add1) {System.out.println("Kangaroo added");}
		else {System.out.println("operation not allowed");}
		
		
		if(environment2==1) 
		{
			add2=oneE.addKangaroo(objectKangaroo2);
		}
		else {
			if(environment2==2) 
			{
				add2=twoE.addKangaroo(objectKangaroo2);
			}
			else {
				add2=threeE.addKangaroo(objectKangaroo2);
				
			}
			
		}
		
		if(add2) {System.out.println("Kangaroo added");}
		else {System.out.println("operation not allowed");}
		
		if(environment3==1) 
		{
			add3=oneE.addKangaroo(objectKangaroo3);
		}
		else {
			if(environment3==2) 
			{
				add3=twoE.addKangaroo(objectKangaroo3);
			}
			else {
				add3=threeE.addKangaroo(objectKangaroo3);
				
			}
			
		}
		
		if(add3) {System.out.println("Kangaroo added");}
		else {System.out.println("operation not allowed");}
		
		
		
//-------------------------------------------------------------------------------------------------
		
		//calculate area for every environment
		oneE.calculateEnvironmentArea();
		twoE.calculateEnvironmentArea();
		threeE.calculateEnvironmentArea();
		
		//calculate time to vaccine for every kangaroo according to the year month and day variables
		objectKangaroo1.timeToVaccine(year, month, day);
		objectKangaroo2.timeToVaccine(year, month, day);
		objectKangaroo3.timeToVaccine(year, month, day);
		
		
//------------------------------------------------------------------------------------------------------
		
		//Monitoring system continue...
		
		System.out.println("Environment 1");
		System.out.println(oneE.toString());
		System.out.println();
		System.out.println("Environment 2");
		System.out.println(twoE.toString());
		System.out.println();
		System.out.println("Environment 3");
		System.out.println(threeE.toString());
		System.out.println();
		System.out.println("------------------------");
		System.out.println("Pogonas");
		System.out.println("name:"+objectPogona4.getName()+" "+objectPogona4.calculateWater()+" "+"name:"+objectPogona5.getName()+" "+objectPogona5.calculateWater());
		System.out.println(zoneKangaroo.validatePogonasDiet(currentDiet));
		System.out.println(zoneKangaroo.validateTemperature(currentTemp));
		
		
		
	
	}
}