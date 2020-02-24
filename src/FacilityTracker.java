import java.util.*;
public abstract class FacilityTracker extends FacilityManager{
	private FacilityManager parentManager;

	public FacilityTracker(FacilityManager parent){
		parentManager = parent;
	}

	List<String> listFacilityProblems(String facName){ // lists all problems located in the facName
		List<String> facProblems = new LinkedList<String>(parentManager.lookUp(facName).getProblems());
		return facProblems;
	}
	
	List<TimeStamp> listMaint(String facName){ //lists all maintainance in the facName
		List<TimeStamp> facMaint = new  LinkedList<TimeStamp>(parentManager.lookUp(facName).getMaintHistory());
		return facMaint;
	}
	
	List<String> listInspections(String facName){ //lists all inspections in the facName
		List<String> facInspections = new LinkedList<String>(parentManager.lookUp(facName).getInspections());
		return facInspections;
	}
	
	String getFacilityInformation(String facName) { //lists all information for facName
		String facInformation = parentManager.lookUp(facName).description;
		return facInformation;
	}
	
	int getAvailableCapacity(String facName){ //returns the amount of available space left in a facility
		int availableCapacity = parentManager.lookUp(facName).getCapacity();
		return availableCapacity;
		
	}
	
	double calcMaintCostForFacility(String facName) { //calculates the cost of each maintainance
		double costForFacility = parentManager.lookUp(facName).costUSD;
		return costForFacility;
	}
	
	float calcProblemRateForFacility(String facName) {  // calculates the problem rate per facility
		int numberOfProblems = problemHistory.size();
		int timeFrame = startTime.compareTo(currentDate);
		int problemRate = numberOfProblems / timeFrame;
		return problemRate;
	}
	
	float calcDownTimeForFacility(String facName) { //calculates the downtime per facility
		int timeSinceBuildingOpen = startDate.compareTo(currentDate);
		int totalDownTime = 0;
		for(int i = 0; i < futureSchedule.size(); i++) {
			int DownTime = futureSchedule.get(i).startTime.compareTo(futureSchedule.get(i).endTime);
			totalDownTime += DownTime;
		}
		int DownTime = timeSinceBuildingOpen - totalDownTime;
		return DownTime;
	}
}
