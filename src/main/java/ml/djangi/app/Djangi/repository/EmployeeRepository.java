package ml.djangi.app.Djangi.repository;

import ml.djangi.app.Djangi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
