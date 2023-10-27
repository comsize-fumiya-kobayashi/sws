package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeCategoryDAO;
import model.entity.EmployeeBean;

/**
 * Servlet implementation class EmployeeAddServlet
 */
@WebServlet("/EmployeeAddServlet")
public class EmployeeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeAddServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// リクエストのエンコーディング方式を指定
		request.setCharacterEncoding("UTF-8");

		// DAOのインスタンス化
		EmployeeCategoryDAO dao = new EmployeeCategoryDAO();
		// Beanのインスタンス化
		EmployeeBean employeeInfo = new EmployeeBean();

		// 入力された従業員コード、氏、名、氏（かな）、名（かな）、生年月日、部署コード、入社日をbeanにセット
		employeeInfo.setEmployeeCode(Integer.parseInt(request.getParameter("employee_code")));
		employeeInfo.setLastName(request.getParameter("last_name"));
		employeeInfo.setFirstName(request.getParameter("first_name"));
		employeeInfo.setLastKanaName(request.getParameter("last_kana_name"));
		employeeInfo.setFirstKanaName(request.getParameter("first_kana_name"));
		employeeInfo.setGender(Integer.parseInt(request.getParameter("gender")));
		employeeInfo.setBirthDay(request.getParameter("birth_day"));
		employeeInfo.setSectionCode(request.getParameter("section_code"));
		employeeInfo.setSectionCode(request.getParameter("hire_code"));

		int processingNumber = 0;// 処理件数

		try {
			processingNumber = dao.insertEmployee(employeeInfo);// 登録処理
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "";// 転送先
		// 遷移先画面の分岐
		if (processingNumber > 0) {
			url = "register-success.jsp";// 登録成功画面
		} else {
			url = "register-failure.jsp";// 登録失敗画面
		}
		// 画面遷移
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
