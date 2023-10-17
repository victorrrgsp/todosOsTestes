package model.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.Dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{

	private Connection conn;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "INSERT INTO department "
                + "(Name) "
                + "VALUES (?)");
            
            st.setString(1, obj.getName());

            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
        }
    }
	@Override
	public void update(Department obj) {
		PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "UPDATE department "
                + "SET Name = ? "
                + "WHERE Id = ?");
            
            st.setString(1, obj.getName());
			st.setInt(2, obj.getId());

            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
        }
    }

	@Override
	public void daleteById(Integer id) {
		PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                "delete from department where Id = ?");

            st.setInt(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
        }
    }

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                "select * "
                + "from department "
                + "where Id = ?");
            
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department dep = new Department();
				dep.setId(rs.getInt("Id"));
				dep.setName(rs.getString("Name"));
                return dep;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

	@Override
	public List<Department> findAll() {
		PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                "select * from department "
                + "order by name");
            
            rs = st.executeQuery();

            List<Department> list = new ArrayList<>();

			while (rs.next()) {
                
                Department department = new Department();
				department.setId(rs.getInt("Id"));
				department.setName(rs.getString("Name"));
                list.add(department);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
