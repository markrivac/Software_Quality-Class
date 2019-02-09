package week4_ex_qa;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InClassTest {
	private EH eh1; private EH eh2; private EH eh3;

	   //  Question 1
	   @Before public void setUp() { 
		   eh1 = new EH(3); 
		   eh2 = new EH(5); 
		   eh3 = new EH(3); 
	   }

       // Question 2
	   @Test public void noNPE() {
		   eh2 = null;
		   assertEquals(false, eh1.equals(eh2));
	   }
	   
	   // Question 3
	   @Test public void equalsFalse() {
		   assertEquals(false, eh1.equals(eh2));
	   }    

	   // Question 4
	   @Test public void equalsTrue() {
		   assertEquals(true, eh1.equals(eh3));
	   }     

	// Question 5
	   @Test public void hashConsistent() {
		   assertEquals(true, eh1.hashCode() == eh3.hashCode());
	   } 
}