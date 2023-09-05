package Entites;

public abstract class Pessoa {

    private String name;
    private Double rendaAnul;

    public Pessoa (){
    }

    public Pessoa(String name, Double rendaAnul) {
        this.name = name;
        this.rendaAnul = rendaAnul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnul() {
        return rendaAnul;
    }

    public void setRendaAnul(Double rendaAnul) {
        this.rendaAnul = rendaAnul;
    }

    public abstract String toString();

    public abstract double imposto();
}
