package xiao.bin.eurekaConsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.bin.eurekaConsumer.remoteService.HelloRemote;

/**
 * class
 *
 * @author jianbin
 * @date 2019/7/3
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name + "!");
    }

}
