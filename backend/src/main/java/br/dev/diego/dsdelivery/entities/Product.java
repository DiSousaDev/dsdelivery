package br.dev.diego.dsdelivery.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imgUri;

    public Product(){
    }

    public Product(Long id, String name, Double price, String description, String imgUri){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgUri = imgUri;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getImgUri(){
        return imgUri;
    }

    public void setImgUri(String imgUri){
        this.imgUri = imgUri;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
