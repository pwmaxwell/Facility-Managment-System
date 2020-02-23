import java.util.*;

public abstract class Facility implements TimeStamp{
	List<String> details = new ArrayList<String>();
	List<String> problemHistory = new ArrayList<String>();
	List<TimeStamp> useHistory = new ArrayList<TimeStamp>();
	List<TimeStamp> maintHistory = new ArrayList<TimeStamp>();
	List<TimeStamp> futureSchedule = new ArrayList<TimeStamp>(); 
	List<String> Inspections = new ArrayList<String>();
	int capacity;
	Date startDate = new Date();
	Date currentDate = new Date();
	
	int getProblemRate() { // This will calculate the rate of problems based on the timeframe of the facility
		int numberOfProblems = problemHistory.size(); 
		int timeFrame = startTime.compareTo(currentDate);
		int problemRate = numberOfProblems / timeFrame;
		return problemRate;
		
	}
	
	int getDownTime() { //prints out the amount of time the building was not used while it was open
		int timeSinceBuildingOpen = startDate.compareTo(currentDate);
		int totalDownTime = 0;
		for(int i = 0; i < futureSchedule.size(); i++) {
			int DownTime = futureSchedule.get(i).startTime.compareTo(futureSchedule.get(i).endTime);
			totalDownTime += DownTime;
		}
		int DownTime = timeSinceBuildingOpen - totalDownTime;
		return DownTime;
	}
	
	double getMaintCost(TimeStamp currentMaintStamp) { //returns the maintainance cost in USD of the current TimeStamp
		return maintHistory.get(1).costUSD;
	}
	
	List<String> getProblems(){ //returns the problem history list
		return problemHistory; 
	}
	
	void update() { //Looks through the future schedule. If any of the events has already happened it removes it and adds it to the history
		for(int i = 0; i < futureSchedule.size(); i++) {
			if (futureSchedule.get(i).endTime.before(currentDate) == true) {
				TimeStamp pastDateHistory = futureSchedule.get(i);
				futureSchedule.remove(i);
				useHistory.add(pastDateHistory);
			}
		}
	}
	
	void addUsage(TimeStamp activity) { //adds a TimeStamp to the futureSchudule
		futureSchedule.add(activity);
	}
	
	void vacateTime(TimeStamp clearingTime) { // removes an event from futureSchedule if the event is during clearingTime
		for(int i = 0; i < futureSchedule.size(); i++) {
			if (TimeStamp.startTime.compareTo(TimeStamp.startTime) >= 0) {
				if (futureSchedule.get(i).endTime.compareTo(clearingTime.endTime)<= 0) {
					futureSchedule.remove(i);
				}
			}
		}
	}
	
	int getUsageRate() { // finds the rate someone has used the facility compared to the time since its initial opening
		int timeSinceBuildingOpen = startDate.compareTo(currentDate);
		int totalUsageTime = 0;
		for(int i = 0; i < futureSchedule.size(); i++) {
			int UsageTime = startTime.compareTo(endTime);
			totalUsageTime += UsageTime;
		}
		int usageRate = totalUsageTime / timeSinceBuildingOpen;
		return usageRate;
	}
	
	List<TimeStamp> getSchedule(){ //returns futureSchedule
		return futureSchedule;
	}
	
	List<String> getInspection(){// returns Inspections
		return Inspections;
	}
	
	List<TimeStamp> getMaintHistory(){ //returns maintHistory
		return maintHistory;
	}
	
	void addMaint(TimeStamp maint) { //adds an TimeStamp to maintHistory
		maintHistory.add(maint);
	}
}
