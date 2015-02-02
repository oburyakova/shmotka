package ru.oburyakova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.oburyakova.domain.User;

@Controller
public class IndexController {

    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping (value = "/greeting/{name}", method = RequestMethod.GET)
    public @ResponseBody User greeting (@PathVariable(value = "name") String name) {
        return new User(name);
    }
}
