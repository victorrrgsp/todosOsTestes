package entities;

public class Product {

    private String namePro;
    private Double Price;

    public Product(){
    }

    public Product(String namePro, Double price) {
        this.namePro = namePro;
        Price = price;
    }

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((namePro == null) ? 0 : namePro.hashCode());
        result = prime * result + ((Price == null) ? 0 : Price.hashCode());
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
        if (namePro == null) {
            if (other.namePro != null)
                return false;
        } else if (!namePro.equals(other.namePro))
            return false;
        if (Price == null) {
            if (other.Price != null)
                return false;
        } else if (!Price.equals(other.Price))
            return false;
        return true;
    }

    
}
