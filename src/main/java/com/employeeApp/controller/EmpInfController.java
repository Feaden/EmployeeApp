package com.employeeApp.controller;

import com.employeeApp.entity.Employee;
import com.employeeApp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpInfController {
    private EmpService empService;
    @Autowired
    public EmpInfController(EmpService empService) {
        this.empService = empService;
    }
    @RequestMapping("/saveEmp")
    public String saveEmp(@ModelAttribute("employee")Employee employee) {
        empService.saveEmp(employee);
        return "redirect:/";
    }
}
