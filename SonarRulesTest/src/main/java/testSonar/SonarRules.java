package testSonar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Vector;

/*
 * Unused Imports
 */
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class SonarRules extends ConcurrentHashMap<String, String>{

	private int myProperty;

	/* Naming - Suspicious constant field name */
	double PI = 3.16;

	/*
	 * Instantiation To Get Class
	 */
	public void instantiationToGetClass() {
		Class c = new String().getClass();
		System.out.println(c.getName());
	}

	/*
	 * Integer Instantiation
	 */
	public void InstantiationInteger() {
		Integer i = new Integer(2);
		System.out.println("integer " + i);
	}

	/*
	 * Interface names should comply with a naming convention
	 */
	public interface interfaceNonCompliant {

	}

	/*
	 * Local variable names should comply with a naming convention
	 */
	public void method() {
		int NONCOMPLIANT;
	}

	/*
	 * Loose coupling
	 */

	public void looseCoupling() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
	}

	/*
	 * Method names should comply with a naming convention
	 */

	public void SetMyProperty(int value) {
		myProperty = value;
	}

	/*
	 * Methods should not have too many parameters
	 */

	public void tooManyArguments(int i1, int i2, int i3, int i4, int i5,
			int i6, int i7, int i8) {
		System.out.println("too long parameters");
	}

	/*
	 * Missing Static Method In Non Instantiatable Class
	 */
	class NonInstantiatableClass {
		private NonInstantiatableClass() {
		}
	}

	/*
	 * Naming - Method with same name as enclosing class
	 */
	public void SonarRules() {
	}

	/*
	 * Naming - Suspicious equals method name
	 */
	/*
	 * public int equals(Object o) { // signal� par java return 0; }
	 */

	/*
	 * Naming - Suspicious hashCode method name
	 */
	public int hashcode() {
		// oops, this probably was supposed to be hashCode
		return 0;
	}

	/*
	 * Ncss Method Count
	 */

	/*
	 * Nested blocks of code should not be left empty
	 */
	void doSomething() {
		for (int i = 0; i < 4; i++) // Non-Compliant
		{
		}
	}

	/*
	 * Package names should comply with a naming convention: package
	 * org.Example;
	 */

	/*
	 * Replace Vector With List
	 */

	public void vectorNonCompliant() {
		Vector<Integer> vector = new Vector<Integer>();
	}

	/*
	 * Statements should be on separate lines
	 */

	public void statementInSameLine() {
		String a = "something";String b = "somethingElse"; // desactiver saveAction
	}

	/*
	 * String Instantiation+String To String+Unused local variable+Unused formal
	 * parameter
	 */
	public String stringInstantiationInutile(int paramInutil) {
		int inutil = 2;
		String test = "test";
		test = "test2";
		return test.toString();
	}
	
	/*
	 * Avoid Catching Throwable+Unconditional If Statement
	 */
	public void catchThrowableAndInconditionalIf() {
		if (true) {
			try {
				BufferedWriter un = new BufferedWriter(new FileWriter("un.txt"));
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
	
	/*
	 * Equals Hash Code
	 */
	
	public boolean equals(Object o) {
		return true;
	}
	

	//page 15 Findbug major-critical
	/*
	 * Using monitor style wait methods on util.concurrent abstraction
	 */
	
	void methodCallWait() throws InterruptedException{
		this.wait();
	}
	/*
	 * Performance - Use the nextInt method of Random rather than nextDouble to generate a random integer
	 */
	
	int rand(){
		Random ran = new Random();
		return (int)(ran.nextDouble()*10);
	}
	//fin page 15 Findbug major-critical
}
