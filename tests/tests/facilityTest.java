package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import src.*;

class facilityTest {

	@Test
	void testName() { // This will test if addFacility() and lookUp() works
		Facility fac = new Facility();
		FacilityManager man = new FacilityManager();
		man.addFacility("testFac", fac);
		assertSame(fac, man.lookUp("testFac"));
	}

	@Test
	void addTime() { // This will test addUsage
		Facility fac = new Facility();
		FacilityManager man = new FacilityManager();
		TimeStamp time = new TimeStamp();
		fac.addUsage(time);
		assertEquals(fac.getUsage(time), time);
	}
	
	@Test
	void addProblem() { // This will test addProblem
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
}
