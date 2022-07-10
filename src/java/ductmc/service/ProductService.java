/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.service;

import ductmc.dto.BaseResponse;
import ductmc.dto.ProductRequest;

/**
 *
 * @author Peter
 */
public interface ProductService {
    BaseResponse getAll(Integer page, Integer size);
    BaseResponse getById(Integer id);
    BaseResponse create(ProductRequest productRequest);
    BaseResponse update(Integer id, ProductRequest productRequest);
    BaseResponse delete(Integer id);
}
