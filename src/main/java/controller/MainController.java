package controller;

import model.AjaxModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by son on 2019-05-15.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/checkArrayObject")
    public void checkArrayObject() {
    }

    @RequestMapping("fileInfos")
    public AjaxModel fileInfos(@RequestParam("file") MultipartFile file) {
        return new AjaxModel(true, file.getOriginalFilename());
    }
}