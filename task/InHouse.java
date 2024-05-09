package task1;

public class InHouse extends Employees {
	public InHouse(String iD, String place, String date, double hours, int hourlyRate, int fixedCost) {
		super(iD, place, date, hours, hourlyRate, fixedCost);
		if(this.place.equals("O")){
			System.out.println("The null employee is outsourced. ");
			setID(null);
			setHours(0);
			setHourlyRate(0);
			setFixedCost(0);
		}
	}

}
