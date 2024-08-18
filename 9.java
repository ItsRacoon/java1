import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
public class Employee extends HttpServlet 
{ 
 public void doGet(HttpServletRequest request, HttpServletResponse response) 
 throws ServletException, IOException 
 { 
 String JDBC_DRIVER = "com.mysql.jc.jdbc.Driver"; 
 String DB_URL="jdbc:mysql://localhost/ise";
 String USER = "root";
 String PASS = "system";
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 String title = "Database Result";
 String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
 out.println(docType + 
 "<html>\n" + 
 "<head><title>" + title + "</title></head>\n" + 
 "<body bgcolor = \"#f0f0f0\">\n" + 
 "<h1 align = \"center\">" + title + "</h1>\n");
 try 
 { 
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection(DB_URL, USER,PASS);
 Statement stmt = conn.createStatement();
 String sql;
 sql = "SELECT * from emp";
 ResultSet rs = stmt.executeQuery(sql);
 out.println("<table border=1>");
 out.println("<tr><th>ID</th><th>Name</th><th>Age</th></tr>");
 while(rs.next())
 {
 int id = rs.getInt(1);
 String name = rs.getString(2);
 String age = rs.getString(3);
 out.println(
 "<tr><td>"+id+"</td><td>"+name+"</td><td>"+age+
"</td></tr>");
 out.println("<br>");
 }
 out.println("</body></html>");
 rs.close();
 stmt.close();
 conn.close();
 }
 catch(SQLException se)
 {
 out.println(se);
 se.printStackTrace(); 
 }
 catch(Exception e)
 {
 e.printStackTrace();
 out.println(e);
 }
 }
}
