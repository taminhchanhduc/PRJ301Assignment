/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dao;

import ductmc.model.Product;
import java.util.List;

/**
 *
 * @author Peter
 */
public interface ProductDAO {
    List<Product> getProducts(int page, int size);
    Product getById(Integer id);
    Boolean create(Product product);
    Boolean updateById(Integer id);
    Boolean deleteById(Integer id);
}
