class ClockHead
{
	
	
	public static void  main(String[] args)
	{
		System.out.println("Starting main in clockHead");
		Clock clock = new Clock();
		System.out.println("type:"+clock.type);
		System.out.println("noOfHands:"+clock.noOfHands);
		System.out.println("no of keys:"+clock.noOfBatteries);
		System.out.println("weight:"+clock.weight);
		
		Clock clock1 = new Clock("wall");
		System.out.println("type1:"+clock1.type);
		System.out.println("noOfHands1:"+clock1.noOfHands);
		System.out.println("no of keys1:"+clock1.noOfBatteries);
		System.out.println("weight1:"+clock1.weight);
		
		Clock clock2 = new Clock(3);
		System.out.println("type2:"+clock2.type);
		System.out.println("noOfHands2:"+clock2.noOfHands);
		System.out.println("no of keys2:"+clock2.noOfBatteries);
		System.out.println("weight2:"+clock2.weight);
		
		Clock clock3 = new Clock(2);
		System.out.println("type3:"+clock3.type);
		System.out.println("noOfHands3:"+clock3.noOfHands);
		System.out.println("no of keys3:"+clock3.noOfBatteries);
		System.out.println("weight3:"+clock3.weight);
		
		Clock clock4 = new Clock("pendulam",2,3,20);
		System.out.println("type4:"+clock4.type);
		System.out.println("noOfHands4:"+clock4.noOfHands);
		System.out.println("no of keys4:"+clock4.noOfBatteries);
		System.out.println("weight4:"+clock4.weight);

		
	    System.out.println("Ending main in clockHead");
	}
	
	
	
}