import java.util.*;
public abstract class UsageManager extends FacilityTracker{
	FacilityManager parentManager;
	boolean assignFacilityToUse(TimeStamp user) {
		return true;
	}
	boolean vacateFacility(TimeStamp vacateTime) {
		return true;
	}
	
}
