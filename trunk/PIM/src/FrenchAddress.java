public class FrenchAddress {
	public Integer getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	private Integer houseNumber;
	private String streetName;
	private Integer postalCode;
	private String town;
	
	public FrenchAddress(int h,String s,int p,String t)	{
		this.houseNumber=h;
		this.streetName=s;
		this.postalCode=p;
		this.town=t;
		}
	public String getAddress()	{
		return this.houseNumber.toString()+" "+this.streetName+" "+this.postalCode.toString()+" "+this.town;
		}
	public String toString() {
		return this.houseNumber.toString()+" "+this.streetName+" "+this.postalCode.toString()+" "+this.town;
		}
	}