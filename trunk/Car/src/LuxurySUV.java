public class LuxurySUV implements SUV{
	private String name;
	public LuxurySUV(String cName) {
		this.name=cName;
		}
	public String getSUVName() {
		return name;	
		}
	public String getSUVFeatures() {
		return "Luxury SUV Features";
		}
	}