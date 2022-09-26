class TempleDataOperator {
	static String[]templeNames={null,null,null,null,null};
	static int position=0;
	static void save( String name){
		System.out.println("save start");
		templeNames[position]=name;
		System.out.println("templeName in postion "+position+" is "+templeNames[position]);
		position++;
		System.out.println("save end");
	}
	static void   displayDetails()
	{
		System.out.println("displayDetails start");
		for (int index=0;index<templeNames.length;index++)
		{
			System.out.println("element is : "+templeNames[index]);
		}
	}
}
			
