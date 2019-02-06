import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoundedQueueTest {
	//BoundedQueue 
	//enQueue
	//deQueue 
	//isEmpty
	//isFull
	//toString 
	
	private BoundedQueue queue;

	  @Before
	  public void setUp() {
	    queue = new BoundedQueue(5);
	  }

	  //Tests if the queue is empty. 
	  @Test
	  public void testEmpty() {
	    assertThat(queue.isEmpty(), is(true));
	  }

	  //Tests if the queue is full. 
	  @Test
	  public void testIsFull() {
	    queue.enQueue(0);
	    queue.enQueue(1);
	    queue.enQueue(2);
	    queue.enQueue(3);
	    queue.enQueue(4);

	    assertThat(queue.isFull(), is(true));

	  }
	  
	  //Tests the enQueue and deQueue methods. 
	  @Test
	  public void testFIFO() {
	    queue.enQueue(0);
	    queue.enQueue(1);
	    queue.enQueue(2);
	    queue.enQueue(3);
	    queue.enQueue(4);

	    assertThat(queue.deQueue(), is(0));
	    assertThat(queue.deQueue(), is(1));
	    assertThat(queue.deQueue(), is(2));
	    assertThat(queue.deQueue(), is(3));
	    assertThat(queue.deQueue(), is(4));

	  }
	  
	  //Tests toString method. 
	  @Test
	  public void testToString() {
	    queue.enQueue(0);
	    queue.enQueue(1);
	    queue.enQueue(2);
	    queue.enQueue(3);
	    queue.enQueue(4);

	    assertThat(queue.toString(), is("[0, 1, 2, 3, 4]"));

	  }

}
