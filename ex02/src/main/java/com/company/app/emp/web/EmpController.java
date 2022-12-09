package com.company.app.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Controller //@Component 컨테이너에 빈 등록, 서블릿이 호출할 수 있도록 커맨드
public class EmpController {
	
	@Autowired EmpService empService;
	//전체조회
	@RequestMapping("empSelectAll")
	public String empSelectAll(Model model, EmpVO vo) {
		model.addAttribute("emps", empService.getEmpAll(vo));
		return "empSelect";
	}
}
