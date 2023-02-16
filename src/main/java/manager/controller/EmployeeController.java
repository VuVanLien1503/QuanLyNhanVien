package manager.controller;

import manager.model.Employee;
import manager.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/employee")
public class EmployeeController {


    EmployeeService employeeService = new EmployeeService();

    public EmployeeController() {
    }

    @GetMapping("/display")
    public String listEmployee(Model model) {
        model.addAttribute("list", employeeService.findAll());
        return "display";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }

    @PostMapping("/create")
    public String create(HttpServletRequest request, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        employeeService.save(new Employee(id, name, age, address));
        model.addAttribute("list", employeeService.findAll());
        return "display";
    }

    @GetMapping("/edit")
    public String showEdit(HttpServletRequest request, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Employee employee = null;
        for (Employee e :
                employeeService.findAll()) {
            if (e.getId() == id) {
                employee = e;
                break;
            }
        }
        model.addAttribute("employee", employee);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(HttpServletRequest request, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        Employee employee = employeeService.findById(id);
        employeeService.update(employeeService.findAll().indexOf(employee), new Employee(id, name, age, address));
        model.addAttribute("list", employeeService.findAll());
        return "display";
    }

    @GetMapping("/delete")
    public String showDelete(HttpServletRequest request, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Employee employee = null;
        for (Employee e :
                employeeService.findAll()) {
            if (e.getId() == id) {
                employee = e;
                break;
            }
        }
        model.addAttribute("employee", employee);
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(HttpServletRequest request, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.delete(employeeService.findById(id));
        model.addAttribute("list", employeeService.findAll());
        return "display";
    }
}
