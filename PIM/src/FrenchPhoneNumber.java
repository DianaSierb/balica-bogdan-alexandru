public class FrenchPhoneNumber {
	private String phoneNumber;
	public FrenchPhoneNumber(String n) {
		if((n.length()==10)&&(n.indexOf("0")==0)){
			this.phoneNumber=n;
			}
		}
	public String getPhoneNumber()	{
		return this.phoneNumber;
		}
	public String toString() {
		return this.phoneNumber;
		}
	}