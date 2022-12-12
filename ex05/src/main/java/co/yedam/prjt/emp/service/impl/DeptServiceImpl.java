package co.yedam.prjt.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.yedam.prjt.emp.mapper.DeptMapper;
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired DeptMapper deptMapper;
	
	@Override
	public List<DeptVO> getDeptAll(DeptVO vo) {
		return deptMapper.getDeptAll(vo);
	}

	@Override
	public DeptVO getDept(Integer id) {
		return deptMapper.getDept(id);
	}

	@Override
	public int insertDept(DeptVO vo) {
		return deptMapper.insertDept(vo);
	}

	@Override
	public int updateDept(DeptVO vo) {
		return deptMapper.updateDept(vo);
	}

	@Override
	public int deleteDept(Integer id) {
		return deptMapper.deleteDept(id);
	}

}
