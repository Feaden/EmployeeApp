package com.employeeApp.controller;

import com.employeeApp.dao.EmpDAO;
import com.employeeApp.entity.Employee;
import com.employeeApp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DefaultPageController {

    private EmpService empService;
    @Autowired
    public DefaultPageController(EmpService empService) {
        this.empService = empService;
    }
    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmps = empService.getAllEmp();
        model.addAttribute("allEmps", allEmps);
        return "allEmployees";
    }
    @RequestMapping("/addNewEmp")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

}
