/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dao;

import ductmc.model.Order;
import java.util.List;

/**
 *
 * @author Peter
 */
public interface OrderDAO {
    List<Order> getByUserId(String userId, Integer page, Integer size);
    Order getById(String id);
    Boolean create(Order order);
}
