package Entities;

public class SavingAccount extends Account{

    private Double interesrRate;

    public SavingAccount (){
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interesrRate) {
        super(number, holder, balance);
        this.interesrRate = interesrRate;
    }

    public Double getInteresrRate() {
        return interesrRate;
    }

    public void setInteresrRate(Double interesrRate) {
        this.interesrRate = interesrRate;
    }

    public void updateBalance(){
        balance += balance * interesrRate;
    }

    // o conpilador vai procurar na super classe esse metodo pra ver se ele existe não
    @Override
    public void withdraw (double amount){
        balance -= amount;
    }
}