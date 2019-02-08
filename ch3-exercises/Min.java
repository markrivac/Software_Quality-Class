import java.util.*;

public class Min {
	/**
	 * Returns the minimum element in a list
	 * @param list Comparable list of elements to search
	 * @return the minimum element in the list
	 * @throws NullPointerException (NPE) if list is null or
	 *         if any list elements are null
	 * @throws CassCastException (CCE) if list elements are not 
	 * 		   mutually comparable
	 * @throws IllegarArgumentException if list is empty      
	 */

	public static <T extends Comparable<? super T>> T min(List<? extends T> list) {
		if(list.size() == 0) {
			throw new IllegalArgumentException ("Min.min");
		}
		
		Iterator<? extends T> itr = list.iterator();
		T result = itr.next();
		
		// if(result == null) throw new NullPointerException("Min.min");
		
		while (itr.hasNext()) {
			T comp = itr.next();
			if (comp.compareTo(result) < 0) {
				result = comp;
			}
		}
		return result;
	}
} 