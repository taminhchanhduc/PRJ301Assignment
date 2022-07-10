/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dao.impl;

import ductmc.dao.ProductDAO;
import ductmc.database.DatabaseConfiguration;
import ductmc.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peter
 */
public class ProductDAOImpl implements ProductDAO {
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    private static final String QUERY_PRODUCT_PAGING = "SELECT Id, Name, Image, Description, Price, Quantity FROM Product ORDER BY Id DESC OFFSET (? - 1) * ? ROWS FETCH NEXT ? ROWS ONLY";

    private void close() throws SQLException {
        if (rs != null) rs.close();
        if (pstm != null) pstm.close();
        if (conn != null) conn.close();
    }
    
    @Override
    public List<Product> getProducts(int page, int size) throws Exception {
        try {
            conn = DatabaseConfiguration.getConnection();
            pstm = conn.prepareStatement(QUERY_PRODUCT_PAGING);
            pstm.setInt(1, page);
            pstm.setInt(2, size);
            pstm.setInt(3, size);
            rs = pstm.executeQuery();
            
            List<Product> products = products = new ArrayList<>();
            
            while(rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("Id"));
                p.setName(rs.getString("Name"));
                p.setImage(rs.getString("Image"));
                p.setDescription(rs.getString("Description"));
                p.setPrice(rs.getDouble("Price"));
                p.setQuantity(rs.getDouble("Quantity"));
                
                products.add(p);
            }
            return products;
            
        } finally {
            close();
        }
    }

    @Override
    public Product getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean create(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
