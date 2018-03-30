package com.cq.girl;

import com.cq.girl.domain.User;
import com.cq.girl.service.userService;
import com.sun.net.httpserver.HttpHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Autowired  userService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "hello "+name;
    }
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String say1(){
        return "hello 黄小英";
    }

    @RequestMapping(value = "/front/addUser",method = RequestMethod.GET)
    public Integer insertIntoUser(@ModelAttribute("user") User user, HttpServletRequest request){
            User u =new User();
            u.setName("cq");
            u.setAge(17);

        return userService.addUser(user);
    }

}
