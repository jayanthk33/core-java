class Clock
{
	String type;
	int noOfHands;
	int noOfBatteries;
	int weight;
	
	Clock()
	{
		System.out.println("Clock created");
	}
	Clock(String type)
	{
		this.type=type;
		System.out.println("Clock with type created");
	}
	Clock(int noOfHands)
	{
		this.noOfHands=noOfHands;
		System.out.println("Clock with noOfHands created");
	}
	Clock(String type,int noOfHands,int noOfBatteries,int weight)
	{
		this.type=type;
		this.noOfHands=noOfHands;
		this.noOfBatteries=noOfBatteries;
		this.weight=weight;
		System.out.println("clock with string ,int,int,int args created");
	}
	
	
}