package com.company.app.emp;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
	
	List<EmpVO> getEmpAll(EmpVO vo);
	EmpVO getEmp(String id);
	int updateName(EmpVO vo);
	int insertEmp(EmpVO vo);
	int count(EmpVO vo);
	
	@Select("select * from departments")
	public List<Map<String,Object>> getDept();
	public List<Map<String,Object>> getDeptAll();
	
	
}
