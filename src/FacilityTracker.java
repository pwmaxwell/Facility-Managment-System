import java.util.*;
public abstract class FacilityTracker extends FacilityManager{
	List<String> listFacilityProblems(String facName){ // lists all problems located in the facName
		List<String> facProblems = new LinkedList<String>(directory.get(facName).problemHistory);
		return facProblems;
	}
	
	List<TimeStamp> listMaint(String facName){ //lists all maintainance in the facName
		List<TimeStamp> facMaint = new  LinkedList<TimeStamp>(directory.get(facName).maintHistory);
		return facMaint;
	}
	
	List<String> listInspections(String facName){ //lists all inspections in the facName
		List<String> facInspections = new LinkedList<String>(directory.get(facName).Inspections);
		return facInspections;
	}
	
	String getFacilityInformation(String facName) { //lists all information for facName
		String facInformation = directory.get(facName).description;
		return facInformation;
	}
	
	int getAvailableCapacity(String facName){ //returns the amount of available space left in a facility
		int availableCapacity = directory.get(facName).capacity;
		return availableCapacity;
		
	}
	
	double calcMaintCostForFacility(String facName) { //calculates the cost of each maintainance
		double costForFacility = directory.get(facName).costUSD;
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
