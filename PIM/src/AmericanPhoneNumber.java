public class AmericanPhoneNumber {
	private String phoneNumber;
	public AmericanPhoneNumber(String n) {
		if(n.length()==10){
			this.phoneNumber=n;
		}
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
		}
	public String toString() {
		return this.phoneNumber;
	}

}