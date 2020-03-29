import java.util.*;
public class FacilityTracker{
	private Map<String, Facilities> facilityDirectory;
	private ScheduleManager scheduleModule;
	private UsageManager usageModule;
	private MaintenanceManager maintModule;

	public List<String> listFacilityProblems(String facName){
		return lookUp(facName).getProblems();
	}

	public List<String> listInspections(String facName){
		return lookUp(facName).getInspections();
	}

	public List<String> getFacilityInformation(String facName){
		return lookUp(facName).getDetails();
	}

	public int getAvailableCapacity(String facName){
		return lookUp(facName).getCapacity();
	}

	public float calcProblemRateForFacility(String facName){
		return lookUp(facName).getProblemRate();
	}

	public void addFacilityDetail(String facName, String newDetail){
		lookUp(facName).getDetails().add(newDetail);
	}

	public void addFacility(Facilities newFac){
		facilityDirectory.put(newFac.getName(), newFac);
		scheduleModule.updateFacilities(newFac);
		usageModule.updateFacilities(newFac);
		maintModule.updateFacilities(newFac);
	}

	public Facilities lookUp(String facName){
		return facilityDirectory.get(facName);
	}
}
