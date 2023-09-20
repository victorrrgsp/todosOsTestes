package entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    public Employee(){
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // isso vai comparar um funcionario com outro retornando um numero inteiro
    @Override
    public int compareTo(Employee other) {
        // ta comparando um nome pelo outro ou um salario pelo outro
        // na forma decrecente
        return -salary.compareTo(other.getSalary());
    }
}
