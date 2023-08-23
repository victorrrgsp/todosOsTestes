package Entities;



import java.util.Date;

import Entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order (){
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getSattus() {
        return status;
    }

    public void setSattus(OrderStatus sattus) {
        this.status = sattus;
    }

    @Override
    public String toString() {
        return "Order " 
        + id 
        + ", moment " 
        + moment 
        + ", status " 
        + status ;
    }
}
