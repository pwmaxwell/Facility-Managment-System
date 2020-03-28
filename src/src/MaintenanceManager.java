package src;
import java.util.*; 

public class MaintenanceManager {
	private FacilityManager parentManager;
	//List<String> pendingRequestsName = new LinkedList<String>();
	//List<TimeStamp> pendingRequestsTime = new LinkedList<TimeStamp>();
	private List<Tuple<String, TimeStamp>> pendingRequests = new LinkedList<Tuple<String, TimeStamp>>();
	
	void scheduleMaintenance(String facName, MaintTimeStamp maintenance) {

		parentManager.lookUp(facName).addMaint(maintenance);
	}

	void makeFacilitymaintenanceRequest(TimeStamp maintenance, String facName) {
		pendingRequests.add(new Tuple<String, TimeStamp>(facName, maintenance));
	}

	List<Tuple<String, TimeStamp>> listMaintRequests(){
		return pendingRequests;
	}
}