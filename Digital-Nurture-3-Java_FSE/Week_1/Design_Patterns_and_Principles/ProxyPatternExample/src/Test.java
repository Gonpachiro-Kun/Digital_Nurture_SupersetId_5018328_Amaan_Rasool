public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.png");
        Image image2 = new ProxyImage("photo2.png");
        image1.display();
        image1.display();
        image2.display();
        image2.display();
    }
}
