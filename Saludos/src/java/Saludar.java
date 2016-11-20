
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hola")

public class Saludar extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String nombre = req.getParameter("name");
        
        PrintWriter out= resp.getWriter();
        out.print(nombre + " Bienvenido(a) a Sistemas UNI");
        
    }
    
    
}
