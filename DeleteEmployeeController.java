package com.klef.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeleteEmployeeController {
	@RequestMapping(method=RequestMethod.DELETE,value="/employee/delete/{empid}")
	@ResponseBody
	public String updateemployee(@PathVariable("empid") int id)
	{
		return EmployeeOperations.getInstance().DeleteEmployee(id);
	}
}
