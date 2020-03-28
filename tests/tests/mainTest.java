package tests;
import src.*;
public class mainTest {
	
	public void testName() { //tests addFacility() and lookUp()
		Facility fac = new Facility();
		FacilityManager man = new FacilityManager();
		man.addFacility("testFac", fac);
		if(man.lookUp("testFac") == fac) {
			System.out.println("1: Successfully tested addFacility() and lookUp()\n" );
		}
	}
	
	public void addTime() { //tests addUsage() and getUsage()
		Facility fac = new Facility();
		FacilityManager man = new FacilityManager();
		TimeStamp time = new TimeStamp();
		fac.addUsage(time);
		if(fac.getUsage(time) == time) {
			System.out.println("2: Successfully tested addUsage() and getUsage()\n");
		}
	}
	
	public void addProblem() { //tests addProblem() and getProblem()
		Facility fac = new Facility();
		String prob = "This is a problem";
		fac.addProblem(prob);
		if(fac.getProblems().contains("This is a problem")) {
			System.out.println("3: Successfully tested addProblem() and getProblems()\n");
		}
	}
	
	public void addCapacity() {
		Facility fac = new Facility();
		fac.addCapacity(150);
		if(fac.getCapacity() == 150) {
			System.out.println("4: Successfully tested addCapacity() and getCapacity()\n");
		}
	}
	public void facManagerTest() {
		Facility fac1 = new Facility();
		Facility fac2 = new Facility();
		Facility fac3 = new Facility();
		FacilityManager man = new FacilityManager();
		man.addFacility("testFac1", fac1);
		man.addFacility("testFac2", fac2);
		man.addFacility("testFac3", fac3);
		if(man.listFacilities().contains("testFac1") && man.listFacilities().contains("testFac2") && man.listFacilities().contains("testFac3")) {
			System.out.println("5: Successfully tested addFacilty() and listFacilities()\n");
		}
		man.removeFacility("testFac1", fac1);
		if(man.listFacilities().contains("testFac2") && man.listFacilities().contains("testFac3")) {
			System.out.println("6: Successfully tested removeFacility()\n");
		}
	}
}



















