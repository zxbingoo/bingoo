package xiao.bin.eurekaConsumer.remoteService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jianbin
 * @date 2019/7/3
 */
@FeignClient(name = "eureka-producer")
@Component
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
