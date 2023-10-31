class KeyboardHead
{
	
	
	public static void  main(String[] args)
	{
		System.out.println("Starting main in KeyboardHead");
		Keyboard keyboard = new Keyboard();
		System.out.println("Brand:"+keyboard.brand);
		System.out.println("Color:"+keyboard.color);
		System.out.println("no of keys:"+keyboard.noOfKeys);
		System.out.println("type:"+keyboard.type);
		System.out.println("cost:"+keyboard.cost);
		
		Keyboard keyboard1 = new Keyboard("yamaha");
		System.out.println("Brand1:"+keyboard1.brand);
		System.out.println("Color1:"+keyboard1.color);
		System.out.println("no of keys1:"+keyboard1.noOfKeys);
		System.out.println("type1:"+keyboard1.type);
		System.out.println("cost1:"+keyboard1.cost);
		
		Keyboard keyboard2 = new Keyboard(102);
		System.out.println("Brand2:"+keyboard2.brand);
		System.out.println("Color2:"+keyboard2.color);
		System.out.println("no of keys2:"+keyboard2.noOfKeys);
		System.out.println("type2:"+keyboard2.type);
		System.out.println("cost2:"+keyboard2.cost);
		
		Keyboard keyboard3 = new Keyboard("wired");
		System.out.println("Brand3:"+keyboard3.brand);
		System.out.println("Color3:"+keyboard3.color);
		System.out.println("no of keys3:"+keyboard3.noOfKeys);
		System.out.println("type3:"+keyboard3.type);
		System.out.println("cost3:"+keyboard3.cost);
		
		Keyboard keyboard4 = new Keyboard(103,"wireless");
		System.out.println("Brand4:"+keyboard4.brand);
		System.out.println("Color4:"+keyboard4.color);
		System.out.println("no of keys4:"+keyboard4.noOfKeys);
		System.out.println("type4:"+keyboard4.type);
		System.out.println("cost4:"+keyboard4.cost);
		
		Keyboard keyboard5 = new Keyboard(300);
		System.out.println("Brand5:"+keyboard5.brand);
		System.out.println("Color5:"+keyboard5.color);
		System.out.println("no of keys5:"+keyboard5.noOfKeys);
		System.out.println("type5:"+keyboard5.type);
		System.out.println("cost5:"+keyboard5.cost);
	
		
	    System.out.println("Ending main in KeyboardHead");
	}
	
	
	
}