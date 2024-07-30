public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message with message: " + message);
    }

    @Override
    public void send(String message) {
        sendSlack(message);
    }
}