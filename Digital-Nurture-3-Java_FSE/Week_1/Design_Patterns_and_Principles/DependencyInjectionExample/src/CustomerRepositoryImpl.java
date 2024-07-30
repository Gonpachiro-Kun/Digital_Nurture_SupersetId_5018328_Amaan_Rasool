import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {

        customers.put("01", new Customer("01", "Wade Wilson"));
        customers.put("02", new Customer("02", "Tony Stark"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
