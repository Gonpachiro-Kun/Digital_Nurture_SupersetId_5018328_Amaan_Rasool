public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Tony", 900.00),
            new Order("2", "Banner", 500.00),
            new Order("3", "Natasha", 450.00),
            new Order("4", "Wade", 200.20)
        };

        System.out.println("Bubble Sort:");
        Sort.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[]{
            new Order("1", "Tony", 900.00),
            new Order("2", "Banner", 500.00),
            new Order("3", "Natasha", 450.00),
            new Order("4", "Wade", 200.20)
        };

        System.out.println("Quick Sort:");
        Sort.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}