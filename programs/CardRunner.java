class CardRunner{
	public static void main(String[] args){
		System.out.println("main start");
		Card.displayDetails();
		Card.type="visiting card";
		Card.height=5.1f;
		Card.width=8.9f;
		Card.price=10;
		String[] colours={"black","white","red"};
		Card.colors=colours;
		Card.displayDetails();
		System.out.println("main end");
	}
}