package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n========== TEST 1: Department insert ============");
		Department department = new Department(null,"Logistic");
				
		departmentdao.insert(department);
		
		System.out.println("\n========== TEST 2: Departmet update ============");
		Department dep = departmentdao.findById(1);
		dep.setName("Computers");
		departmentdao.update(dep);
		System.out.println(dep);
		
		
		System.out.println("\n========== TEST 3: Department FindAll ============");
		List<Department> list= departmentdao.findaAll();
		for (Department dep1 : list) {
			System.out.println(dep1);
		}
		
		System.out.println("\n========== TEST 4: Department delete ============");
		departmentdao.deleteById(7);

	}

}
