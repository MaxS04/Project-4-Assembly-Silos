public interface Operand {
    int read();
    void write();

    public class IntOperand implements Operand{

        @Override
        public int read() {
            return 0;
        }

        @Override
        public void write() {

        }
    }

    public class RegisterOperand implements Operand{

        @Override
        public int read() {
            return 0;
        }

        @Override
        public void write() {

        }
    }

    public class PortOperand implements Operand{

        @Override
        public int read() {
            return 0;
        }

        @Override
        public void write() {

        }
    }
}
