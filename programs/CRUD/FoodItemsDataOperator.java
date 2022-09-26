class FoodItemsDataOperator {
	static String[]foodItems={null,null,null,null,null};
	static int position=0;
	static void save( String name){
		System.out.println("save start");
		foodItems[position]=name;
		System.out.println("food Item in postion "+position+" is "+foodItems[position]);
		position++;
		System.out.println("save end");
	}
	static void   displayDetails()
	{
		System.out.println("displayDetails start");
		for (int index=0;index<foodItems.length;index++)
		{
			System.out.println("element is : "+foodItems[index]);
		}
	}
}
			
