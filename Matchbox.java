class Matchbox
{
	String brand="Falcon";
	int noOfStick;
	int length;
	double price=5.0;
	int size;
	double weight;
	String type;
	
	Matchbox()
	{
		System.out.println("Matchbox created");
	}
	Matchbox(String type)
	{
		this.type=type;
		System.out.println("Matchbox with type created");
	}
	Matchbox(double weight)
	{
		this.weight=weight;
		System.out.println("Matchbox with weight in grams created");
	}
	Matchbox(int size)
	{
		this.size=size;
		System.out.println("Matchbox with size in cm created");
	}
	Matchbox(int length,String type)
	{
		this.length=length;
		this.type=type;
		System.out.println("Matchbox with length in cm and type created");
	}

	Matchbox(int noOfStick,double weight)
	{
		this.noOfStick=noOfStick;
		this.weight=weight;
		System.out.println("Matchbox with noOfStick created");
	}
	Matchbox(double weight,int size)
	{
		this.weight=weight;
		this.size=size;
		System.out.println("Matchbox with size and weight created");
	}
	
	
}