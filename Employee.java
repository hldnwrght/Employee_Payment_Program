//Honor Pledge: I pledge that I have neither given nor received any help on this assignment

import java.io.*;
import java.util.*;
//this holds all necessary information within the employee class
public class Employee
{
	//this holds the protected variables to use
	protected String Employee_ID;
	protected String Fname;
	protected String Lname;
	protected int Hours;
	protected int Rate;
	
	//gets the Employee ID
	public String getEmployee_ID(){
		return this.Employee_ID;
	}
	
	//gets the First name
	public String getFname(){
		return this.Fname;
	}
	
	//gets the last name
	public String getLname(){
		return this.Lname;
	}
	
	//gets the hours worked
	public int getHours(){
		return this.Hours;
	}
	
	//gets the rate of each employee
	public int getRate(){
		return this.Rate;
	}
		
		//sets the employee ID
	public void setEmployee_ID(String x){
		this.Employee_ID = x;
	}
	
	//sets the First name of the employee
	public void setFname(String x){
		this.Fname = x;
	}
	
	//sets the Last name of the employee
	public void setLname(String x){
		this.Lname = x;
	}
	
	//Sets the Hours worked
	public void setHours(int x){
		this.Hours = x;
	}
	
}