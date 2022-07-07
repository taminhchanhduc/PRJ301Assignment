/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.helper;

import ductmc.dto.ProductCart;
import ductmc.model.Product;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Peter
 */
public class CartHelper implements Serializable {
    private Integer userId;
    private HashMap<Integer, ProductCart> cart;
    
    public void addToCart(ProductCart pc) throws Exception {
        if (this.cart.containsKey(pc.getId())) {
            double quota = this.cart.get(pc.getId()).getQuota()+ pc.getQuota();
            pc.setQuota(quota);
        }
        this.cart.put(pc.getId(), pc);
    }
    
    public boolean delete(Integer id) throws Exception {
        if (this.cart.containsKey(id)) {
            this.cart.remove(id);
            return true;
        }
        return false;
    }
    
    public double getTotal() {
        return cart.values().stream().mapToDouble(pc -> pc.getQuota() * pc.getPrice()).sum();
    }
    
    public boolean update(Integer id, double quota) throws Exception {
        if (this.cart.containsKey(id)) {
            this.cart.get(id).setQuota(quota);
            return true;
        }
        return false;
    }
}
