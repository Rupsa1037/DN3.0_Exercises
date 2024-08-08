public class test {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Add a customer
        Customer customer = new Customer(1, "John Doe");
        customerRepository.addCustomer(customer);

        // Use the service to find a customer
        Customer foundCustomer = customerService.findCustomerById(1);
        if (foundCustomer != null) {
            System.out.println("Customer found: " + foundCustomer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
