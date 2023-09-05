package Entites;

public class PessoaF extends Pessoa{

    private Double gSaude;

    public PessoaF (){
    }

    public PessoaF(String name, Double rendaAnul, Double gSaude) {
        super(name, rendaAnul);
        this.gSaude = gSaude;
    }

    public PessoaF(Double gSaude) {
        this.gSaude = gSaude;
    }


    public Double getgSaude() {
        return gSaude;
    }

    public void setgSaude(Double gSaude) {
        this.gSaude = gSaude;
    }

    @Override
    public double imposto (){
        double som = 0.0;
        if (getRendaAnul() >= 20000.00){
            som += getRendaAnul() * 0.25;
        }else {
            som += getRendaAnul() * 0.15;
        }

        som -= getgSaude() * 0.5;
        return som;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), imposto());
    }
}
