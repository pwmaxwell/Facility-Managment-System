package FacilityPackage;
import java.util.*;

public abstract class Facilities {
	private List<String> details = new ArrayList<String>();
	private List<String> problemHistory = new ArrayList<String>();
	private List<String> Inspections = new ArrayList<String>();
	private int capacity;
	private Date startDate = new Date();
	private Date currentDate = new Date();
	private String name;
	
	public int getProblemRate() { // This will calculate the rate of problems based on the timeframe of the facility
		int numberOfProblems = problemHistory.size(); 
		int timeFrame = startDate.compareTo(currentDate);
		int problemRate = numberOfProblems / timeFrame;
		return problemRate;
	}

	public List<String> getProblems(){ //returns the problem history list
		return problemHistory; 
	}

	public List<String> getInspections(){// returns Inspections
		return Inspections;
	}


	public List<String> getDetails(){
	    return details;
    }

	public int getCapacity(){ return capacity; }

	public Date getStart(){
		return startDate;
	}

	public String getName(){
		return name;
	}
}
