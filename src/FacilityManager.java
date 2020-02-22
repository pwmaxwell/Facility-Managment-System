import java.util.*;

//COMPLETED; UNTESTED

//interface FacilityManagerInterface extends FacilityInterface{
public abstract class FacilityManager extends Facility{
	Map<String, Facility> directory = new HashMap<String, Facility>();
	
	Facility lookUp(String facName) {
		Facility FacilityTest = directory.get(facName);
		return FacilityTest;
	}
	
	void addFacility(String facName, Facility newFac) {
		directory.put(facName,newFac);
	}
	
	boolean removeFacility(String facName, Facility newFac) {
		if( directory.remove(facName, newFac)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	List<Facility> listFacilities(){
		List<Facility> facilityList = new LinkedList<Facility>(directory.values()); //directory.keySet() if not working

		return facilityList;
	}
	
	void addFacilityDetail(String facName, String detail) {
		Facility FacilityName = directory.get(facName);
		FacilityName.details.add(detail);
	}
	
}

