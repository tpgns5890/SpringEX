package co.yedam.prjt.emp.service;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date hireDate;
	String jobId;
	String departmentId;
	String salary;
	
	List<String> employeeIds;
	
	Integer first = 1;
	Integer last = 10;
}
