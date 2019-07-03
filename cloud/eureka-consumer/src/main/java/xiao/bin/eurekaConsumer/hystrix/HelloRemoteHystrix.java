package xiao.bin.eurekaConsumer.hystrix;

import org.springframework.stereotype.Component;
import xiao.bin.eurekaConsumer.remoteService.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "zhuxiaobin";
    }
}
