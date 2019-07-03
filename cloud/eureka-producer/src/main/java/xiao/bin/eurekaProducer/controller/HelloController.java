package xiao.bin.eurekaProducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * class
 *
 * @author jianbin
 * @date 2019/7/3
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + " " + new Date();
    }

}
