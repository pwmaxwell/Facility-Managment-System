import java.util.*;

/*interface FacilityInterface extends TimeStamp{
	List<String> details = new ArrayList<String>();
	List<String> problemHistory = new ArrayList<String>();
	List<TimeStamp> useHistory = new ArrayList<TimeStamp>();
	List<TimeStamp> maintHistory = new ArrayList<TimeStamp>();
	List<TimeStamp> furtureSchedule = new ArrayList<TimeStamp>(); 
	List<TimeStamp> Inspections = new ArrayList<TimeStamp>();
	int capacity = 0;
	int startdate = 0;
	
}*/
public abstract class Facility implements TimeStamp{
	List<String> details = new ArrayList<String>();
	List<String> problemHistory = new ArrayList<String>();
	List<TimeStamp> useHistory = new ArrayList<TimeStamp>();
	List<TimeStamp> maintHistory = new ArrayList<TimeStamp>();
	List<TimeStamp> furtureSchedule = new ArrayList<TimeStamp>(); 
	List<TimeStamp> Inspections = new ArrayList<TimeStamp>();
	int capacity;
	int startDate;
	int currentDate;
	
	float getProblemRate() {
		//not sure how im meant to calculate this. tentative implementation of this until i can think of a better way
		float numberOfProblems = problemHistory.size();
		float timeFrame = currentDate - startDate;
		float problemRate = numberOfProblems / timeFrame;
		return problemRate;
		
	}
	
	float getDownTime() {
		return 1f; 
		// once again, dont know how to implement this
	}
	
	float getMaintCost() {
		//calculate the value of the time. any information about the cost available? Just meant to guess cost?
		return 1f;
	}
	
	List<String> getProblems(){
		return problemHistory; 
	}
	
	void update() {
		//???
	}
	
	void addUsage(TimeStamp activity) {
		
	}
	
	void vacateTime(TimeStamp clearingTime) {
		
	}
	
	float getUsageRate() {
		return 1f;
	}
	
	List<TimeStamp> getSchedule(){
		
	}
	
	List<String> getInspection(){
		
	}
	
	List<TimeStamp> getMaintHistory(){
		
	}
	
	void addMaint(TimeStamp maint) {
		
	}
}
