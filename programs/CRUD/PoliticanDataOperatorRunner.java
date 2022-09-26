class PoliticanDataOperatorRunner{
public static void main(String[] names){
	System.out.println("main start");
	MovieDataOperator.save("Narendra modi");
	MovieDataOperator.save(" Amit Shah");
	MovieDataOperator.save(" Yogi Adityanath");
	MovieDataOperator.save("B. S. Yediyurappa");
	MovieDataOperator.save("Basavaraj Bommai");
	MovieDataOperator.displayDetails();
	System.out.println("main end");
}
}

	