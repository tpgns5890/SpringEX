package com.company.app.dept.mapper;

import java.util.List;

import com.company.app.dept.service.DeptVO;

public interface DeptMapper {
	List<DeptVO> getDeptAll(DeptVO vo);
	int insertDept(DeptVO vo);
}
