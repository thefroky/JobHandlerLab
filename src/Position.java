
public class Position {
	private String positionCode; //Position Code
	private int reqRank;//Rank required to be here
	private double hSalary;//Position Salary
	private boolean available;//Position Availability
	private boolean jobType; //Full Time [True] Part Time [False];
	
	public Position(String pCode, int rank, double salary, boolean availability, boolean jobType) {
		setPositionCode(pCode);
		setRank(rank);
		setSalary(salary);
		setAvailability(availability);
		setJobType(jobType);
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public int getRank() {
		return reqRank;
	}

	public void setRank(int reqRank) {
		this.reqRank = reqRank;
	}

	public double getSalary() {
		return hSalary;
	}

	public void setSalary(double hSalary) {
		this.hSalary = hSalary;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailability(boolean available) {
		this.available = available;
	}

	public boolean getJobType() {
		return jobType;
	}

	public void setJobType(boolean jobType) {
		this.jobType = jobType;
	}
	
	/**
	 * A method that calculates an average yearly salary.
	 * 1. The calculation depends what type of job it is:
	 * 		a) If the position is part time 20 hours is determined.
	 * 		b) If the position is full time 40 hours is determined.
	 * 
	 * Hint: Given an hourly salary to calculate a yearly salary we 
	 * use the following formula: 
	 * 		totalYearly = payPerHour*Hours*4.5*monthsAYear.
	 * @return 
	 */
	public double getYearlySalary() {
		
			 double totalYearly;
			
			 if(jobType == true){
				 totalYearly = this.getSalary() * 40 * 4.5 * 12;
			
			 }
			 else{
				 totalYearly = this.getSalary() * 20 * 4.5 * 12;
				 
			 }
			 
		 
		
		return totalYearly; //Temporal Return
		
	}
}
