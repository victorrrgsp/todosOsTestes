package Entites;

public class PessoaJ extends Pessoa{

    private Integer nFuncionarios;

    public PessoaJ (){
        super();
    }

    public PessoaJ(String name, Double rendaAnul, Integer nFuncionarios) {
        super(name, rendaAnul);
        this.nFuncionarios = nFuncionarios;
    }

    public Integer getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(Integer nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    @Override
    public double imposto(){
        double som = 0.0;
        if (getnFuncionarios() >= 10){
            som += getRendaAnul() * 0.16;
        }else {
            som += getRendaAnul() * 0.14;
        }
        return som;
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), imposto());
    }
}
