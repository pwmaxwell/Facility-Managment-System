import java.util.*; 

public abstract class MaintainanceManager extends FacilityTracker {
	FacilityManager parentMaintManager;
	List<String> pendingRequestsName = new LinkedList<String>();
	List<TimeStamp> pendingRequestsTime = new LinkedList<TimeStamp>();
	
	void scheduleMaintenance(TimeStamp maintainance, String facName) {
		futureSchedule.add(maintainance);
	}
	void makeFacilityMaintainanceRequest(TimeStamp maintainance, String facName) {
		pendingRequestsName.add(facName);
		pendingRequestsTime.add(maintainance);
	}
	List<TimeStamp> listMaintRequest(){
		return pendingRequestsTime;
	}
}
