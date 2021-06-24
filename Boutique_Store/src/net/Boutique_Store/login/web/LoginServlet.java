package net.Boutique_Store.login.web;


import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.Boutique_Store.login.bean.LoginBean;
import net.Boutique_Store.login.database.LoginDao;

/**
 * @author Thinkpad
 */
  
@WebServlet("/login")  
public class LoginServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
          
    String email_id=request.getParameter("email_id");  
    String password=request.getParameter("password");
    LoginBean loginBean = new LoginBean();
    loginBean.setemail_id(email_id);
    loginBean.setPassword(password);
    
    try {
    	if(LoginDao.validate(loginBean)){  
            response.sendRedirect("loginsuccess.html");
        }  
        else{  
            response.sendRedirect("Home.html");
        }  
    }catch(ClassNotFoundException e) {
    	e.printStackTrace();
    	}
    }  
}
