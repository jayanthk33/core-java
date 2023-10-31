class Showroom
{
	String name="Ambika kitchens";
	String city="Chitradurga";
	long contNumber;
	long pinCode;
	int noOfCameras;
	String furnituresType;
	boolean open;
	int noOfComputers;
	
	Showroom()
	{
		System.out.println("Showroom created");
	}
	Showroom(String furnituresType)
	{
		this.furnituresType=furnituresType;
		System.out.println("Showroom with furnituresType created");
	}
	Showroom(int noOfComputers)
	{
		this.noOfComputers=noOfComputers;
		System.out.println("Showroom with noOfComputers created");
	}
	Showroom(long contNumber)
	{
		this.contNumber=contNumber;
		System.out.println("Showroom with contNumber created");
	}
	Showroom(int noOfCameras,String furnituresType)
	{
		this.noOfCameras=noOfCameras;
		System.out.println("Showroom with noOfCameras created"); 
	}

	Showroom(boolean open)
	{
		this.open=open;
		System.out.println("Showroom with open created");
	}
	Showroom(String furnituresType,int noOfCameras)
	{
		this.furnituresType=furnituresType;
		this.noOfCameras=noOfCameras;
		System.out.println("Showroom with noOfCameras and  furnituresType created");
	}
	Showroom(long contNumber,long pinCode)
	{
		this.contNumber=contNumber;
		this.pinCode=pinCode;
		System.out.println("Showroom with contNumber and  pinCode created");
	}
	
	
	
}