package com.company.app.emp.service;

import java.util.List;

public interface EmpService {
	//��ü��ȸ
	List<EmpVO> getEmpAll(EmpVO vo);
	
	//�ܰ���ȸ
	EmpVO getEmp(String id);
	
	//���
	int insertEmp(EmpVO vo);
	
	//����
	int updateName(EmpVO vo);
	
	//����
	int deleteEmp(String id);
}
