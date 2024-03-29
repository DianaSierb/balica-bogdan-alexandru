public class FrenchDate {
	private Integer day;
	private Integer month;
	private Integer year;
	
	public FrenchDate(int d,int m,int y) {
		if((d>0)&&(d<32)&&(m>0)&&(m<13)&&(y>0))
		{
		this.day=d;
		this.month=m;
		this.year=y;
		}
	}
	
	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDate()	{
		return this.day.toString()+" -"+this.month.toString()+"-"+this.year.toString();
		}
	public String toString() {
		return this.day.toString()+" -"+this.month.toString()+"-"+this.year.toString();
		}
	}