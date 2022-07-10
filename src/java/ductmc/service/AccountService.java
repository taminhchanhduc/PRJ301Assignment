/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.service;

import ductmc.dto.BaseResponse;
import ductmc.dto.LoginRequest;

/**
 *
 * @author Peter
 */
public interface AccountService {
    BaseResponse login(LoginRequest loginRequest) throws Exception;
}
