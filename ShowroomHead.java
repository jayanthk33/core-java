class ShowroomHead
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in ShowroomHead");
		Showroom showroom=new Showroom();
		System.out.println("Name:"+showroom.name);
		System.out.println("city:"+showroom.city);
		System.out.println("contNumber:"+showroom.contNumber);
		System.out.println("pinCode:"+showroom.pinCode);
		System.out.println("noOfCameras:"+showroom.noOfCameras);
		System.out.println("furnituresType:"+showroom.furnituresType);
		System.out.println("open:"+showroom.open);
		System.out.println("noOfComputers:"+showroom.noOfComputers);
		
		Showroom showroom1=new Showroom("mixer");
		System.out.println("Name:"+showroom1.name);
		System.out.println("city:"+showroom1.city);
		System.out.println("contNumber:"+showroom1.contNumber);
		System.out.println("pinCode:"+showroom1.pinCode);
		System.out.println("noOfCameras:"+showroom1.noOfCameras);
		System.out.println("furnituresType:"+showroom1.furnituresType);
		System.out.println("open:"+showroom1.open);
		System.out.println("noOfComputers:"+showroom1.noOfComputers);
		
		Showroom showroom2=new Showroom(20);
		System.out.println("Name:"+showroom2.name);
		System.out.println("city:"+showroom2.city);
		System.out.println("contNumber:"+showroom2.contNumber);
		System.out.println("pinCode:"+showroom2.pinCode);
		System.out.println("noOfCameras:"+showroom2.noOfCameras);
		System.out.println("furnituresType:"+showroom2.furnituresType);
		System.out.println("open:"+showroom2.open);
		System.out.println("noOfComputers:"+showroom2.noOfComputers);
		
		Showroom showroom3=new Showroom(85539660);
		System.out.println("Name:"+showroom3.name);
		System.out.println("city:"+showroom3.city);
		System.out.println("contNumber:"+showroom3.contNumber);
		System.out.println("pinCode:"+showroom3.pinCode);
		System.out.println("noOfCameras:"+showroom3.noOfCameras);
		System.out.println("furnituresType:"+showroom3.furnituresType);
		System.out.println("open:"+showroom3.open);
		System.out.println("noOfComputers:"+showroom3.noOfComputers);
		
		Showroom showroom4=new Showroom(15);
		System.out.println("Name:"+showroom4.name);
		System.out.println("city:"+showroom4.city);
		System.out.println("contNumber:"+showroom4.contNumber);
		System.out.println("pinCode:"+showroom4.pinCode);
		System.out.println("noOfCameras:"+showroom4.noOfCameras);
		System.out.println("furnituresType:"+showroom4.furnituresType);
		System.out.println("open:"+showroom4.open);
		System.out.println("noOfComputers:"+showroom4.noOfComputers);
		
		Showroom showroom5=new Showroom(true);
		System.out.println("Name:"+showroom5.name);
		System.out.println("city:"+showroom5.city);
		System.out.println("contNumber:"+showroom5.contNumber);
		System.out.println("pinCode:"+showroom5.pinCode);
		System.out.println("noOfCameras:"+showroom5.noOfCameras);
		System.out.println("furnituresType:"+showroom5.furnituresType);
		System.out.println("open:"+showroom5.open);
		System.out.println("noOfComputers:"+showroom5.noOfComputers);
		
		Showroom showroom6=new Showroom("Gasstove",20);
		System.out.println("Name:"+showroom6.name);
		System.out.println("city:"+showroom6.city);
		System.out.println("contNumber:"+showroom6.contNumber);
		System.out.println("pinCode:"+showroom6.pinCode);
		System.out.println("noOfCameras:"+showroom6.noOfCameras);
		System.out.println("furnituresType:"+showroom6.furnituresType);
		System.out.println("open:"+showroom6.open);
		System.out.println("noOfComputers:"+showroom6.noOfComputers);
		
		Showroom showroom7=new Showroom(85498064,577501);
		System.out.println("Name:"+showroom7.name);
		System.out.println("city:"+showroom7.city);
		System.out.println("contNumber:"+showroom7.contNumber);
		System.out.println("pinCode:"+showroom7.pinCode);
		System.out.println("noOfCameras:"+showroom7.noOfCameras);
		System.out.println("furnituresType:"+showroom7.furnituresType);
		System.out.println("open:"+showroom7.open);
		System.out.println("noOfComputers:"+showroom7.noOfComputers);
			
		System.out.println("Ending main in ShowroomHead");
	}
}