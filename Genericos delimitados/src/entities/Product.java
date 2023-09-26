package entities;

public class Product implements Comparable<Product> {

    private String produto;
    private Double price;

    public Product(){
    }

    public Product(String produto, Double price) {
        this.produto = produto;
        this.price = price;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f", produto, price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
