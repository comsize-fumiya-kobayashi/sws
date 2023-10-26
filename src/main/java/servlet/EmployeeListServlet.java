package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeListDAO;
import model.entity.EmployeeListBean;

/**
 * Servlet implementation class EmployeeListServlet
 */
@WebServlet("/employee-list-servlet")
public class EmployeeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	/* 従業員リストの表示は、こちらのdoPOSTメソッドで行います。*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/* エンコーディングでUTF-8を指定して、文字化けを防ぎます。*/
		request.setCharacterEncoding("UTF-8");

		/* インスタンス化して、EmployeeListDAOを生成します。*/
		EmployeeListDAO dao = new EmployeeListDAO ();
		
		/* EmployeeListDAOでthrowされた例外を、EmployeeListServletでcatchします。*/
		try {
			/* EmployeeListDAOを使用します。*/
			List <EmployeeListBean> employeeList = dao.selectEmployee();
			
			/*リクエストスコープをセットします。*/
			request.setAttribute("employeeList", employeeList);
			
		} catch (ClassNotFoundException | SQLException  e) {
			e.printStackTrace();
		}
		/* 最後にリクエストのjspへの転送を行います。*/
		/* これにより、従業員情報一覧画面はEmployeelistServletのフォワードになります。*/
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeList.jsp");
		rd.forward(request, response);
		
	}

}
