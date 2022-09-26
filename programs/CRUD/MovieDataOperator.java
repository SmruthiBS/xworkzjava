class MovieDataOperator {
	static String[]movieNames={null,null,null,null,null};
	static int position=0;
	static void save( String name){
		System.out.println("save start");
		movieNames[position]=name;
		System.out.println(" movie name in "+position+" is "+movieNames[position]);
		position++;
		System.out.println("save end");
	}
	static void   displayDetails()
	{
		System.out.println("displayDetails start");
		for (int index=0;index<movieNames.length;index++)
		{
			System.out.println("element is : "+movieNames[index]);
		}
	}
}
			
