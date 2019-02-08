<code>

    public class InClassTest {
    private EH eh1; private EH eh2; private EH eh3;

    //  Question 1
    @Before public void setUp() { eh1 = new EH(3); eh2 = new EH(5); eh3 = new EH(3); }

    @Test public void noNPE() {...}          // Question 2

    @Test public void equalsFalse() {...}    // Question 3

    @Test public void equalsTrue() {...}     // Question 4

    @Test public void hashConsistent() {...} // Question 5
    }
    class EH {
    private int x;
    public EH(int x) { this.x = x; }

    @Override public boolean equals(Object obj) {
        if (!(obj instanceof EH)) return false;
        return ((EH) obj).x == this.x;
    }
    // @Override public int hashCode() { return x; }
    }

</code>

1. Given the 4 @Test methods shown, how many times does the @Before method execute?

    It will run 4 times since the @Before method executes before the Test method.
    
    Source: http://junit.sourceforge.net/javadoc/org/junit/Before.html 

2. The contract for equals() states that no exceptions may be thrown. Instead, equals() is supposed to return false if passed a null argument. Write a JUnit test that verifies this property for the EH class.

4. Using the given EH objects, write a test that verifies that equals() returns false if the objects are, in fact, not equal.

5. Using the given EH objects, write a test that verifies that equals() returns true if the objects are, in fact, equal.

6. Using the given EH objects, write a test to verify that hashCode() is consistent with equals. This test should fail if hashCode() is commented out (as shown), but pass if hashCode() is implemented.

Submit your answers as a team in a blog post using your "team category" for the post. Submit that URL here and you probably want the code in your team repository on GitHub.