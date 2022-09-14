 class FoodRunner{
	 public static void main (String[]temp){
		 String []foods={"dosa","idli","poori","gobi","pani_puri","palav","roti","samosa","upma","noodles","fried_rice","ghee_rice","momos"};
		 System.out.println("number of elements in the array = "+foods.length);
		 System.out.println("array is :");
		 for(int item=0;item<foods.length;item++)
		 {
			 
			 System.out.println(foods[item]);
		 }
		 
		 foods[3]= "pizza";
         foods[7]= "fries";
		 System.out.println(" updated array is :");
		 for(int item=0;item<foods.length;item++)
		 {
			 
			 System.out.println(foods[item]);
		 }
		}
 }
		 
		
		 