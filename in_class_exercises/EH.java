package week4_ex_qa;

public class EH {
	private int x;
	   public EH(int x) { this.x = x; }

	   @Override public boolean equals(Object obj) {
	      if (!(obj instanceof EH)) return false;
	      return ((EH) obj).x == this.x;
	   }
	   
	   //@Override public int hashCode() { return x; }
}
