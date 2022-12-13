package com.company.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.app.common.Paging;
import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Service //����, Ʈ����� ó��
public class EmpServiceImpl implements EmpService{

	@Autowired EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpAll(EmpVO vo, Paging paging) {
		paging.setTotalRecord(empMapper.count(vo)); //start, end
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return empMapper.getEmpAll(vo);
	}

	@Override
	public EmpVO getEmp(String id) {
		// TODO Auto-generated method stub
		return empMapper.getEmp(id);
	}

	@Override
	public int insertEmp(EmpVO vo) {
		// TODO Auto-generated method stub
		return empMapper.insertEmp(vo);
	}

	@Override
	public int updateName(EmpVO vo) {
		return empMapper.updateName(vo);
	}

	@Override
	public int deleteEmp(String id) {
		//100���� -> manager(����)
		//�Ŵ������� Ȯ��
		if(empMapper.getManagerCheck(id)==0) {
			//�ƴϸ� ����
			int result = empMapper.deleteEmp(id);
			return result;
		}
		return 0;
	}

	@Override
	@Transactional
	public int addData(String data) {
		empMapper.insertCol1(data);
		empMapper.insertCol2(data);
		return 0;
	}
}
