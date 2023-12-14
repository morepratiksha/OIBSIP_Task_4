package Examination_System;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Scanner;

public class examination_system {
	public static void main(String[] args)
	 {

		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------WELCOME TO ONLINE EXAMINATION SYSTEM----------------");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("---------------------------------LOGIN-------------------------------");
		
		System.out.print("Enter User ID :");
		String user_id = sc.next();
		System.out.print("Enter Password :");
		String pass = sc.next();
		{
				System.out.println("---------------------- LOGIN SUCCESSFULL---------------------");
				LOGIN();
	}
	}
	public static void LOGIN() {
	
		
	final int BUTTON1 = 2;

	
	Scanner sc = new Scanner(System.in);

	System.out.println("-------------------------------------------------------------------------");
	System.out.println("Press 1 to UPDATE PROFILE AND PASSWORD ");
	System.out.println("Press 2 to START MCQ TEST");
	int button3 = sc.nextInt();
	switch (button3) {
		case 1 -> {
			String name="";
			int age= 0;
			int batch   = 0;
			int roll_no = 0;
			String pass = "";
			System.out.println("------------------------------------------------------------------");
			System.out.print("Enter Name : ");
			try {
				 name = sc.next();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			
			System.out.print("Enter Age : ");
			try {
				age  = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);

			}

			System.out.print("Enter Batch : ");
			try {
				batch  = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);

			}
			
			
			System.out.print("Enter id : ");
			try {
				 roll_no = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);

			}
			System.out.print("Update Password : ");
			try {
				 pass = sc.next();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
		
	
			System.out.println("---------------------------PROFILE UPDATED--------------------------------");
			System.out.println("--------------------------------------------------------------------------");
			
			
			System.out.println("Name :" +name);
			System.out.println("Age :"+ age);
			System.out.println("Batch :"+batch);
			System.out.println("ID : " +roll_no);
			System.out.println("\n\n");
		 MCQ();
				}

		case 2 -> {
			MCQ();
		}

		        
		
		
		default -> {
			System.out.println(" ------------------------INCORRECT INPUT------------------------- ");
			System.out.println("------------------------------------------------------------------");
		}
		}
	}
		
		  public static void MCQ() {
			  
			  System.out.println("----------------------------INSTRUCTIONS-------------------------");
			  System.out.println("Test consists of 10 qustions. \nTime to complete the test is 30 minutes.\nTest will be auto submitted after 30 minutes.\nPress 1 to select first option, 2 for second option, 3 for thired option and 4 to select fourth option as ur answer. \nYou will see the submit option once you answer all 10 questions.");
			
			  Scanner sc = new Scanner(System.in);
		  System.out.println("\nPress 1 to START TEST");
		 
		  String MCQ=sc.nextLine();
		if(MCQ.equalsIgnoreCase("1"))
	        {
			  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("                                                           yyyy/MM/dd HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   System.out.println( dtf.format(now)); 
			System.out.println("\nQ1) Number of primitive data types in java are?");
			System.out.println("1) 6 \n2) 7 \n3) 8 \n4) 9");
			System.out.println("Answer:");
			
		

			String mcq=sc.nextLine();
				if(mcq.equalsIgnoreCase("3"))
		        {
		  	        {System.out.println("Correct Answer");
		  	        }
		  	        }
		  	        
		  	      else if(mcq.equalsIgnoreCase("1"))
		          {
		            System.out.println("Wrong Answer");
		            
		          }
		  	    else if(mcq.equalsIgnoreCase("2"))
		          {
		            System.out.println("Wrong Answer");
		            
		          }
		  	  else if(mcq.equalsIgnoreCase("4"))
	          {
	            System.out.println("Wrong Answer");
	            
	          }
	 else
		          {
		              System.out.println("!!! INVALID INPUT !!!");
		           
		              mcq();
		          } 
		        
		        
				System.out.println("\nQ2) What is the size of float and double in java?");
				System.out.println("1) 32 and 64 \n2) 32 and 32 \n3) 64 and 64 \n4) 64 and 32");
				System.out.println("Answer:");
				
				String mcq1=sc.nextLine();

			        if(mcq1.equalsIgnoreCase("1"))
			        {
			  	        {System.out.println("Correct Answer");
			  	        }
			  	        }
			  	        
			  	      else if(mcq1.equalsIgnoreCase("3"))
			          {
			            System.out.println("Wrong Answer");
			            
			          }
			  	    else if(mcq1.equalsIgnoreCase("2"))
			          {
			            System.out.println("Wrong Answer");
			            
			          }
			  	  else if(mcq1.equalsIgnoreCase("4"))
		          {
		            System.out.println("Wrong Answer");
		            
		          }
		 else
			          {
			              System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
			          } 
			        
			        
					System.out.println("\nQ3) Automatic type conversin is possible in which of the possible cases?");
					System.out.println("1) Byte ti int \n2) Int to long \n3) Long to int \n4) Short to int");
					System.out.println("Answer:");
					
					
					String mcq2=sc.nextLine();
				        if(mcq2.equalsIgnoreCase("2"))
				        {
				  	        {System.out.println("Correct Answer");
				  	        }
				  	        }
				  	        
				  	      else if(mcq2.equalsIgnoreCase("1"))
				          {
				            System.out.println("Wrong Answer");
				            
				          }
				  	    else if(mcq2.equalsIgnoreCase("3"))
				          {
				            System.out.println("Wrong Answer");
				            
				          }
				  	  else if(mcq2.equalsIgnoreCase("4"))
			          {
			            System.out.println("Wrong Answer");
			            
			          }
			 else
				          {
				              System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
				          } 
		        
				        
						System.out.println("\nQ4) When an array is passed to a method, what does the method recieve?");
						System.out.println("1) The reference of the array \n2) A copy of the array \n3) Length of the array \n4) Copy of first element");
						System.out.println("Answer:");
						
						
						String mcq3=sc.nextLine();
					        if(mcq3.equalsIgnoreCase("1"))
					        {
					  	        {System.out.println("Correct Answer");
					  	        }
					  	        }
					  	        
					  	      else if(mcq3.equalsIgnoreCase("2"))
					          {
					            System.out.println("Wrong Answer");
					            
					          }
					  	    else if(mcq3.equalsIgnoreCase("3"))
					          {
					            System.out.println("Wrong Answer");
					            
					          }
					  	  else if(mcq3.equalsIgnoreCase("4"))
				          {
				            System.out.println("Wrong Answer");
				            
				          }
				 else
					          {
					              System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
					          } 
					        
					        
							System.out.println("\nQ5)Select the valid statement ?");
							System.out.println("1) char[]ch=new char(5) \n2) char[]ch=new char[5] \n3) char[]ch=new char() \n4) char[]ch=new char[]");
							System.out.println("Answer:");
							
							
							String mcq4=sc.nextLine();
						        if(mcq4.equalsIgnoreCase("2"))
						        {
						  	        {System.out.println("Correct Answer");
						  	        }
						  	        }
						  	        
						  	      else if(mcq4.equalsIgnoreCase("1"))
						          {
						            System.out.println("Wrong Answer");
						            
						          }
						  	    else if(mcq4.equalsIgnoreCase("3"))
						          {
						            System.out.println("Wrong Answer");
						            
						          }
						  	  else if(mcq4.equalsIgnoreCase("4"))
					          {
					            System.out.println("Wrong Answer");
					            
					          }
					 else
						          {
						              System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
						          }
						        submit();
	        }
						        
	        }
		public static void submit() {
			Scanner sc = new Scanner(System.in);

						        System.out.println("Type SUBMIT to end the test");
						        String sub=sc.nextLine();

						        if(sub.equalsIgnoreCase("Submit"))                                   
						        {
						  	        {System.out.println("\n---------------TEST SUBMITTED SUCCESFULLY---------------");
						  	        System.out.println("-------------------YOU MAY EXIT---------------------------");
						  	        
						  	        System.out.println("Press 1 to LOG OUT!");
						  	      String sub1=sc.nextLine();

							        if(sub1.equalsIgnoreCase("1"))                                   
							        System.out.println("-------------------LOGGED OUT SUCCESFULLY-----------------");
							        else
							        {
							            System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
							        }
						  	        }
						        }
						        
		
						        else
						        {
						            System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
						            submit();
						        }
		}
						       
	  	

		  
			
		private static void mcq() {
			// TODO Auto-generated method stub
			
		}
}

		
		
	
	



