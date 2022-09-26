class FoodItemsDataOperatorRunner{
public static void main(String[] names){
	System.out.println("main start");
	FoodItemsDataOperator.save("idli");
	FoodItemsDataOperator.save("dosa");
	FoodItemsDataOperator.save("pizza");
	FoodItemsDataOperator.save("burger");
	FoodItemsDataOperator.save("samosa");
	FoodItemsDataOperator.displayDetails();
	System.out.println("main end");
}
}

	