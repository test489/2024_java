package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("Login-Servlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String url = null;
		
		//エンコーディング方式の指定
		request.setCharacterEncoding("UTF-8");
		
		//リクエストパラメータの取得
		String userid = request.getParameter("userid");
		String pass = request.getParameter("pass");
		
		try {
			
			//DAOの生成
			UserDAO userDao = new UserDAO();
			
			//DAOの利用
			if(userDao.login(userid,pass)) {
				//認証成功
				url = "Menu-Servlet";
				
				//セッションオブジェクトの取得
				HttpSession session = request.getSession();
				
				//セッションスコープへの属性の設定
				session.setAttribute("userid", userid);
				
			}else {
				//認証失敗
				url = "login-failure.html";
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		//リクエストの転送
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
