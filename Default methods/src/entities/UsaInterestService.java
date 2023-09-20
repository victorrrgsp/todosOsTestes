package entities;

public class UsaInterestService implements InterestService{

    private Double interestRate;

    public UsaInterestService(){
    }

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }
}
