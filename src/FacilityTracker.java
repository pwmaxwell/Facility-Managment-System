import java.util.*;
public abstract class FacilityTracker extends FacilityManager{
	//Map<String, Facility> directory;
	
	//List<TimeStamp> listActualUsage(String facName){
		
	//}
	//float calcUsageRate(String facName) {
		
	//}
	List<String> listFacilityProblems(String facName){
		List<String> facProblems = new LinkedList<String>(directory.get(facName).problemHistory);
		return facProblems;
	}
	
	List<TimeStamp> listMaint(String facName){
		List<TimeStamp> facMaint = new  LinkedList<TimeStamp>(directory.get(facName).maintHistory);
		return facMaint;
	}
	
	List<TimeStamp> listInspections(String facName){
		List<TimeStamp> facInspections = new  LinkedList<TimeStamp>(directory.get(facName).Inspections);
		return facInspections;
	}
	
	String getFacilityInformation(String facName) {
		String facInformation = directory.get(facName).description;
		return facInformation;
	}
	
	int getAvailableCapacity(String facName) {
		
	}
	
	boolean isInUseDuringInterval(String facName) {
		
	}
	
	float calcMaintCostForFacility(String facName) {
		
	}
	
	float calcProblemRateForFacility(String facName) {
		
	}
	
	float calcDownTimeForFacility(String facName) {
		
	}
}
