import java.util.*;
public abstract class UsageManager extends FacilityTracker{
	FacilityManager parentManager;
<<<<<<< HEAD
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
	
=======
	boolean assignFacilityToUse(String facName, TimeStamp usage) {
		return true;
	}
	boolean vacateFacility(String facName, TimeStamp vacateTime) { return true; }
>>>>>>> 3460bc17bc1547895e080a7bb4470141a6f1595c
}
