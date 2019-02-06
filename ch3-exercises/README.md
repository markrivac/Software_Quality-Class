# Chapter 3 Exercises 
## Team: Súbete a Mi Bici 
### Katia Chumakova, Gabriel Trujillo, Mark Rivera, Ismael Lizárraga 

#### Question 1. 
##### Why do testers automation testing? What are the limitations of automation?

Testers usually automate testing to reduce cost and human error and it is way faster than the manual testing and it has a wider test coverage. Some limitations of automation testing are that it is very hard to design sufficient tests and it can take up a lot of time as well as additional tools. 

#### Question 2. 
##### Consider the following example class: PrimeNumbers …

(a)	A test that does not reach the fault

<code>

    import org.junit.Test;
    
    import static org.junit.Assert.*;

    @Test
    public void testComputePrimes() {
	    PrimeNumbers pn = new PrimeNumbers();
    	Int[] result = pn.computePrimes(0); 
	    assertEquals([], result); // never executes de while loop 
    }
</code>

(b)	A test that reaches the fault, but does not infect

<code>

    import org.junit.Test;
    import static org.junit.Assert.*;

    @Test
    public void testComputePrimes() {
        PrimeNumbers pn = new PrimeNumbers();
        Int[] result = pn.computePrimes(18);
        assertEquals([2,3,5,7,11,13,17], result); 
    }

</code>

(c) A test that infects the state, but does not propagate
<code>
    
    import org.junit.Test;
    import static org.junit.Assert.*;

    @Test
    public void testComputePrimes() {
        PrimeNumbers pn = new PrimeNumbers();
        Int[] result = pn.computePrimes(24);
        assertEquals([2,3,5,7,11,13,17,19,23], result); 
    }
    // State is affected but doesn’t affect rest of calculations

</code>

(d)	A test that propagates, but does not reveal

This is impossible, as soon as the program reaches the fault (which would be calculating the primes of 19 it would infect and there would be an incorrect program state and return value. // no calculations depend on these numbers.

(e) A test that reveals the fault

<code>
    
    import org.junit.Test;
    import static org.junit.Assert.*;

    @Test
    public void testComputePrimes() {
        PrimeNumbers pn = new PrimeNumbers();
        Int[] result = pn.computePrimes(19);
        assertEquals([2,3,5,7,11,13,17,19], result);
    }

</code>

#### Question 3. 
##### Develop JUnit tests for the BoundedQueue class. A compilable version is available on the book website in the file BoundedQueue.java. Make sure your tests check every method, but we will not evaluate the quality of your test designs and do not expect you to satisfy any test criteria. Turn in a printout of your JUnit tests and either a printout or a screen shot showing the results of each test.

Refer to BoundedQueue.java and BoundedQueueTest.java file in this folder. 