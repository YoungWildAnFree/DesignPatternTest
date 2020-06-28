package eg2;

public class SendmsgFactory implements Provider {
    @Override
    public Sender produce() {
        return new MsgSenderImpl();
    }
}
