import java.util.*; 

public class MaintenanceManager extends FacilityTracker {
	private FacilityManager parentMaintManager;
	//List<String> pendingRequestsName = new LinkedList<String>();
	//List<TimeStamp> pendingRequestsTime = new LinkedList<TimeStamp>();
	private List<Tuple<String, TimeStamp>> pendingRequests = new LinkedList<Tuple<String, TimeStamp>>();
	
	void scheduleMaintenance(String facName, TimeStamp maintenance) {

		futureSchedule.add(maintenance);
	}

	void makeFacilitymaintenanceRequest(TimeStamp maintenance, String facName) {
		pendingRequests.add(new Tuple<String, TimeStamp>(facName, maintenance));
	}

	List<Tuple<String, TimeStamp>> listMaintRequests(){
		return pendingRequests;
	}
}
