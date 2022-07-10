/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dao;

import ductmc.dto.AccountProfile;
import ductmc.dto.LoginRequest;
import ductmc.dto.RegisterRequest;

/**
 *
 * @author Peter
 */
public interface AccountDAO {
    AccountProfile getProfileByUsernameAndPassword(LoginRequest loginRequest) throws Exception;
    Boolean register(RegisterRequest registerRequest);
}
