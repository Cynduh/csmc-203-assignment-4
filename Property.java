
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:
 * Due: 4/8/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Johnathan Duong
*/
public class Property extends java.lang.Object{

	private String city, owner, propertyName;
	private double rentAmount;
	private Plot plot;
	
	//Create a constructor that passes default values
	public Property() {
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		plot = new Plot(0, 0, 1, 1);
	}
	
	//Copy Constructor
	public Property(Property p) {
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
	}
	
	//Constructor that passes new information
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	//Parameterized constructor
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	//get city
	public String getCity() {
		return city;
	}
	//set city
	public void setCity(String city) {
		this.city = city;
	}
	//get owner
	public String getOwner() {
		return owner;
	}
	//set owner
	public void setOwner(String owner) {
		this.owner = owner;
	}
	//get PropertyName
	public String getPropertyName() {
		return propertyName;
	}
	//set PropertyName
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	//get RentAmount
	public double getRentAmount() {
		return rentAmount;
	}
	//set RentAmount
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	//get Plot
	public Plot getPlot() {
		return plot;
	}
	//set Plot
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	public String toString(){
		String str = "Property Name: " + propertyName + "\nLocated in " + city + "\nBelong to: " + owner 
        		+ "\nRent Amount: " + rentAmount;
		
		return str;
	}
	
}
