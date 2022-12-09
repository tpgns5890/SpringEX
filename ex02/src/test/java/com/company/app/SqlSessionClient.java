package com.company.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SqlSessionClient {

	@Autowired SqlSession mybatis;
	@Autowired EmpMapper mapper;
	
	@Test
	public void getEmpAll() {
		EmpVO vo = new EmpVO();
		//vo.setDepartmentId("90");
		//vo.setFirstName("e");
		vo.setEmployeeIds(Arrays.asList("100", "101", "102"));
		List<EmpVO> list = mapper.getEmpAll(vo);
		if(list != null)
			list.forEach(emp -> System.out.println(emp.getFirstName()));
		
	}
	
	//@Test
	public void insertEmp() {
		EmpVO vo = new EmpVO();
		//vo.setFirstName("홍길동");
		vo.setLastName("홍");
		vo.setEmail("a@aaa.b");
		vo.setHireDate("2022/12/08");
		vo.setJobId("IT_PROG");
		int result = mapper.insertEmp(vo);
		System.out.println(result + " 건이 등록됨");
	}
	
	//@Test
	public void getDept() {
		//System.out.println(mapper.getDept().get("DEPARTMENT_NAME"));
		List<Map<String, Object>> list = mapper.getDeptAll();
		list.forEach(dept -> System.out.println(dept.get("departmentName")));
		//부서명만 모두 출력
	}
	
	//@Test
	public void update() {
		EmpVO vo = new EmpVO();
		vo.setFirstName("Steven");
		vo.setEmployeeId("100");
		mapper.updateName(vo);

	}
	
	//@Test
	public void mapperSelect() {
		EmpVO vo = mapper.getEmp("100");
		System.out.println("======" + vo);
	}
	
	//@Test
	public void select() {
		EmpVO vo = (EmpVO) mybatis.selectOne("com.company.app.emp.EmpMapper.getEmp","100");
		System.out.println(vo);
	}
}
