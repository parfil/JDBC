package cornsimplejava;

import java.sql.*;
import java.util.*;

public class addusermobile {

	public static void main(String[] args)throws Exception  {
	      Scanner scan=new Scanner(System.in);
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      String url="jdbc:mysql://localhost:3306/Lenovo";
	      String username="root";
	      String password="Shailesh@1996";
	      Connection bs=DriverManager.getConnection(url,username,password);
	      
	      System.out.println("************Add Your Mobile to DB************");
	      System.out.println("Enter Mobile Id");
	      int mid=scan.nextInt();
	      scan.nextLine();
	      String maname=scan .nextLine();
	      System.out.println("Enter Mobile Price");
	      int mprice=scan.nextInt();
	      
	      String query="insert into mobile values( ?,?,?)";
	      
	      PreparedStatement pst=bs.prepareStatement(query);
	      pst.setInt(1, mid);
	      pst.setString(2,maname);
	      pst.setInt(3,mprice);
	      
	      int count=pst.executeUpdate();
	      System.out.println(count+" row(s) effectsc");
	      bs.close();
	      scan.close();
	}      
	      
	}

