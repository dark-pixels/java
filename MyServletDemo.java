import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.applet.*;

public class MyServletDemo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        Map<String, String[]> paramMap = req.getParameterMap();
        for (Map.Entry<String, String[]> entry : paramMap.entrySet()) {
            out.print(entry.getKey() + "=");
            out.println(Arrays.toString(entry.getValue()));
            out.println(" ");
        }
        out.close();
    }
} 