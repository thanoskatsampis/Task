package task1;

public class Outsource extends Employees {
	
	public Outsource(String iD, String place, String date, double hours, int hourlyRate, int fixedCost) {
		super(iD, place, date, hours, hourlyRate, fixedCost);
		if(this.place.equals("I")){
			System.out.println("THe null employee works inhouse.");
			setID(null);
			setHours(0);
			setHourlyRate(0);
			setFixedCost(0);
		}
	}

}
