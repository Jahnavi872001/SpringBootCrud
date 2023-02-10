package com.klef.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//http://localhost:2020/employee/update
@Controller
public class UpdateEmployeeController {
	@RequestMapping(method=RequestMethod.POST,value="/employee/update")
	@ResponseBody
	public String updateemployee(@RequestBody Employee emp)
	{
		return EmployeeOperations.getInstance().UpdateEmployee(emp);
	}
}
