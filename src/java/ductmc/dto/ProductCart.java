/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dto;

import ductmc.model.Product;
import java.util.Date;

/**
 *
 * @author Peter
 */
public class ProductCart extends Product {
    private Double quota;

    public ProductCart() {
    }

    public ProductCart(Integer id, String name, String description, Double quantity, Double price, Double quota, Date createdAt, Date updatedAt) {
        super(id, name, description, price, quantity, createdAt, updatedAt);
        this.quota = quota;
    }

    public Double getQuota() {
        return quota;
    }

    public void setQuota(Double quota) {
        this.quota = quota;
    }
}
