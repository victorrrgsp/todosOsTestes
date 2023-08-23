package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.enums.WorkerLevel;

public class Worker {

	private String workerName;
    private WorkerLevel level;
    private Double baseSalary;
  
    private Department department;
    private List<HourContracts> contracts = new ArrayList<>();
    
    public Worker() {
    }
    
    public Worker(String workerName, WorkerLevel level, Double baseSalary, Department department) {
        this.workerName = workerName;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContracts> getHourContracts() {
        return contracts;
    }

    public void addContract(HourContracts contract){
        contracts.add(contract);
    }

    public void removeContract(HourContracts contract){
        contracts.remove(contract);
    }
	
    public double income (int year, int month){
        double som = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContracts c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                som += c.totalValue();
            }
        }
        return som;
    }
}
