//Class Executable definition
public class Executable {

	//method main
	public static void main(String[] args) {
		
		//new objects
		
	    Kangaroo oneKangaroo=new Kangaroo("K1",30,8,'M',"A", 21, 1, 2019);
		Kangaroo twoKangaroo=new Kangaroo("K2",40,8.1,'F',"AB", 5, 3, 2018);
		Kangaroo threeKangaroo=new Kangaroo("K3",35,9,'M',"O", 19, 7, 2017);
		Kangaroo fourKangaroo=new Kangaroo("K4",45,9.8,'F',"O", 8, 12, 2017);
		Kangaroo fiveKangaroo=new Kangaroo("K5",25,7,'M',"A", 5, 6, 2016);
        Pogona onePogona=new Pogona("P1",2,2);
		Pogona twoPogona=new Pogona("P2",3,3);
		
		//object zoo
		Zoo zoo=new Zoo();
		//object zone
		Zone zoneK=zoo.getOne();
		zoneK.setOnep(onePogona);
		zoneK.setTwop(twoPogona);
		//environments
		ZoneEnvironment one=zoneK.getOne();
		ZoneEnvironment two=zoneK.getTwo();
		ZoneEnvironment three=zoneK.getThree();
		//adding Kangaroo to the environment one
		one.setOne(oneKangaroo);
		one.setTwo(twoKangaroo);
		//Calculate the total area for environment one
		String totalAreaOne="Total Area: "+(oneKangaroo.calculateArea()+twoKangaroo.calculateArea());
		//adding Kangaroo to the environment two
		two.setOne(threeKangaroo);
		two.setTwo(fourKangaroo);
		//Calculate the total area for environment one
		String totalAreaTwo="Total Area: "+(threeKangaroo.calculateArea()+fourKangaroo.calculateArea());
		//adding Kangaroo to the environment three
		three.setOne(fiveKangaroo);
		//Calculate the total area for environment one
		String totalAreaThree="Total Area: "+(fiveKangaroo.calculateArea());
	
		
		//variables
		int currentTemp=36;
		int currentDiet=10;
		int year=2019;
		int month=2;
		int day=10;
		String timeOne=oneKangaroo.timeToVaccine(year, month, day);
		String timeTwo=twoKangaroo.timeToVaccine(year, month, day);
		String timeThree=threeKangaroo.timeToVaccine(year, month, day);
		String timeFour=fourKangaroo.timeToVaccine(year, month, day);
		String timeFive=fiveKangaroo.timeToVaccine(year, month, day);
		 
		
		
		//monitoring
		System.out.println("Monitoring...");
		System.out.println(zoo.getName());
		System.out.println(zoo.getExhibition());
		System.out.println("Exhibition Area "+zoo.getExhibitionArea()+"mts2");
		System.out.println("Arid Zone");
		System.out.println("------------------------");
		System.out.println(zoneK.getName());
		System.out.println();
		System.out.println("Environment 1");
		System.out.println(totalAreaOne);
		System.out.println(one.getOne().toString()+" "+timeOne);
		System.out.println(one.getTwo().toString()+" "+timeTwo);
		System.out.println();
		System.out.println("Environment 2");
		System.out.println(totalAreaTwo);
		System.out.println(two.getOne().toString()+" "+timeThree);
		System.out.println(two.getTwo().toString()+" "+timeFour);
		System.out.println();
		System.out.println("Environment 3");
		System.out.println(totalAreaThree);
		System.out.println(three.getOne().toString()+" "+timeFive);
		System.out.println("------------------------");
		System.out.println("Pogonas");
		System.out.println("name:"+onePogona.getName()+" "+onePogona.calculateWater()+" "+"name:"+twoPogona.getName()+" "+onePogona.calculateWater());
		System.out.println(zoneK.validatePogonasDiet(currentDiet));
		System.out.println(zoneK.validateTemperature(currentTemp));
						
			
		}
	

	}


