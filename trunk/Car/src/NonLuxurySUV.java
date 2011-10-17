public class NonLuxurySUV implements SUV{
	private String name;
	public NonLuxurySUV(String cName) {
		this.name=cName;
		}
	public String getSUVName() {
		return name;	
		}
	public String getSUVFeatures() {
		return "Non-luxury Car Features";
	    }
	}