package entities;

public class Product {

    private String names;
    private String email;
    private Double salary;
    
    public Product(String names, String email, Double salary) {
        this.names = names;
        this.email = email;
        this.salary = salary;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Names" + names + ", email: " + email + String.format("%.2f", salary);
    }
}
