package co.yedam.prjt.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.EmpMapper;
import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;


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
}
