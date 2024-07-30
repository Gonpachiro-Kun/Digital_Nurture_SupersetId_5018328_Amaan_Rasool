public class RealImage implements Image {
    private String name;
    public RealImage(String name) {
        this.name = name;
        remoteServer();
    }

    private void remoteServer() {
        System.out.println("Loading " + name + " from the remote server...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name + " has been loaded from the remote server.");
    }

    @Override
    public void display() {
        System.out.println("\nDisplaying " + name);
    }
}