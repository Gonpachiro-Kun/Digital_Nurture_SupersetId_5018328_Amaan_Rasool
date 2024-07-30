public class Main {
    public static void main(String[] args) {
        EmployeeRecords management = new EmployeeRecords(10);

        management.addEmployee(new Employee(1, "Tony", "CEO", 90000.00));
        management.addEmployee(new Employee(2, "Wade", "Chauffeur", 60000.00));
        management.addEmployee(new Employee(3, "Natasha", "Designer", 50000.00));

        System.out.println("Employees:");
        management.traverseEmployees();

        Employee emp = management.searchEmployee(2);
        if (emp != null) {
            System.out.println("Found employee: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        management.deleteEmployee(3);
        System.out.println("Employees after deletion:");
        management.traverseEmployees();
    }
    
}
