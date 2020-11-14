package fit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;




public class DB {
	Connection con=null;
	public Connection getDbConnection() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","q1234");
			
		}catch(Exception e) {
			
			e.printStackTrace();
	
		}
		return con;
	}
	
	public int addCustomer(Customer customer)  {
		int n=0;
		try {
		Connection con = getDbConnection();
		PreparedStatement ps = con.prepareStatement("insert into "
				+ "investorgurudb1(id,name,mobile,email,password) values(seq.nextval,?,?,?,?)");
		ps.setString(1, customer.getName());
		ps.setLong(2, customer.getMobile());
		ps.setString(3, customer.getEmail());
		ps.setString(4, customer.getPassword());
		
		n = ps.executeUpdate();
		ps.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}
	
	public boolean logincustomer(Customer customer) {
		
		try {
			Connection con = getDbConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from investorgurudb1 where email='"+customer.getEmail()+"' and password='"+customer.getPassword()+"'");
			
			if(rs.next()) {
				return true;
				
			}
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return false;
	}
	public boolean updatepascustomer(Customer customer) {
		
		try {
			Connection con = getDbConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("update investorgurudb1 set password='"+customer.getPassword()+"' where email='"+customer.getEmail()+"'");
			
			if(rs.next()) {
				return true;
				
			}
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return false;
	}
	
	public boolean updateprofcustomer(Customer customer) {
		
		try {
			Connection con = getDbConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("update investorgurudb1 set name='"+customer.getName()+"',mobile='"+customer.getMobile()+"' where email='"+customer.getEmail()+"'");
			
			if(rs.next()) {
				return true;
				
			}
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return false;
	}
	public int addinvestor(Customer customer)  {
		int n=0;
		try {
		Connection con = getDbConnection();
		PreparedStatement ps = con.prepareStatement("insert into "
				+ "investorgurudb(id,name,mobile,email,password) values(seq.nextval,?,?,?,?)");
		ps.setString(1, customer.getName());
		ps.setLong(2, customer.getMobile());
		ps.setString(3, customer.getEmail());
		ps.setString(4, customer.getPassword());
		
		n = ps.executeUpdate();
		ps.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return n;
	}


	public boolean logininvestor(Customer customer) {
		
		try {
			Connection con = getDbConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from investorgurudb where email='"+customer.getEmail()+"' and password='"+customer.getPassword()+"'");
			
			if(rs.next()) {
				return true;
				
			}
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return false;
		
		
	}
		
public boolean updatepasinvestor(Customer customer) {
		
		try {
			Connection con = getDbConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("update investorgurudb set password='"+customer.getPassword()+"' where email='"+customer.getEmail()+"'");
			
			if(rs.next()) {
				return true;
				
			}
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return false;
	}
	
	public boolean updateprofinvestor(Customer customer) {
		
		try {
			Connection con = getDbConnection();
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("update investorgurudb set name='"+customer.getName()+"',mobile='"+customer.getMobile()+"' where email='"+customer.getEmail()+"'");
			
			if(rs.next()) {
				return true;
				
			}
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		return false;
	}
		
		
		
		
	}



