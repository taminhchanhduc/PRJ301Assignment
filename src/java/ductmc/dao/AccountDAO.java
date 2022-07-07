/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dao;

import ductmc.dto.LoginRequest;
import ductmc.dto.RegisterRequest;

/**
 *
 * @author Peter
 */
public interface AccountDAO {
    Boolean login(LoginRequest loginRequest);
    Boolean register(RegisterRequest registerRequest);
}
