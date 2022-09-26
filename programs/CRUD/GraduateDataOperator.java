class GraduateDataOperator {
	static String[]graduateNames={null,null,null,null,null};
	static int position=0;
	static void save( String name){
		System.out.println("save start");
		graduateNames[position]=name;
		System.out.println("graduate Name in postion "+position+" is "+graduateNames[position]);
		position++;
		System.out.println("save end");
	}
	static void   displayDetails()
	{
		System.out.println("displayDetails start");
		for (int index=0;index<graduateNames.length;index++)
		{
			System.out.println("element is : "+graduateNames[index]);
		}
	}
}
			
