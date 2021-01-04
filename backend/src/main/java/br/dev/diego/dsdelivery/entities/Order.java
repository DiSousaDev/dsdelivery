package br.dev.diego.dsdelivery.entities;

import br.dev.diego.dsdelivery.entities.enums.Status;

import java.time.Instant;
import java.util.Objects;

public class Order {

    private Long id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private Status orderStatus;

    public Order(){
    }

    public Order(Long id, String address, Double latitude, Double longitude, Instant moment, Status orderStatus){
        this.id = id;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Double getLatitude(){
        return latitude;
    }

    public void setLatitude(Double latitude){
        this.latitude = latitude;
    }

    public Double getLongitude(){
        return longitude;
    }

    public void setLongitude(Double longitude){
        this.longitude = longitude;
    }

    public Instant getMoment(){
        return moment;
    }

    public void setMoment(Instant moment){
        this.moment = moment;
    }

    public Status getOrderStatus(){
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus){
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
