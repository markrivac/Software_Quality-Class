public class InClassTest {
    private EH eh1;
    private EH eh2;
    private EH eh3;

    // Question 1
    @Before
    public void setUp() {
        eh1 = new EH(3);
        eh2 = new EH(5);
        eh3 = new EH(3);
    }

    @Test
    public void noNPE() {
        eh1 = null; 
        assertEquals();
    }

    // Question 2
    @Test
    public void equalsFalse() {

    }

    // Question 3
    @Test
    public void equalsTrue() {

    }

    // Question 4
    @Test
    public void hashConsistent() {

    }

    // Question 5
    class EH {
        private int x;

        public EH(int x) {
            this.x = x;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof EH))
                return false;
            return ((EH) obj).x == this.x;
        }
        // @Override public int hashCode() { return x; }
    }
}