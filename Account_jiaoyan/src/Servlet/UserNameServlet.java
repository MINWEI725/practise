package Servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserNameServlet")
public class UserNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String userName = request.getParameter("username");
        Information information = new Information();
        if ("zhangsan".equals(userName)){
            information.setResult(true);
            information.setMsg("对不起，该用户名已经被注册");
        }else{
            information.setResult(false);
            information.setMsg("用户名可用");
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String data = objectMapper.writeValueAsString(information);
        //向前台返回值
        PrintWriter writer = response.getWriter();
        writer.println(data);
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
