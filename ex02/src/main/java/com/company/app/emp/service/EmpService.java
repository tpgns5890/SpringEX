package com.company.app.emp.service;

import java.util.List;

import com.company.app.common.Paging;

public interface EmpService {
	//��ü��ȸ
	List<EmpVO> getEmpAll(EmpVO vo, Paging paging);
	
	//�ܰ���ȸ
	EmpVO getEmp(String id);
	
	//���
	int insertEmp(EmpVO vo);
	
	//����
	int updateName(EmpVO vo);
	
	//����
	int deleteEmp(String id);
	
	int addData(String data);
	
	
}
