/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ductmc.dao.impl;

import ductmc.dao.AccountDAO;
import ductmc.database.DatabaseConfiguration;
import ductmc.dto.AccountProfile;
import ductmc.dto.LoginRequest;
import ductmc.dto.RegisterRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Duc
 */
public class AccountDAOImpl implements AccountDAO {
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    private static final String QUERY_GET_PROFILE = "SELECT Username, Fullname, Role FROM Account WHERE Username = ? AND Password = ?";
    
    private void close() throws SQLException {
        if (rs != null) rs.close();
        if (pstm != null) pstm.close();
        if (conn != null) conn.close();
    }

    @Override
    public AccountProfile getProfileByUsernameAndPassword(LoginRequest loginRequest) throws Exception {
        try {
            conn = DatabaseConfiguration.getConnection();
            pstm = conn.prepareStatement(QUERY_GET_PROFILE);
            pstm.setString(1, loginRequest.getUsername());
            pstm.setString(2, loginRequest.getPassword());
            rs = pstm.executeQuery();
            if (rs.next()) {
                String username = rs.getString("Username");
                String fullname = rs.getString("Fullname");
                Integer role = rs.getInt("Role");
                
                return new AccountProfile(username, fullname, role);
            }
        } finally {
            close();
        }
        return null;
    }

    @Override
    public Boolean register(RegisterRequest registerRequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
