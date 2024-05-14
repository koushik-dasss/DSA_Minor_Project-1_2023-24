package minor_project_2341004117;

 class Date {
	 private final int day;
	 private final String month;
	 private final int year;
	 
	 public Date(int day, String month, int year) {
		 this.day = day;
		 this.month = month;
		 this.year = year;
	}
	 public boolean isBefore(Date d1) {
		 return this.year < d1.year ||(this.year == d1.year && (getMonthValue(this.month) < getMonthValue(d1.month)
		 || (getMonthValue(this.month) == getMonthValue(d1.month)&& this.day < d1.day)));
	 }
	 public int getDay() {
		 return day;
     }
	 public String getMonth() {
		        return month;
     }
	 public int getYear() {
		 return year;
	 }
	 private int getMonthValue(String Mmm) {
		        return switch (Mmm) {
		            case "Jan" -> 1;
		            case "Feb" -> 2;
		            case "Mar" -> 3;
		            case "Apr" -> 4;
		            case "May" -> 5;
		            case "Jun" -> 6;
		            case "Jul" -> 7;
		            case "Aug" -> 8;
		            case "Sep" -> 9;
		            case "Oct" -> 10;
		            case "Nov" -> 11;
		            case "Dec" -> 12;
		            default -> -1; // Invalid month
		            };
	  }
		
}


