package entities;

public class Product {
    
    private String name;
    private Double pUni;
    private Integer quantity;

    public Product (){
    }

    public Product(String name, Double pUni, Integer quantity) {
        this.name = name;
        this.pUni = pUni;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getpUni() {
        return pUni;
    }

    public void setpUni(Double pUni) {
        this.pUni = pUni;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double valorTotal (){
        return pUni * (double) quantity;
    }
}
