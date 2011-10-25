public class AmericanPhoneNumber {
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
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