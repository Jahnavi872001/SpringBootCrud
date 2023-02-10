package com.klef.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ViewEmployeeController
{
@RequestMapping(method=RequestMethod.GET,value="/employee/all")
@ResponseBody
public List<Employee> getAllEmployees()
{
return EmployeeOperations.getInstance().getEmployeeRecords();
}
}