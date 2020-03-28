package src;
import java.util.*;
//ab
public class FacilityTracker extends FacilityManager{
	private FacilityManager parentManager;

	public FacilityTracker(FacilityManager parent){
		parentManager = parent;
	}

	List<String> listFacilityProblems(String facName){ // lists all problems located in the facName
		return parentManager.lookUp(facName).getProblems();
	}
	
	List<MaintTimeStamp> listMaint(String facName){ //lists all maintainance in the facName
		return parentManager.lookUp(facName).getMaintHistory();
	}
	
	List<String> listInspections(String facName){ //lists all inspections in the facName
		return parentManager.lookUp(facName).getInspections();
	}
	
	List<String> getFacilityInformation(String facName) { //lists all information for facName
		return parentManager.lookUp(facName).getDetails();
	}
	
	int getAvailableCapacity(String facName){ //returns the amount of available space left in a facility
		return parentManager.lookUp(facName).getCapacity();

		
	}
	
	double calcMaintCostForFacility(String facName) { //calculates the cost of each maintainance
		return parentManager.lookUp(facName).getMaintCost();
	}
	
	float calcProblemRateForFacility(String facName) {  // calculates the problem rate per facility
		return parentManager.lookUp(facName).getProblemRate();
	}
	
	float calcDownTimeForFacility(String facName) { //calculates the downtime per facility
		return parentManager.lookUp(facName).getDownTime();
	}
}