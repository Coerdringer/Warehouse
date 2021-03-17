package pl.edu.wszib.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.warehouse.model.hardcode.User;

@Controller
public class LoginController {

    @RequestMapping(value = "/login_page", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        return new ModelAndView("loginPage", "userKey", new User());
    }

    @RequestMapping(value = "/login_page",method = RequestMethod.POST)
    public String loginForm(@ModelAttribute("userKey") User user) {
        System.out.println(user);
        if(user.getLogin().equals("admin") && user.getPass().equals("admin123")) {
            return "redirect:index";
        } else {
            return "loginPage";
        }
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
