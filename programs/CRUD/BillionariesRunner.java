 class BillionariesRunner{
	public static void main(String args[]){
		System.out.println("main start");
		Billionaries.save("Elon Musk");
		Billionaries.save("Bernard Arnault & family");
		Billionaries.save("Gautam Adani & family");
		Billionaries.save("Jeff Bezos");
		Billionaries.save("Bill Gates");
		Billionaries.save("Warren Buffett");
		Billionaries.save("Larry Ellison");
		Billionaries.save("Mukesh Ambani");
		Billionaries.save("Larry Page");
		Billionaries.save("Sergey Brin");
		Billionaries.displayDetails();
		 boolean value=Billionaries.find("Mukesh Ambani");
		 System.out.println(value);
		String result= Billionaries.update("Jeff Bezos","rathan tata");
		System.out.println(result);
		Billionaries.displayDetails();
		String result1= Billionaries.update("2","sudha murthy");
		System.out.println(result1);
		Billionaries.displayDetails();
		Billionaries.delete("Elon Musk");
		Billionaries.displayDetails();
		Billionaries.delete1(8,"Larry Page");
		Billionaries.displayDetails();
		
		
		
	}
 }
		
		
	