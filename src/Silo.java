public class Silo {

    private int acc;
    private int bak;
    private final int NIL = 0;

    private Port upPort;
    private Port downPort;
    private Port leftPort;
    private Port rightPort;

    public Silo(Port upPort, Port downPort, Port leftPort, Port rightPort) {
        acc = 0;
        bak = 0;
        this.upPort = upPort;
        this.downPort = downPort;
        this.leftPort = leftPort;
        this.rightPort = rightPort;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int  getAcc() {
        return acc;
    }
    public void setBak(int bak) {
        this.bak = bak;
    }

    public int getBak() {
        return bak;
    }
}
