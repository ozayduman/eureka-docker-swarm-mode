package com.ozayduman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by ozayd on 2.11.2016.
 */
@Controller
@RequestMapping("/hello-world")
public class TestController {
    //@Value("${eureka.instance.ip-address}")
    private String ipAddress="";
    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String sayHello()  {
        try {
            String ipAddres = "test: " + InetAddress.getLocalHost().getHostAddress();
            System.err.println(ipAddres);
            return ipAddres;
        } catch (UnknownHostException e) {
            return e.getMessage();
        }
    }
}
