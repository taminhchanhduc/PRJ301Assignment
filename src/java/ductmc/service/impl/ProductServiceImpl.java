/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.service.impl;

import ductmc.constant.Status;
import ductmc.dao.ProductDAO;
import ductmc.dao.impl.ProductDAOImpl;
import ductmc.dto.BaseResponse;
import ductmc.dto.ProductRequest;
import ductmc.model.Product;
import ductmc.service.ProductService;
import java.util.List;

/**
 *
 * @author Duc
 */
public class ProductServiceImpl implements ProductService {
    
    
    private ProductDAO productDAO;

    @Override
    public BaseResponse getAll(Integer page, Integer size) throws Exception {
        productDAO = new ProductDAOImpl();
        BaseResponse baseResponse = new BaseResponse();
        
        List<Product> products = productDAO.getProducts(page, size);
        
        if (products.isEmpty()) {
            baseResponse.setStatus(-100);
            baseResponse.setMessage("Danh sách cần tìm trống");
        } else {
            baseResponse.setStatus(Status.SUCCESS);
            baseResponse.setMessage("Thành công");
            baseResponse.setData(products);
        }
        
        return baseResponse;
    }

    @Override
    public BaseResponse getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BaseResponse create(ProductRequest productRequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BaseResponse update(Integer id, ProductRequest productRequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BaseResponse delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
