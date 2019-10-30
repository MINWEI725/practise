package cn.yk.li;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String code = request.getParameter("checkCode");

        String sessionCode = request.getSession().getAttribute("code").toString();
        if (code != null && !"".equals(code) && sessionCode != null && !"".equals(sessionCode)) {
            //先判断验证码是否正确
            if (code.equalsIgnoreCase(sessionCode)) {//忽略大小写比较
                //判断用户名密码
                  //正确
                        //重定向
                            //response.sendRedirect(request.getContextPath()+"");
                  //错误
                        //转发到登陆页面
                            //request.getRequestDispatcher("/").forward(request,response);
                response.getWriter().println("验证通过！");
            } else {
                request.setAttribute("fcode","验证码错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        } else {
            request.setAttribute("fcode","请输入验证码");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
