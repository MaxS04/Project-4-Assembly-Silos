public interface Command {
    public void execute();

    public class Move implements Command{
        private final Operand src;
        private final Operand dst;

        public Move(Operand src, Operand dst){
            this.src = src;
            this.dst = dst;
        }

        @Override
        public void execute() {

        }
    };

    public class Add implements Command{
        private final Operand src;

        public Add(Operand src){
            this.src = src;
        }

        @Override
        public void execute() {

        }
    }


}
