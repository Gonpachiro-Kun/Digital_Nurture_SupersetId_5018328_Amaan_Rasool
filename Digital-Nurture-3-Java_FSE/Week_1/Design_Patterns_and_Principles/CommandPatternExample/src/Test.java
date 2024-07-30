public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightonCommand = new LightOnCommand(light);
        LightOffCommand lightoffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightonCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(lightoffCommand);
        remoteControl.pressButton();
    }
}