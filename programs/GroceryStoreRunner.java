class GroceryStoreRunner{
	public static void main(String[] goods){
		System.out.println("main start");
		GroceryStore.setName("more");
		System.out.println("name is "+GroceryStore.getName());
		GroceryStore.setOwnerName("suresh");
		System.out.println("owner is "+GroceryStore.getOwnerName());
		GroceryStore.setNoOfEmployess(50);
		System.out.println("no of employess are "+GroceryStore.getNoOfEmployess());
		GroceryStore.setPhone(9449498842l);
		System.out.println("phone is "+GroceryStore.getPhone());
		GroceryStore.setNoOfBranches(3);
		System.out.println("no of branches are  "+GroceryStore.getNoOfBranches());
		GroceryStore.setNoOfFloors(2);
		System.out.println("no of floors are "+GroceryStore.getNoOfFloors());
		GroceryStore.setAddress("vijaynagar banglore");
		System.out.println("address is "+GroceryStore.getAddress());
		GroceryStore.setOverallRating(4);
		System.out.println("overall rating is "+GroceryStore.getOverallRating());
		GroceryStore.setReview("excellent");
		System.out.println("review are "+GroceryStore.getReview());
		GroceryStore.setItems("salt,sugar,oil,rice");
		System.out.println("items are "+GroceryStore.getItems());
		GroceryStore.setAmountSaved(500);
		System.out.println("amount saved is "+GroceryStore.getAmountSaved());
		GroceryStore.setOffer("25% off on purchase over 1000");
		System.out.println("offer = "+GroceryStore.getOffer());
		GroceryStore.setDiscount(true);
		System.out.println("discount is "+GroceryStore.isDiscount());
		GroceryStore.setDiscountPrice(500);
		System.out.println("discount price is "+GroceryStore.getDiscountPrice());
		
		
		System.out.println("main end");
	}
}
