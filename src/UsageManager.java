import java.util.*;
public abstract class UsageManager extends FacilityTracker{
	FacilityManager parentManager;
	boolean assignFacilityToUse(String facName, TimeStamp user) { 
		parentManager.directory.get(facName).futureSchedule.add(user);
		return true;
	}
	boolean vacateFacility(String facName, TimeStamp vacateTime) {	
		if (vacateTime.startTime.compareTo(vacateTime.startTime) >= 0) {
			if (directory.get(facName).endTime.compareTo(vacateTime.endTime)<= 0) {
				directory.remove(facName);
			}	
		}
		return true;
	}
	
}
