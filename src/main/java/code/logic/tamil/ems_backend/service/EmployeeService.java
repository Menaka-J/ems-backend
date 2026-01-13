package code.logic.tamil.ems_backend.service;

import code.logic.tamil.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    //for creation
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    //for retrivel
    EmployeeDto getEmployeeByID(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
