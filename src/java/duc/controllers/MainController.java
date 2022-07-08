/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duc.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Duc
 */
public class MainController extends HttpServlet {

    private final String ERROR = "error.jsp";
    private final String LOGIN = "LoginController";
    private final String SEARCH = "SearchController";
    private final String ADDTOCART = "AddToCartController";
    private final String REGISTER = "RegisterController";
    private final String CHECKOUT = "CheckoutController";
    private final String UPDATECART = "UpdateCartController";
    private final String CREATEKEYCAP = "CreateKeyCapController";
    private final String UPDATEKEYCAP = "UpdateKeyCapController";
    private final String SHOP = "ShopController";
    private final String LOGOUT = "LogoutController";
    private final String CHECKDISCOUNT = "CheckDiscountController";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("btnAction");
            if(action.equals("Login"))
            {
                url = LOGIN;
            }
            else if(action.equals("Search"))
            {
                url = SEARCH;
            }
            else if(action.equals("Register"))
            {
                url = REGISTER;
            }
            else if(action.equals("AddToCart"))
            {
                url = ADDTOCART;
            }
            else if(action.equals("UpdateCart"))
            {
                url = UPDATECART;
            }
            else if(action.equals("CreateKeyCap"))
            {
                url = CREATEKEYCAP;
            }
            else if(action.equals("UpdateKeyCap"))
            {
                url = UPDATEKEYCAP;
            }
            else if(action.equals("Logout"))
            {
                url = LOGOUT;
            }
            else if(action.equals("Checkout"))
            {
                url = CHECKOUT;
            }
            else if(action.equals("Shop"))
            {
                url = SHOP;
            }else if(action.equals("CheckDiscount"))
            {
                url = CHECKDISCOUNT;
            }
        } catch (Exception e) {
            log("Error at MainController :" + e.toString());
        }
        finally
        {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
