class PoliticanDataOperator  {
	static String[]politicanNames={null,null,null,null,null};
	static int position=0;
	static void save( String name){
		System.out.println("save start");
		politicanNames[position]=name;
		System.out.println("politican Name in postion "+position+" is "+politicanNames[position]);
		position++;
		System.out.println("save end");
	}
	static void   displayDetails()
	{
		System.out.println("displayDetails start");
		for (int index=0;index<politicanNames.length;index++)
		{
			System.out.println("element is : "+politicanNames[index]);
		}
	}
}
			
