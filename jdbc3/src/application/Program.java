package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DB.getConnection();
			/* 
			ps = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) "
				+ "VALUES (?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, "Carl Purple");
			ps.setString(2, "carl@gmail.com");
			// estar instaciando uma data para o jdbc
			ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			ps.setDouble(4, 2000.0);
			ps.setInt(5, 2);
			*/

			// vai alocar mas dois departamentos
			ps =  conn.prepareStatement("insert into department (Name) values ('D1'),('D2')", 
				Statement.RETURN_GENERATED_KEYS);

			// vai ver quantas linhas foram alteradas
			int rowsAffected = ps.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);

			if (rowsAffected > 0) {
				// a funcao getGeneratedKeys retorna um objeto tipo resultSet
				ResultSet rs = ps.getGeneratedKeys();
				while (rs.next()) {
					// ta pegando o id do novo vendedor 
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			} else {
				System.out.println("No rows affected!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}
}
