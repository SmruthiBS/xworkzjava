class Colour{
static String[] colorNames={null,null,null,null,null,null,null};
static int location=0;
static String ref;
static void save(String colour)
{
	System.out.println("save start");
	if(location>=7)
	{
		System.err.println("array size exceeds");
	}
	if(colour!=null&&colour.length()>2)
	{
	colorNames[location]=colour;
    System.out.println("colour in postion "+location+"is "+colorNames[location]);
	  location++;
	  System.out.println("save end");
	}
	else
		System.out.println("colour invalid"+colour);
}
static void displayDetails()
{
	for(int index=0;index<colorNames.length;index++)
	{
		ref=colorNames[index];
		System.out.println("element is "+ref);
	}
}
static boolean findColor(String key)
{
	if(key!=null&&key.length()>3)
	{
		System.out.println("color is valid and looking for it in the array");
	for(int loc=0;loc<colorNames.length;loc++)
	{
		if(key==ref)
		{
			System.out.println("colour found"+key);
			return true;
		}
		
		
	}


	}
	return false;
	
}
}
		
	 
	