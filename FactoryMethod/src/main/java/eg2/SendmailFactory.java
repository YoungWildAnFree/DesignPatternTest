package eg2;

public class SendmailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSenderImpl();
    }

}
