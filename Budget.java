
import java.util.*;								// Imports the Scanner to get Keyboard Inputs,
									        // ArrayList to store Users
class Budget {

	private static Scanner input;

	public static void main (String [] args) {
	
		
		String command ="";
		String city ="";
		String dateOfDep = "";
		ArrayList data = new ArrayList ();
		input = new Scanner (System.in);
	
		
		
		System.out.println("What is your date of departure?\n"
				+ "1)June 10th\n"
				+"2)June 11th\n"
				+ "3)June 13th\n"
				+"4)June 14th\n"
				+"5)June 15th\n");
	dateOfDep = input.next();
		
		System.out.println("Please choose your city of departure\n"
				+ "1) Los Angeles.\n"
				+ "2) New York City\n"
				+ "3) Las Vegas.\n"
				+ "4) Miami.\n"
				+ "5) Seattle.\n"
				+ "6) Austin.\n");
		city = input.next();
				

				
		System.out.println("Please Enter your budget and type enter:\n"
				+ "A) Between $500 and $1500.\n"
				+ "B) Between $1500 and $2500.\n"
				+ "C) Between $2500 and $5000.\n"
				+ "D) Over $5000.");
		command = input.next();		
		

									//Gets the entered Command

				if (command.equalsIgnoreCase("A"))  {
					
					if (data.size() == 0) {
						String data1[][] = { {"Airline", "Round Trip Price", "Vehicle Rental Price", "Hotel Price" },
								{"American Ailines", "$500", "$30 per day", "$40 per night"}, 
			                    {"InterJet", "$650",  "$500", "$30 per day", "$40 per night"},  
			                    {"Norwegian Airlines", "$200", "$30 per day", "$40 per night"}, 
			                    {"Aerobus", "$500", "$840 per day", "$40 per night"}, 
			                    {"Spirit", "$500", "$670 per day", "$40 per night"}, 
			                  };

			        int col = data1[0].length;
			        int maxWidth[] = new int[col];

			        for(String[] rowD : data1)
			         for(int i=0; i< col; i++)
			         {
			             if(maxWidth[i] < rowD[i].length())
			                 maxWidth[i] = rowD[i].length();
			         }

			        String format = "";

			        for(int x:maxWidth)
			            format += "%-"+(x+2)+"s ";

			        format +="%n";

			        for(String[] rowD : data1)
			        {
			            System.out.printf(format, rowD);
			        }
					
				}
				}
				else if (command.equalsIgnoreCase("B")) {
					System.out.println("");
					if (data.size() == 0) {
						String data1[][] = { {"Airline", "Round Trip Price", "Vehicle Rental Price", "Hotel Price" },
			                    {"United", "$600", "$30 per day", "$60 per night"}, 
			                    {"American Airlines", "$650",  "$500", "$100 per day", "$70 per night"},  
			                    {"Norwegian Airlines", "$800", "$70 per day", "$60 per night"}, 
			                    {"South American", "$500", "$40 per day", "$40 per night"}, 
			                    {"Delta", "$500", "$70 per day", "$60 per night"}, 
			                  };

			        int col = data1[0].length;
			        int row = data1.length;

			        int maxWidth[] = new int[col];

			        for(String[] rowD : data1)
			         for(int i=0; i< col; i++)
			         {
			             if(maxWidth[i] < rowD[i].length())
			                 maxWidth[i] = rowD[i].length();
			         }

			        String format = "";

			        for(int x:maxWidth)
			            format += "%-"+(x+2)+"s ";

			        format +="%n";

			        for(String[] rowD : data1)
			        {
			            System.out.printf(format, rowD);
			        }
					
				}
	}
				else if (command.equalsIgnoreCase("C")) {
					System.out.println("");
					if (data.size() == 0) {
						String data1[][] = { {"Airline", "Round Trip Price", "Vehicle Rental Price", "Hotel Price" },
			                    {"Emirates Airlines", "$500", "$100 per day", "$40 per night"}, 
			                    {"Delta", "$650",  "$400", "$90 per day", "$40 per night"},  
			                    {"American Airlines", "$800", "$50 per day", "$40 per night"}, 
			                    {"Singapore Airlines", "$900", "$80 per day", "$40 per night"}, 
			                    {"Delta", "$500", "$670 per day", "$80 per night"}, 
			                  };

			        int col = data1[0].length;
			        int row = data1.length;

			        int maxWidth[] = new int[col];

			        for(String[] rowD : data1)
			         for(int i=0; i< col; i++)
			         {
			             if(maxWidth[i] < rowD[i].length())
			                 maxWidth[i] = rowD[i].length();
			         }

			        String format = "";

			        for(int x:maxWidth)
			            format += "%-"+(x+2)+"s ";

			        format +="%n";

			        for(String[] rowD : data1)
			        {
			            System.out.printf(format, rowD);
			        }
					
				}
					
				}
	}
	}