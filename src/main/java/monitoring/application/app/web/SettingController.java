package monitoring.application.app.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SettingController {

    @GetMapping("/settings")
    ModelAndView getSetting(){

        ModelAndView modelAndView = new ModelAndView("settings");
        return modelAndView;
    }
}
