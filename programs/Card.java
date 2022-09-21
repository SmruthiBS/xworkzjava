 class Card{
             static String type;
             static float height;
              static float width;
              static int  price;
              static String colors[];
			  static void displayDetails()
			  {
				  System.out.println("displayDetails start");
				  System.out.println("type : "+type);
				  System.out.println("height : "+height);
				  System.out.println("width: "+width);
				  System.out.println("price : "+price);
				  if(colors!=null)
				  {
					  System.out.println("colours are ");
				  
					  for(int count=0;count<colors.length;count++)
					 System.out.println( colors[count]);
				  }
				  else
					  System.out.println("colours are null");
				  
				  System.out.println("displayDetails end");
			  }
 }
			  
				  
				 