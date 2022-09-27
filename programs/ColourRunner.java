class ColourRunner{
public static void main (String []args){
	System.out.println("main start");
	Colour.save("red");
	Colour.save("orange");
	Colour.save("yellow");
	Colour.save("green");
	Colour.save("blue");
	Colour.save("indigo");
	Colour.save("violet");
	Colour.displayDetails();
	boolean ref=Colour.findColor("green");
	System.out.println("colour found"+ref);
	System.out.println("main end");
}
}

	
	