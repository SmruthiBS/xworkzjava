class TempleDataOperatorRunner{
public static void main(String[] names){
	System.out.println("main start");
	TempleDataOperator.save("hampi");
	TempleDataOperator.save("sringeri");
	TempleDataOperator.save("haronadu");
	TempleDataOperator.save("dharmasthala");
	TempleDataOperator.save("tirupati");
	TempleDataOperator.displayDetails();
	System.out.println("main end");
}
}

	