public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifierDecorater;

    public NotifierDecorator(Notifier notifier) {
        this.notifierDecorater = notifier;
    }

    @Override
    public void send(String message) {
        notifierDecorater.send(message);
    }
}
