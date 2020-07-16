package eg1;

public class CopyCommand implements Command {
    private TextEditor receiver;

    public CopyCommand(TextEditor receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.copy();
    }
}
