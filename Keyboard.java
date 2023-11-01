class Keyboard
{
	String brand;
	String color="Red";
	int noOfKeys;
	String type;
	double cost;
	
	Keyboard()
	{
		System.out.println("Keyboard created");
	}
	Keyboard(String brand)
	{
		this.brand=brand;
		System.out.println("Keyboard with brand created" );
	}
	
	Keyboard(int noOfKeys)
	{
		this.noOfKeys=noOfKeys;
		System.out.println("Keyboard with noOfKeys created");
	}
	Keyboard(String type,String brand)
	{
		this.type=type;
		this.brand=brand;
		System.out.println("Keyboard with type created");
	}
	Keyboard(int noOfKeys,String type)
	{
		this.noOfKeys=noOfKeys;
		this.type=type;
		System.out.println("Keyboard with noOfKeys and type created");
	}
	Keyboard(double cost)
	{
		this.cost=cost;
		System.out.println("Keyboard with cost created");
	}
	
	
	
	
}