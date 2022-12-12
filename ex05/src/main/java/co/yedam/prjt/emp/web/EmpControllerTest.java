package co.yedam.prjt.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.UserListVO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/test")
@Log4j
public class EmpControllerTest {
	
	@Autowired EmpService empService;
	
	@RequestMapping("/params")
	public String params(@RequestParam List<String> employeeIds) {
		return "home";
	}
	@RequestMapping("/insertListPage")
	public String insertListPage() {
		return "empInsertList";
	}
	
	//등록
	//@RequestMapping(path="/insertList", method = { RequestMethod.GET, RequestMethod.POST})	//	/emp/insert
	@PostMapping
	public String insertList(UserListVO vo) {	//커맨드 객체
		log.info(vo);
		return "home";
	}
	
	//등록
	@RequestMapping("/insertparam")	//	/emp/insert
	public String insertparam(	Integer age,
								@RequestParam(name="name") String firstName, 
								@RequestParam(required = false, defaultValue = "kim") String lastName) {	//@RequsetParam 생략가능, @RequsetParam이 있으면 필수로 넘겨줘야함
		//	String firstName = request.getParameter("")\		
		log.info(age);
		log.info(firstName);
		log.info(lastName);
		return "home";
	}
	
	//삭제
	@RequestMapping("delete")
	public String delete(@RequestParam String id) {
		empService.deleteEmp(id);	//파라미터 필수
		return "home";
	}
	
	//삭제
	@RequestMapping("delete/{empid}/{deptid}")
	public String deletepath(@PathVariable String empid,@PathVariable String deptid) {
		log.info(empid);
		log.info(deptid);
		//empService.deleteEmp(empid);	//파라미터 필수
		return "home";
	}
}
