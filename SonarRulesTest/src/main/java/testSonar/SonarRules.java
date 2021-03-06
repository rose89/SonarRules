package testSonar;

import java.io.BufferedWriter;
import java.io.FileWriter;
/*
 * Unused Imports
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

class Door{
	void open(){

	}
	void close(){

	}
}

@SuppressWarnings("serial")
public class SonarRules extends ConcurrentHashMap<String, String>{

	private int myProperty;
	public int[] array;

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
	 * Naming - Suspicious equals method name
	 */

	public boolean equals(Object o) {
		return true;
	}


	/*
	 * Using monitor style wait methods on util.concurrent abstraction
	 */

	void methodCallWait() throws InterruptedException{
		wait();
	}
	/*
	 * Performance - Use the nextInt method of Random rather than nextDouble to generate a random integer
	 */

	int rand(){
		Random ran = new Random();
		return ((int)(ran.nextDouble()*10));
	}

	/*
	 * Switch statement found where one case falls through to the next case
	 */
	void methodCallSwitch(){
		switch (rand()){
		case 42 :
			System.out.println("42 c'est la classe !");
		case 0:
			System.out.println("c'est null");
			break;
		}
	}
	/*
	 * Unchecked/unconfirmed cast of return value from method
	 */
	Object methodeWhoReaturnObject (){
		return new SonarRules();
	}
	void methodWhoCallPreviousMethd(){
		ArrayList list = (ArrayList<Integer>)methodeWhoReaturnObject();
	}

	/*
	 * Naming - Suspicious equals method name
	 */
	public  boolean equals(SonarRules o) {
		return true;
	}

	/*
	 * Correctness - A known null value is checked to see if it is an instance of a type
	 */
	public boolean instanceOfNull(){
		Object maVariableNull = null;
		return maVariableNull instanceof Object;
	}

	/*
	 * Correctness - close() invoked on a value that is always null
	 */
	public void closeNull(){
		Door maVariableNull = null;
		maVariableNull.close();
	}

	/*
	 * Performance - Private method is never called
	 */
	private void neverCalledMethod(){
		//nevercalled method
	}

	/*
	 * Security - Array is stored directly
	 */
	public void addArray(int[] list){
		array=list;
	}

	/*
	 * Security - Method returns internal array
	 */
	public int[] returnArray(){
		return this.array;
	}

	/*
	 * Missing Break In Switch
	 */
	public void swithcasemeth(){
		switch (array[0]) {
		case 1:
			array[0]++;
			//error 

		case 2:
			array[0]++;
			break;

		default:
			break;
		}
	}


	/*
	 * Unconditional If Statement
	 */
	public void iftest(){
		if(true) ;
	}




	/*
	 * Naming - Suspicious equals method name
	 */
	public boolean equals(String s) {
		// oops, this probably was supposed to be equals(Object)
		return true;
	}

	/*
	 * 	Performance - Method concatenates strings using + in a loop
	 */
	public void perfplus(){
		// This is bad
		int[] field=new int[]{0,1,2,3,4,5,6};
		String s = "";
		for (int i = 0; i < field.length; ++i) {
			s = s + field[i];
		}
	}

	/*
	Performance - Method invokes inefficient Number constructor; use static valueOf instead
	 */
	public int useNonOptimisedIntegerMethod(){
		return new Integer(5); 
	}

	/*
	 * Dodgy - Useless control flow
	 */
	public void ifStatementEmpty(int a){
		if(a==0){
			//do something
		}
	}

	/*
	 * Misplaced Null Check
	 */
	public void nullcheck(){
		String object1="aa",object2="er";
		if (object1!=null && object2.equals(object1)) { 
			//do something
		}      
	}


	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		SonarRules ap=new SonarRules();
		ap.addArray(new int[]{1,2});
		ap.returnArray();
		ap.swithcasemeth();
		ap.iftest();
		ap.perfplus();
		ap.useNonOptimisedIntegerMethod();
		ap.nullcheck();
	}
}
