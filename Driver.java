//Honor Pledge: I pledge that I have neither given nor received any help on this assignment

import java.io.*;
import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		//all necessary variables
		int i = 0, inc = 0, T;
		int A, B;
		
		// sets up the scanner
		Scanner Ch = new Scanner(System.in);
		
		//Allocates memory
		Employee Phar_Man, Pharm, Tech, Sen_Tech;
		Employee[] store = new Employee[6];
		
		//runs while true
		while(true)
		{
			System.out.println("1.	Load Employees (From File)");
			System.out.println("2.	Exit Program");
			int C = Ch.nextInt();
			if(C == 1){
				try{
					//Reads the file
					FileReader filereader = new FileReader("employees.txt");
					//Wraps reader in the buffer
					BufferedReader input = new BufferedReader(filereader);
					
					String line = input.readLine();
					
					//The below is for iterating through the file one line at a time until it is null
					while((line = input.readLine()) != null){ 
						String[] parts = line.split(",");
						
						//sets employee 1
						if(parts[0].equals("1")){
							
							Phar_Man = new Pharmacy_Manager();
							
							Phar_Man.setEmployee_ID(parts[1]);
							Phar_Man.setFname(parts[2]);
							Phar_Man.setLname(parts[3]);
							
							store[inc] = Phar_Man;
						}
						//sets employee 2
						else if(parts[0].equals("2")){
							
							Pharm = new Pharmacist();
							
							Pharm.setEmployee_ID(parts[1]);
							Pharm.setFname(parts[2]);
							Pharm.setLname(parts[3]);
							store[inc] = Pharm;
						}
						//sets employee 3
						else if(parts[0].equals("3")){
							
							Tech = new Technician();
							
							Tech.setEmployee_ID(parts[1]);
							Tech.setFname(parts[2]);
							Tech.setLname(parts[3]);
							
							store[inc] = Tech;
						}
						//sets employee 4
						else{
							
							Sen_Tech = new Senior_Technician();
							
							Sen_Tech.setEmployee_ID(parts[1]);
							Sen_Tech.setFname(parts[2]);
							Sen_Tech.setLname(parts[3]);
							
							store[inc] = Sen_Tech;
						}
					
						inc++;
						
					}
					i = 1;
					break;
				}
				//catches all exceptions
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
			//exits the program
			else if(C == 2){
				System.out.println( "Program Exiting...");
				break;
			}
			//tells user of incorrect output
			else{
				System.out.println("Error: You chose an incorrect input try to enter a 1 or 2...\n\n");
				continue;
			}
		}
		if(i == 1){
			
			while(true){
				System.out.println("1.  Print Employee information");
				System.out.println("2.  Enter Hours Worked");
				System.out.println("3.  Calculate Paychecks");
				System.out.println("4.  Exit Program");
				
				A = Ch.nextInt();
				//if user chooses 1 then it increments through the array and prints out desired info
				if(A == 1){
					for(T = inc - 4; T <= 3; T++){
					
						System.out.format("ID:  " + store[T].getEmployee_ID() + "  ");
						System.out.format("Name:  %-15s %-15s", store[T].getFname(), store[T].getLname());
						System.out.format("Rate:  %2d", store[T].getRate());
						System.out.println(" ");
					
					}
					continue;
				}
				
				//if the user chooses 2 then it sets the hours worked for each employee
				else if(A == 2){
					System.out.print("Please enter the hours worked:  ");
					B = Ch.nextInt();
					System.out.println(" ");
					for(T = inc - 4; T <= 3; T++){
							store[T].setHours(B);
							i = 2;
					 continue;
					}
				}
				//if the user inputs a 3 then the ID and paycheck is outputted
				else if(A == 3){
					if(i == 2){
						int m, n, pay;
						for(T = inc - 4; T <= 3; T++){
							
								m = store[T].getHours();
								n = store[T].getRate();
								pay = m * n;
								System.out.format("ID:  " + store[T].getEmployee_ID() + "  ");
								System.out.format("Check Amount:  $" + pay);
								System.out.println(" ");
						}
					 continue;
					}
					else{
						System.out.println("Error: hour's worked not entered...");
						continue;
					}
				}
				
				else if(A == 4){
					System.out.println( "Program Exiting...");
					break;
				}
				
				else{
					System.out.println("Error: You chose an incorrect input try to enter a 1, 2, 3, 4...\n\n");
					continue;
				}
			
			}
		}
		
	}
}