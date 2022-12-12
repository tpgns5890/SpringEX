package co.yedam.prjt.emp.mapper;

import java.util.List;

import co.yedam.prjt.emp.service.DeptVO;

public interface DeptMapper {
	List<DeptVO> getDeptAll(DeptVO vo);
	DeptVO getDept(Integer id);
	int insertDept(DeptVO vo);
	int updateDept(DeptVO vo);
	int deleteDept(Integer id);
	
}
