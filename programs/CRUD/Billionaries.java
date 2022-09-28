class Billionaries{
static String billionaries[]={null,null,null,null,null,null,null,null,null,null};
static int location=0;
static void save(String billionarie)
{
	System.out.println("save start");
	if(location>=10)
	{
		System.err.println("array size exceeds");
	}
	if(billionarie!=null&& billionarie.length()>5)
	{
		System.out.println("name is valid "+billionarie);
	billionaries[location]=billionarie;
	location++;
	}
	else{
	System.out.println("name is invalid");}
}
static void displayDetails()
{
for (int index=0;index<billionaries.length;index++)
{
String ref=billionaries[index];
System.out.println("element is "+ref);	
}	
}
static boolean find(String name)
{
	if(name!=null&& name.length()>5)
	{
		System.out.println("name is valid and finding in the array");
		for (int index=0;index>billionaries.length;index++)
		{
			String ref=billionaries[index];
			if(ref==name)
			{
				System.out.println("billionarie found "+name);
				return true;
			}
		}
	
		
	}
	return false;
}
 static String update(String oldBillionarie,String newBillionarie)
 {
	 System.out.println("update start");
	 if(oldBillionarie!=null && newBillionarie!=null)
	 {
		if(oldBillionarie.length()>5 &&newBillionarie.length()>5)
		{
			System.out.println("data is valid for updartion");
		}
for(int index=0;index<billionaries.length;index++)
{
	String ref=billionaries[index];
	if(oldBillionarie==ref)
	{
		System.out.println("value found "+oldBillionarie);
		billionaries[index]=newBillionarie;
		System.out.println("value updated");
		return newBillionarie;
	}
}	
	 
	 }
	 else{
		System.out.println("data not valid for updation");
	}
	 return null;
 
	
}
 static String update(int index,String newBillionarie)
 {
	 if( newBillionarie!=null && newBillionarie.length()>5)
	 {
		 System.out.println("data valid for updation ");
		billionaries[index]=newBillionarie;
		 return newBillionarie;
	 }
	 return null;
 }
 static boolean delete(String billionarie)
 {
	 System.out.println("delete start");
	 if(billionarie!=null && billionarie.length()>5)
	 {
		 System.out.println("data is valid");
		 for(int loc=0;loc<billionaries.length;loc++)
		 {
			 if(billionaries[loc]==billionarie)
				 billionaries[loc]=null;
			 System.out.println("deleted");
			 return true;
		 }
	 }
	 return false;
 }
static  boolean delete1(int index,String billionarie){
	if(billionarie!=null&&billionarie.length()>5)
	{
		System.out.println("data is valid");
		billionaries[index]=null;
		System.out.println("deleted");
		return true;
		}
		return false;
}
}
		 
		 
 

