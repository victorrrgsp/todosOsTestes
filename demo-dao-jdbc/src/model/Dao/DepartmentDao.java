package model.Dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void daleteById(Integer id);
    Department findById(Integer id);
    // vai listar todos os departamentos
    List<Department> findAll();
}
