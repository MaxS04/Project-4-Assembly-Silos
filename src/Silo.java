/**
 * Class for the Silo object. Holds values of the accumulator and backup, and what ports it connects to.
 * Also has its interpreter.
 */
public class Silo {

    private int acc;
    private int bak;
    private final int NIL = 0;

    private Port upPort;
    private Port downPort;
    private Port leftPort;
    private Port rightPort;

    /**
     * Creates an instance of a Silo object. Assigns ports and the base values of accumulator and backup.
     * @param upPort The port above the silo.
     * @param downPort The port below the silo.
     * @param leftPort The port to the left of the silo.
     * @param rightPort The port to the right of the silo.
     */
    public Silo(Port upPort, Port downPort, Port leftPort, Port rightPort) {
        acc = 0;
        bak = 0;
        this.upPort = upPort;
        this.downPort = downPort;
        this.leftPort = leftPort;
        this.rightPort = rightPort;
    }

    /**
     * Sets the value of the accumulator.
     * @param acc The new value of the accumulator.
     */
    public void setAcc(int acc) {
        this.acc = acc;
    }

    /**
     * Fetches the current value of the accumulator.
     * @return The accumulator's value.
     */
    public int  getAcc() {
        return acc;
    }

    /**
     * Sets the value of the backup.
     * @param bak The new value of the backup.
     */
    public void setBak(int bak) {
        this.bak = bak;
    }

    /**
     * Fetches the current value of the backup.
     * @return The backup's value.
     */
    public int getBak() {
        return bak;
    }

    /**
     * Fetches NIL.
     * @return NIL.
     */
    public int  getNIL() {
        return NIL;
    }

    /**
     * Fetches the port above the silo.
     * @return The port above the silo.
     */
    public Port getUpPort() {
        return upPort;
    }

    /**
     * Fetches the port below the silo.
     * @return The port below the silo.
     */
    public Port getDownPort() {
        return downPort;
    }

    /**
     * Fetches the port to the left of the silo.
     * @return The port to the left of the silo.
     */
    public Port getLeftPort() {
        return leftPort;
    }

    /**
     * Fetches the port to the right of the silo.
     * @return The port to the right of the silo.
     */
    public Port getRightPort() {
        return rightPort;
    }

    //TODO: Add the interpreter methods.
}
