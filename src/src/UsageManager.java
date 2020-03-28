package src;
import java.util.*;
//ab
public class UsageManager{
	FacilityManager parentManager;
	boolean assignFacilityToUse(String facName, TimeStamp use) {
		return parentManager.lookUp(facName).addUsage(use);
	}
	void vacateFacility(String facName, TimeStamp vacateTime) {
		parentManager.lookUp(facName).vacateTime(vacateTime);
	}
}