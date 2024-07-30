import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Bottle", "Stationary"),
                new Product("2", "Keyboard", "Electronics"),
                new Product("3", "Bag", "Apparel"),
                new Product("4", "Ring", "Accessories")
        };

        System.out.println("Linear Search:");
        Product foundProduct = Search.linearSearch(products, "2");
        System.out.println(foundProduct);

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        System.out.println("Binary Search:");
        foundProduct = Search.binarySearch(products, "4");
        System.out.println(foundProduct);
    }
}