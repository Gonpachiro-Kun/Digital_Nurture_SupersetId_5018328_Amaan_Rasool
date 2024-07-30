public class Test {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Sent with Email Notifier!");
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        smsEmailNotifier.send("Sent with SMS Notifier!");
        Notifier slackEmailNotifier = new SlackNotifierDecorator(emailNotifier);
        slackEmailNotifier.send("Sent with Slack Notifier!");
    }
}
