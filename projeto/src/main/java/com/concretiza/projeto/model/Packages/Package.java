package com.concretiza.projeto.model.Packages;

import com.concretiza.projeto.model.Products.Product;
import org.springframework.data.annotation.Id;
import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Calendar;

@Entity
@Table(name = "TB_PACKAGES")
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private ArrayList<Product> products;
    private float totalPrice;
    private float totalWeight;
    private LocalGregorianCalendar.Date deliveryDate;
    private boolean delivered;
    private ArrayList<String> tags;
    private LocalGregorianCalendar.Date creationDate;

    public Package(ArrayList<Product> products, float totalPrice,
                   float totalWeight, LocalGregorianCalendar.Date deliveryDate,
                   boolean delivered, ArrayList<String> tags, LocalGregorianCalendar.Date creationDate) {
        this.products = products;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
        this.deliveryDate = deliveryDate;
        this.delivered = delivered;
        this.tags = tags;
        this.creationDate = creationDate;
    }


    //getters and setters

    public String getId() {
        return id;
    }

    public LocalGregorianCalendar.Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalGregorianCalendar.Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalGregorianCalendar.Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalGregorianCalendar.Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
    }


    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
