public class AmericanDate {
	private Integer day;
	private Integer month;
	private Integer year;
	
	public AmericanDate(int d,int m,int y) {
		if((d>0)&&(d<32)&&(m>0)&&(m<13)&&(y>0)) {
		this.day=d;
		this.month=m;
		this.year=y;
		}
	}
	public String getDate()	{
		return this.month.toString()+"-"+this.day.toString()+"-"+this.year.toString();
		}
	public String toString() {
		return this.month.toString()+"/"+this.day.toString()+"-"+this.year.toString(); }
	}