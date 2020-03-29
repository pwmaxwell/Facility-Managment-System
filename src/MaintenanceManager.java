import src.MaintTimeStamp;
import src.ScheduleManager;
import sun.applet.Main;

import java.util.*;
import java.util.Map;
public class MaintenanceManager {
	private List<Tuple<String, TimeStamp>> pendingRequests = new LinkedList<Tuple<String, TimeStamp>>();
	private Map<String, List<MaintTimeStamp>> maintDirectory = new HashMap<String, List<MaintTimeStamp>>();
	private Map<String, List<MaintTimeStamp>> maintHistoryDirectory = new HashMap<String, List<MaintTimeStamp>>();
	private ScheduleManager schedule;

	void scheduleMaintenance(String facName, MaintTimeStamp maintenance) {
		maintDirectory.get(facName).add(maintenance);
	}

	void makeFacilitymaintenanceRequest(TimeStamp maintenance, String facName) {
		pendingRequests.add(new Tuple<String, TimeStamp>(facName, maintenance));
	}

	List<Tuple<String, TimeStamp>> listMaintRequests(){
		return pendingRequests;
	}

	List<MaintTimeStamp>getMaintHistory(String facName){
		return maintHistoryDirectory.get(facName);
	}

	void addMaintainance(MaintTimeStamp maint, String facName){
		maintDirectory.get(facName).add(maint);
	}

	List<MaintTimeStamp> listMaintainance(String facName){
		return maintDirectory.get(facName);
	}

	float calcMaintCostForFacility(String facName){
		float cost = 0;
		List<MaintTimeStamp> hist = maintHistoryDirectory.get(facName);
		for(MaintTimeStamp maint : hist){
			cost += maint.getCostUSD();
		}
		return cost;
	}

	void update(){

	}
}
