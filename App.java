package cornsimplejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/studentManS";
		String username="root";
		String password="Shailesh@1996";
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *  from student");
		
		while(rs.next()) {
			String Studentdata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4);
			System.out.println(Studentdata);
		}	
		con.close();	
			
		
	}

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}	
	


