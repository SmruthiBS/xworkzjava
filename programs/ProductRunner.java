class ProductRunner {
	public static void main(String[] data){
		System.out.println("main start");
	String name=data[0];
	System.out.println("product name : "+name);
	String type=data[1];
	System.out.println("product type : "+type);
	String price=data[2];
	System.out.println("product price : "+price);
	int convertedPrice=Integer.parseInt(price);
	System.out.println("converted Price = "+convertedPrice);
	String quantity=data[3];
	System.out.println("product quantity : "+quantity);
	int convertedQuantity=Integer.parseInt(quantity);
	System.out.println("converted quantity = "+convertedQuantity);
	String quality=data[4];
	System.out.println("product quality : "+quality);
	boolean convertedQuality=Boolean.parseBoolean(quantity);
	System.out.println("converted quality = "+convertedQuality);
	int totalPrice=convertedPrice*convertedQuantity;
	System.out.println("total price= "+totalPrice);
	System.out.println("main end");
	}
}














