public class Test {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("01", "Bag", 10, 784.00);
        Product product2 = new Product("02", "Bottle", 15, 600.00);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println("Inventory after adding products:");
        inventory.displayProducts();

        product1.setPrice(900.00);
        inventory.updateProduct(product1);

        System.out.println("Inventory after updating a product:");
        inventory.displayProducts();

        inventory.deleteProduct("02");

        System.out.println("Inventory after deleting a product:");
        inventory.displayProducts();
    }   
}
