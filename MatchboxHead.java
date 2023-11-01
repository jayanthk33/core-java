class MatchboxHead
{
	public static void main(String[] args)
	{
		
		System.out.println("Starting main in MatchboxHead");
		Matchbox matchbox=new Matchbox();
		System.out.println("Brand:"+matchbox.brand);
		System.out.println("Number of Sticks:"+matchbox.noOfStick);
		System.out.println("Length:"+matchbox.length);
		System.out.println("Price:"+matchbox.price);
		System.out.println("Size:"+matchbox.size);
		System.out.println("Weight:"+matchbox.weight);
		System.out.println("Type:"+matchbox.type);
		
		Matchbox matchbox1=new Matchbox("wax");
		System.out.println("Brand1:"+matchbox1.brand);
		System.out.println("Number of Sticks1:"+matchbox1.noOfStick);
		System.out.println("Length1:"+matchbox1.length);
		System.out.println("Price1:"+matchbox1.price);
		System.out.println("Size1:"+matchbox1.size);
		System.out.println("Weight1:"+matchbox.weight);
		System.out.println("Type1:"+matchbox1.type);
		
		Matchbox matchbox2=new Matchbox(10);
		System.out.println("Brand2:"+matchbox2.brand);
		System.out.println("Number of Sticks2:"+matchbox2.noOfStick);
		System.out.println("Length2:"+matchbox2.length);
		System.out.println("Price2:"+matchbox2.price);
		System.out.println("Size2:"+matchbox2.size);
		System.out.println("Weight2:"+matchbox2.weight);
		System.out.println("Type2:"+matchbox2.type);
		
		Matchbox matchbox3=new Matchbox(5);
		System.out.println("Brand3:"+matchbox3.brand);
		System.out.println("Number of Sticks3:"+matchbox3.noOfStick);
		System.out.println("Length3:"+matchbox3.length);
		System.out.println("Price3:"+matchbox3.price);
		System.out.println("Size3:"+matchbox1.size);
		System.out.println("Weight3:"+matchbox3.weight);
		System.out.println("Type3:"+matchbox3.type);
		
		Matchbox matchbox4=new Matchbox(6,"wooden");
		System.out.println("Brand4:"+matchbox4.brand);
		System.out.println("Number of Sticks4:"+matchbox4.noOfStick);
		System.out.println("Length4:"+matchbox4.length);
		System.out.println("Price4:"+matchbox4.price);
		System.out.println("Size4:"+matchbox4.size);
		System.out.println("Weight4:"+matchbox4.weight);
		System.out.println("Type4:"+matchbox4.type);
		
		Matchbox matchbox5=new Matchbox(30);
		System.out.println("Brand5:"+matchbox5.brand);
		System.out.println("Number of Sticks5:"+matchbox5.noOfStick);
		System.out.println("Length5:"+matchbox5.length);
		System.out.println("Price5:"+matchbox5.price);
		System.out.println("Size5:"+matchbox5.size);
		System.out.println("Weight5:"+matchbox5.weight);
		System.out.println("Type5:"+matchbox5.type);
		
		Matchbox matchbox6=new Matchbox(10.0,1);
		System.out.println("Brand6:"+matchbox6.brand);
		System.out.println("Number of Sticks6:"+matchbox6.noOfStick);
		System.out.println("Length6:"+matchbox6.length);
		System.out.println("Price6:"+matchbox6.price);
		System.out.println("Size6:"+matchbox6.size);
		System.out.println("Weight6:"+matchbox6.weight);
		System.out.println("Type6:"+matchbox6.type);
		

		System.out.println("Starting main in MatchboxHead");
	}
}