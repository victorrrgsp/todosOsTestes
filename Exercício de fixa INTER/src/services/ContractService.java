package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++){
            // vai ser a data original mais um mês
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double quota = basicQuota + onlinePaymentService.interest(basicQuota, i) 
                + onlinePaymentService.paymentFee(basicQuota + onlinePaymentService.interest(basicQuota, i));

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
