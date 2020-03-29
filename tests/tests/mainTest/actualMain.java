package tests.mainTest;
import src.*;
import tests.mainTest.mainTest;

/*
 * This is not our primary testing means and is only used to test using print statment if that is prefered. 
 * JUnit testing is stored in tests.tests.facilityTest.java
 */

public class actualMain {
	public static void main(String[] args) {
		mainTest test = new mainTest();
		test.testName();
		test.addTime();
		test.addProblem();
		test.addCapacity();
		test.facManagerTest();
	}
}
