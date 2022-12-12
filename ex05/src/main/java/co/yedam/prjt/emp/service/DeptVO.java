package co.yedam.prjt.emp.service;

import lombok.Data;

@Data
public class DeptVO {
	Integer departmentId;
	String departmentName;
	Integer managerId;
	Integer locationId;
}
