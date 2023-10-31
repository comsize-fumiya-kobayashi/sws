package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeDeleteDAO;

/**
 * Servlet implementation class EmployeeDeleteServlet
 */
@WebServlet("/employee-delete-servlet")
public class EmployeeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDeleteServlet() {
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
		
		/* リクエストのエンコーディング方法の指定です。*/
		request.setCharacterEncoding("UTF-8");
		
		/* インスタンス化して、DAOを生成します。*/
		EmployeeDeleteDAO dao = new EmployeeDeleteDAO();
		
		int processingNumber = 0; 
		
		try {
			processingNumber = dao.deleteEmployee(Integer.parseInt(request.getParameter("employee_code")));
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/* 処理件数をリクエストスコープに設定します。*/
		request.setAttribute("processingNumber", processingNumber);
		/* 削除結果画面に遷移します。*/
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeDeleteResult.jsp");
		rd.forward(request, response);
		
	
	}

}
