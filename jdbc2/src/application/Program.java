package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try{
			// estar conectando o banco de dados
			conn = DB.getConnection();
			// estar instaciando um objeto do tipo statement
			st = conn.createStatement();
			// o executeQuery ele espera uma String, que no caso vai ser um comando sql
			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("Name"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
