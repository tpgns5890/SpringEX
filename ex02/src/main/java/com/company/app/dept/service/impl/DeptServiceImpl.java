package com.company.app.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.dept.mapper.DeptMapper;
import com.company.app.dept.service.DeptService;
import com.company.app.dept.service.DeptVO;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired DeptMapper deptMapper;	

	@Override
	public List<DeptVO> getDeptAll(DeptVO vo) {
		return deptMapper.getDeptAll(vo);
	}

	@Override
	public int insertDept(DeptVO vo) {
		return deptMapper.insertDept(vo);
	}
	
	
}
