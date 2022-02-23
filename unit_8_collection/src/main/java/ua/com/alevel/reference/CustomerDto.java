package ua.com.alevel.reference;

public class CustomerDto {

    private final String fullName;

    public CustomerDto(String fullName) {
        this.fullName = fullName;
    }

    public CustomerDto(Customer customer) {
        this.fullName = customer.firstName() + " " + customer.lastName();
    }

    public CustomerDto(Customer customer, int a) {
        this.fullName = customer.firstName() + " " + customer.lastName();
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
