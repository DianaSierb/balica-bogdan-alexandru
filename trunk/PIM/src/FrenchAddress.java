public class FrenchAddress {
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