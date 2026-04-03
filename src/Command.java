import java.security.PublicKey;

public interface Command {
    public void execute(Silo silo);

    public class Noop implements Command{
        @Override
        public void execute(Silo silo) {

        }
    }

    public class Move implements Command{
        private final Operand src;
        private final Operand dst;

        public Move(Operand src, Operand dst){
            this.src = src;
            this.dst = dst;
        }

        @Override
        public void execute(Silo silo) {

        }
    };

    public class Swap implements Command{

        @Override
        public void execute(Silo silo) {

        }
    }

    public class Save implements Command{

        @Override
        public void execute(Silo silo) {

        }
    }



    public class Add implements Command{
        private final Operand src;

        public Add(Operand src){
            this.src = src;
        }

        @Override
        public void execute(Silo silo) {
            silo.setAcc(silo.getAcc() + src.read());
        }
    }

    public class Sub implements Command{
        private final Operand src;

        public Sub(Operand src){
            this.src = src;
        }

        @Override
        public void execute(Silo silo) {
            silo.setAcc(silo.getAcc() - src.read());
        }
    }

    public class Negate implements Command{
        @Override
        public void execute(Silo silo) {
            silo.setAcc(-silo.getAcc());
        }
    }

    public class Jump implements Command{
        private final String label;

        public Jump(String label){
            this.label = label;
        }
        @Override
        public void execute(Silo silo) {

        }
    }

    public class JEZ implements Command{
        private final String label;

        public JEZ(String label){
            this.label = label;
        }
        @Override
        public void execute(Silo silo) {

        }
    }

    public class JNZ implements Command{
        private final String label;

        public JNZ(String label){
            this.label = label;
        }
        @Override
        public void execute(Silo silo) {

        }
    }

    public class JGZ implements Command{
        private final String label;

        public JGZ(String label){
            this.label = label;
        }
        @Override
        public void execute(Silo silo) {

        }
    }

    public class JLZ implements Command{
        private final String label;

        public JLZ(String label){
            this.label = label;
        }
        @Override
        public void execute(Silo silo) {

        }
    }

    public class JRO implements Command{
        private final Operand src;

        public JRO(Operand src){
            this.src = src;
        }
        @Override
        public void execute(Silo silo) {

        }
    }

    public class Sleep implements Command{
        private final int time;

        public Sleep(int time){
            this.time = time;
        }

        @Override
        public void execute(Silo silo) {

        }
    }


}
