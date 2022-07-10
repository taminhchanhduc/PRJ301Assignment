/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.service.impl;

import ductmc.dao.AccountDAO;
import ductmc.dao.impl.AccountDAOImpl;
import ductmc.dto.AccountProfile;
import ductmc.dto.BaseResponse;
import ductmc.dto.LoginRequest;
import ductmc.service.AccountService;

/**
 *
 * @author Duc
 */
public class AccountServiceImpl implements AccountService {
    
    private AccountDAO accountDAO;

    @Override
    public BaseResponse login(LoginRequest loginRequest) throws Exception {
        BaseResponse baseResponse = new BaseResponse();
        accountDAO = new AccountDAOImpl();
        AccountProfile accountProfile = accountDAO.getProfileByUsernameAndPassword(loginRequest);
        if (accountProfile == null) {
            baseResponse.setStatus(-100);
            baseResponse.setMessage("Tai khoan hoac mat khau khong dung");
        } else {
            baseResponse.setStatus(0);
            baseResponse.setMessage("Dang nhap thanh cong");
            baseResponse.setData(accountProfile);
        }
        return baseResponse;
    }
    
}
