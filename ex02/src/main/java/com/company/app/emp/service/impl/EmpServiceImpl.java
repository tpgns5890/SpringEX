package com.company.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Service //빈등록, 트랜잭션 처리
public class EmpServiceImpl implements EmpService{

	@Autowired EmpMapper empMapper;
	
	@Override
	public List<EmpVO> getEmpAll(EmpVO vo) {
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
		//100삭제 -> manager(참조)
		//매니저인지 확인
		if(empMapper.getManagerCheck(id)==0) {
			//아니면 삭제
			int result = empMapper.deleteEmp(id);
			return result;
		}
		return 0;
	}
}
