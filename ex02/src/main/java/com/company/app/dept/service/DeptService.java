package com.company.app.dept.service;

import java.util.List;

public interface DeptService {
	//��ü��ȸ
	List<DeptVO> getDeptAll(DeptVO vo);
	
	//�μ����
	int insertDept(DeptVO vo);
}
