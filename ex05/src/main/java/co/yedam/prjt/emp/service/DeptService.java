package co.yedam.prjt.emp.service;

import java.util.List;

public interface DeptService {
	//전체조회
	List<DeptVO> getDeptAll(DeptVO vo);
	
	//단건조회
	DeptVO getDept(Integer id);
	
	//등록
	int insertDept(DeptVO vo);
	
	//수정
	int updateDept(DeptVO vo);
	
	//삭제
	int deleteDept(Integer id);
}
