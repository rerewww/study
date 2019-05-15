package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by son on 2019-05-15.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }
}
