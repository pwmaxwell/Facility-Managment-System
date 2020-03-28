package tests;
import src.*;
import tests.mainTest;

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
