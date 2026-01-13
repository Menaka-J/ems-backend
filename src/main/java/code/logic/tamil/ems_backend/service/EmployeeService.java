package code.logic.tamil.ems_backend.service;

import code.logic.tamil.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    //for creation
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    //for retrivel by id
    EmployeeDto getEmployeeByID(Long employeeId);

    //for retrieve all
    List<EmployeeDto> getAllEmployees();

    //for updation
    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
