class Movie{
	static String title;
	static String hero;
	static String heroine;
	static String language;
	static String director;
	static long budget;
	static int musicDirector;
	static int noOfShows;
	static  int No0fSongs;
	static String dateOfRelease;
	static long Collection;
	static int noOftheatres;
	static int noOfAwards;
	static int length;
	static String type;
	static int noOfParts;
	static int ticketPrice;
	static String[] songs;
	static String[] singers;
	static String[] theaters;
	static String places[];
	static String crew[];
	static String review[];
	static int rating[];
	static String  characters[];
	static String producers[];
	static String writers[];
	static String doubed[];
	static String indstrues[];
	
	static void displayDetials()
	{
		System.out.println("title: "+title);
		System.out.println("hero: "+hero);
		System.out.println("heroine: "+heroine);
		System.out.println("language: "+language);
		System.out.println("budget: "+budget);
		System.out.println("musicDirector: "+musicDirector);
		System.out.println("noOfShows: "+noOfShows);
		System.out.println("noOfAwards: "+noOfAwards);
		System.out.println("noOfParts: "+noOfParts);
		System.out.println("noOftheatres: "+noOftheatres);
		System.out.println("type: "+type);
		System.out.println("ticketPrice: "+ticketPrice);
		System.out.println("dateOfRelease: "+dateOfRelease);
		System.out.println(" Collection: "+ Collection);
		System.out.println("director: "+director);
		System.out.println("noOfSongs: "+title);
		System.out.println("length: "+length);
		  if(songs!=null)
				  {
					  System.out.println("songs are ");
				  
					  for(int count=0;count<songs.length;count++)
					 System.out.println( songs[count]);
				  }
				  else
					  System.out.println("songs are null");
				   
				   if(singers!=null)
				  {
					  System.out.println("singers are ");
				  
					  for(int number=0;number<singers.length;number++)
					 System.out.println( singers[number]);
				  }
				  else
					  System.out.println("singers are null");
				  
				    if(theaters!=null)
				  {
					  System.out.println("theaters are ");
				  
					  for(int num=0;num<theaters.length;num++)
					 System.out.println( theaters[num]);
				  }
				  else
					  System.out.println("theaters are null");
				    if(review!=null)
				  {
					  System.out.println("reviews are ");
				  
					  for(int nos=0;nos<review.length;nos++)
					 System.out.println( review[nos]);
				  }
				  else
					  System.out.println("reviews are null");
				   
				   if(rating!=null)
				  {
					  System.out.println("ratings are ");
				  
					  for(int ind=0;ind<rating.length;ind++)
					 System.out.println( rating[ind]);
				  }
				  else
					  System.out.println("rating are null");
				  
				    if(crew!=null)
				  {
					  System.out.println("crew is ");
				  
					  for(int index=0;index<crew.length;index++)
					 System.out.println( crew[index]);
				  }
				  else
					  System.out.println("crews is null");
				  
				    if(places!=null)
				  {
					  System.out.println("places are ");
				  
					  for(int position=0;position<places.length;position++)
					 System.out.println( places[position]);
				  }
				  else
					  System.out.println("places are null");
				  
				  if( comedians!=null)
				  {
					  System.out.println("comedians are ");
				  
					  for(int location=0;location<comedians.length;location++)
					 System.out.println( comedians[length]);
				  }
				  else
					  System.out.println(" comedians are null");
				  
				    
				  if( producers!=null)
				  {
					  System.out.println("producers are ");
				  
					  for(int len=0;len<producers.length;len++)
					 System.out.println( producers[len]);
				  }
				  else
					  System.out.println(" producers are null");
				  
				    
				  if( writers!=null)
				  {
					  System.out.println("writers are ");
				  
					  for(int loc=0;loc<writers.length;loc++)
					 System.out.println( writers[loc]);
				  }
				  else
					  System.out.println(" writers are null");
				  
				    
				  if( dancers!=null)
				  {
					  System.out.println("dancers are ");
				  
					  for(int pos=0;pos<dancers.length;pos++)
					 System.out.println( dancers[pos]);
				  }
				  else
					  System.out.println(" dancers are null");
				  
				    
				  if( fans!=null)
				  {
					  System.out.println("fans are ");
				  
					  for(int cnt=0;cnt<fans.length;cnt++)
					 System.out.println( fans[cnt]);
				  }
				  else
	System.out.println(" fans are null");}
}
				  
				   
				   
				   
				   
				 