package ml.djangi.app.Djangi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping({"/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("home/home");
        return mav;
    }

}
