public class AmericanAddress implements Address{
	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	private Integer streetNumber;
	private String streetName;
	private String town;
	private String state;
	private Integer zipCode;
	
	public AmericanAddress(int sNumber,String sName,String t,String s,int z) {
		this.streetNumber=sNumber;
		this.streetName=sName;
		this.town=t;
		this.state=s;
		this.zipCode=z;
		}
	
	public String getAddress() {
		return this.streetNumber.toString()+" "+this.streetName+" "+this.town+" "+this.state+" "+this.zipCode.toString();
		}
	public String toString() {
		return "("+this.streetNumber.toString()+" "+this.streetName+" "+this.town+" "+this.state+" "+this.zipCode.toString()+")";
		}
	}