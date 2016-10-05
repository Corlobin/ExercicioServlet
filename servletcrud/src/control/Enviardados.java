package control;

import java.io.IOException;
import java.io.PrintWriter;

import model.Pessoa;
import persistence.PessoaDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Enviardados
 */
@WebServlet("/Enviardados")
public class Enviardados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enviardados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		try{

			String cmd = request.getParameter("cmd");
			Pessoa p;
			PessoaDao pd;


		 if(cmd.equalsIgnoreCase("cadastrar"))
		 {
			 p = new Pessoa( request.getParameter("nome"), request.getParameter("email"), new Integer(request.getParameter("idade")));
			 pd = new PessoaDao();
			 pd.create(p);
	
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Gravado</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Gravado com sucesso!</h1>");
			out.println("</body>");
			out.println("</html>");
		 }

		 }catch (Exception e) {

			 out.println("<html>");
			out.println("<head>");
			out.println("<title>Gravado</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Erro: “ + e.getMessage() + “</h1>");
			out.println("</body>");
			out.println("</html>");

		 } 
	}

}
