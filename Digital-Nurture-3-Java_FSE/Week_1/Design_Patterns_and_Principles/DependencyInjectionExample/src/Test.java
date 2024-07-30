public class Test {
    public static void main(String[] args) {

        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        Customer customer = customerService.findCustomerById("01");
        if (customer != null) {
            System.out.println("Customer found: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
    
}
