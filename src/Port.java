/** Class for the Port object, which holds and integer value. */
public class Port {
    
    private int val;

    /** Creates an instance of a Port object. */
    public Port() {}

    /**
     * Sets the value the Port holds.
     * @param val The new value the Port holds.
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * Fetches the value the Port currently holds.
     * @return The Port's held value.
     */
    public int getVal() {
        return val;
    }
}
