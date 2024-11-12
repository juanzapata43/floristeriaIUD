package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping(value = "/index")
public class index {
@GetMapping(value = "index")
public String getMethodName(@RequestParam String param) {
    return new String();
}

public String home() {
    return "index";
}
    
}
