package entities;

public class Product implements Comparable<Product> {

	private String name;
    private Double price;

    public Product(){
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // AGORA OS DOIS PRODUTOS SERAM COMPARADOS POR CONTEUDO COM BASE NO NAME E O PRICE
    // TANTO NO EQUALS E TANTO NO HASHCODE

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }

    @Override
    public int compareTo(Product other) {
        /* vai retonar o name do product que eu estou, 
        * onde usa o toUpperCase para converter para letra maiuscula,
        * entao assim eutou comparando o name desse product com outro product
        */ 

        return name.toUpperCase().compareTo(other.getName());
    }
}
