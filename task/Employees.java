package task1;

public class Employees {

	private String iD;
	protected String place;
	private String date;
	private double hours;
	private int hourlyRate;
	private int fixedCost;
	
	
	
	public Employees(String iD, String place, String date, double hours, int hourlyRate, int fixedCost) {
		super();
		this.iD = iD;
		this.place = place;
		this.date = date;
		this.hours = hours;
		this.hourlyRate = hourlyRate;
		this.fixedCost = fixedCost;
	}
	
	
	public String getID() {
		return iD;
	}

	public double getHours() {
		return hours;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public int getFixedCost() {
		return fixedCost;
	}
	
	public void setID(String iD) {
		this.iD = iD;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	public void setFixedCost(int fixedCost) {
		this.fixedCost = fixedCost;
	}


	public String toString() {
		return getID();
	}


	public double amountOfCosts() {
		
		return (getHours() * getHourlyRate()) + getFixedCost();
	}

}
