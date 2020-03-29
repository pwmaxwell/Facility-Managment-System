package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import src.*;

class facilityTest {


	@Test
	void addTime() { // This will test addUsage
		Facility fac = new Facility();
		FacilityManager man = new FacilityManager();
		TimeStamp time = new TimeStamp();
		fac.addUsage(time);
		assertEquals(fac.getUsage(time), time);
	}
	
	@Test
	void addProblem() { // This will test addProblem and getProblems()
		Facility fac = new Facility();
		String prob = "This is a problem";
		fac.addProblem(prob);
		assertEquals(fac.getProblems().contains("This is a problem"), true);
	}
	
	@Test
	void addCapacity() { // This will test addCapacity
		Facility fac = new Facility();
		fac.addCapacity(150);
		assertEquals(fac.getCapacity(), 150);
	}
	
	@Test
	void facManagerTest() { // This will test addFacility and removeFacility
		Facility fac1 = new Facility();
		Facility fac2 = new Facility();
		Facility fac3 = new Facility();
		FacilityManager man = new FacilityManager();
		man.addFacility("testFac1", fac1);
		man.addFacility("testFac2", fac2);
		man.addFacility("testFac3", fac3);
		assertEquals(man.listFacilities().contains("testFac1"), true);
		assertEquals(man.listFacilities().contains("testFac2"), true);
		assertEquals(man.listFacilities().contains("testFac3"), true);
		
		man.removeFacility("testFac1", fac1);
		assertEquals(man.listFacilities().contains("testFac1"), false);
	}
	
	@Test
	void maintCostTest() { // This will test MaintTimeStamp and addMaint()
		Facility fac = new Facility();
		MaintTimeStamp maintTime = new MaintTimeStamp(null, null, null, 500);
		System.out.println(fac.getMaintHistory());
		fac.addMaint(maintTime);
		System.out.println(fac.getMaintHistory());
		assertEquals(fac.getMaintCost(), 500.00);
	}
	
	@Test
	void getSchedule() { // This will test getSchedule()
		Facility fac = new Facility();
		TimeStamp time = new TimeStamp();
		fac.addUsage(time);
		assertSame(fac.getSchedule().contains(time), true);
	}
	
	@Test
	void getMaintHistory() { // This will test getMaintHistory()
		Facility fac = new Facility();
		MaintTimeStamp maintTime = new MaintTimeStamp(null,null, null, 0);
		fac.addMaint(maintTime);
		assertSame(fac.getMaintHistory().contains(maintTime), true);
	}
	
	@Test
	void getDetails() { //This will test getDetails() and addFacilityDetails()
		Facility fac = new Facility();
		FacilityManager man = new FacilityManager();
		man.addFacility("fac1", fac);
		man.addFacilityDetail("fac1", "This is a detail");
		assertEquals(fac.getDetails().contains("This is a detail"), true);
	}
	
	@Test
	void getInspections() { //This will test addInspection() and getInspections()
		Facility fac = new Facility();
		fac.addInspection("This is an inspection");
		assertEquals(fac.getInspections().contains("This is an inspection"), true);
	}
	
	/*
	 * Needs testing:
	 * 	Facility:
	 * 		getProblemRate()
	 * 		getUsageRate()
	 * 		getDownTime()
	 * 		update()
	 * 		vacateTime()
	 */
}
