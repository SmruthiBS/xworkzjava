class MovieDataOperatorRunner{
public static void main(String[] names){
	System.out.println("main start");
	MovieDataOperator.save("dia");
	MovieDataOperator.save("appu");
	MovieDataOperator.save("rajakumara");
	MovieDataOperator.save("ram");
	MovieDataOperator.save("super");
	MovieDataOperator.displayDetails();
	System.out.println("main end");
}
}

	