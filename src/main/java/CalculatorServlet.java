import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    float first = Float.parseFloat(request.getParameter("first"));
    float second = Float.parseFloat(request.getParameter("second"));
    String operator = request.getParameter("operator");
    Calculator calculator = new Calculator();
    float cal = calculator.Calculator(first,second,operator);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Dap an:" + cal + "</h1>" );
        writer.println("</html>");
    }
}
