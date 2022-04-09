
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
public class ManagementCompany extends java.lang.Object{
	private int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10, MGMT_DEPTH = 10;
	private Plot plot;
	
		//Create a constructor that passes default values
		public ManagementCompany() {			
			this.name = "";
			this.taxID = "";
			this.mgmFeePer = 0;
			this.plot = new Plot(0, 0, 10, 10);
			this.properties = new Property[MAX_PROPERTY];
		}
	
		//Constructor that passes parameter values
		public ManagementCompany(String name, String taxID, double mgmFee) {
			this.name = name;
			this.taxID = taxID;
			this.mgmFeePer = mgmFee;
			this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
			this.properties = new Property[MAX_PROPERTY];
		}
		
		//Constructor that passes parameter values
		public ManagementCompany(String name, String taxID, double mgmFee, 
				int x, int y, int width, int depth) {			
			this.name = name;
			this.taxID = taxID;
			this.mgmFeePer = mgmFee;
			this.plot = new Plot(x, y, width, depth);
			this.properties = new Property[MAX_PROPERTY];
		}
		
		//Copy constructor that creates new object with passed object values
		public ManagementCompany(ManagementCompany otherCompany){
			this.name = otherCompany.name;
			this.taxID = otherCompany.taxID;
			this.mgmFeePer = otherCompany.mgmFeePer;
			this.plot = new Plot(otherCompany.plot);
			this.properties = new Property[MAX_PROPERTY];
		}
		
		//Adds property to properties array 
		public int addProperty(Property property) {
			if(property == null) {
				return -2;
			}
			if(! plot.encompasses(property.getPlot())) {
				return -3;
			}
			for(int i = 0; i < properties.length; i++) {
				if(properties[i] != null) {
					if(properties[i].getPlot().overlaps(property.getPlot())) {
						return -4;
					}
				}
			
			else {
				properties[i] = property;
				return i;
			    }
		    }
			return -1;
		}
		
		//Creates new object with default plot and adds to properties array
		public int addProperty(String name, String city, double rent, String owner) {
		    return addProperty(new Property(name, city, rent, owner));
		}
		
		//Creates object and adds it to properties array
		public int addProperty(String name, String city, double rent, String owner, 
				int x, int y, int width, int depth){
		    return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
		}
		
		//This method accesses each "Property" object within the array "properties" 
		//and sums up the property rent and returns the total amount.
		public double totalRent() {
			
			double total = 0.0;
			for(Property property: properties) {
				if(property == null) {
					break;
				}
				total += property.getRentAmount();
			}
			return total;
		}
		
		//This method finds a property within the properties array that 
		//has the maximum rent amount and returns the rent amount.
		public double maxRentProp() {
			double rentAmount = 0;
			for(Property property: properties) {
				if(property == null) {
					break;
				}
				if(rentAmount < property.getRentAmount()) {
					rentAmount = property.getRentAmount();
				}
			}
			return rentAmount;
		}
		
		//finds the index of the property with the maximum rent amount
		public int maxRentPropertyIndex() {
			int index = 0;
			
			for(int i = 0; i < properties.length; i++) {
				if(properties[i] == null) {
					break;
				}
				if(properties[i].getRentAmount() >= properties[index].getRentAmount()) {
					index = i;
				}
			}
			return index;
		}
		
		//Displays the information of the property at index i
		public java.lang.String displayPropertyAtIndex(int i){
			
			String str= "Property Name: " + properties[i].getPropertyName() + 
						"\n  Located in "+ properties[i].getCity() +
					    "\n  Belonging to: " + properties[i].getOwner() +
					    "\n  Rent Amount: " + properties[i].getRentAmount();
			return str;
		}
		
		//Displays the information of all the properties in the "properties" array.
		public java.lang.String toString(){
			
			String str= " List of the properties for " + this.name + ", taxID: " + taxID +
					"\n__________________________________________________\n";
			for(int i=0; i< properties.length; i++)
			{	
				str +=	"\n Property " + (i+1) +" Name: " + properties[i].getPropertyName() + 
						"\n  Located in "+ properties[i].getCity() +
						"\n  Belonging to: " + properties[i].getOwner() +
						"\n  Rent Amount: " + properties[i].getRentAmount() ;
			}
			str += "\n__________________________________________________\nTotal management Fee: "
					+ ( totalRent()* mgmFeePer/100);
			return str;
		}

		public double getMgmFeePer() {
			return mgmFeePer;
		}

		public void setMgmFeePer(double mgmFeePer) {
			this.mgmFeePer = mgmFeePer;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Property[] getProperties() {
			return properties;
		}

		public void setProperties(Property[] properties) {
			this.properties = properties;
		}

		public String getTaxID() {
			return taxID;
		}

		public void setTaxID(String taxID) {
			this.taxID = taxID;
		}

		public Plot getPlot() {
			return plot;
		}

		public void setPlot(Plot plot) {
			this.plot = plot;
		}

		public int getMGMT_WIDTH() {
			return MGMT_WIDTH;
		}

		public int getMGMT_DEPTH() {
			return MGMT_DEPTH;
		}

		public void setMAX_PROPERTY(int mAX_PROPERTY) {
			MAX_PROPERTY = mAX_PROPERTY;
		}
		public int getMAX_PROPERTY() {
			return MAX_PROPERTY;
		}
}
