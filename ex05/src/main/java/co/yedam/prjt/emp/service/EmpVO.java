package co.yedam.prjt.emp.service;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	String email;
	@JsonFormat(pattern="MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date hireDate;
	String jobId;
	String departmentId;
	String salary;
	
	List<String> employeeIds;
	
	Integer first = 1;
	Integer last = 10;
}
