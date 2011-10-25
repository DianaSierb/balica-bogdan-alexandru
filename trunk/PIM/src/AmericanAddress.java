public class AmericanAddress implements Address{
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