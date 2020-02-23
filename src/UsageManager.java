import java.util.*;
public abstract class UsageManager extends FacilityTracker{
	FacilityManager parentManager;
	boolean assignFacilityToUse(String facName, TimeStamp usage) {
		return true;
	}
	boolean vacateFacility(String facName, TimeStamp vacateTime) { return true; }
}
