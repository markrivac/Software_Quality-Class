1. Given the 4 @Test methods shown, how many times does the @Before method execute?
Before annotation runs once for every test. So in total there are 4 calls to Before annotation. Source: http://junit.sourceforge.net/javadoc/org/junit/Before.html

2. The contract for equals() states that no exceptions may be thrown. Instead, equals() is supposed to return false if passed a null argument. Write a JUnit test that verifies this property for the EH class.
Result in InClassTest Class.

3. Using the given EH objects, write a test that verifies that equals() returns false if the objects are, in fact, not equal.
Result in InClassTest Class.

4. Using the given EH objects, write a test that verifies that equals() returns true if the objects are, in fact, equal.
Result in InClassTest Class.

5. Using the given EH objects, write a test to verify that hashCode() is consistent with equals. This test should fail if hashCode() is commented out (as shown), but pass if hashCode() is implemented.
Result in InClassTest Class.