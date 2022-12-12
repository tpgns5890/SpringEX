package co.yedam.prjt.emp.service;

import java.util.List;

import co.yedam.prjt.common.Paging;


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
}
