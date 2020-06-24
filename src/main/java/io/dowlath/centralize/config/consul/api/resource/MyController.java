package io.dowlath.centralize.config.consul.api.resource;

import io.dowlath.centralize.config.consul.api.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Dowlath
 * @create 6/24/2020 11:52 PM
 */
@RestController
@EnableConfigurationProperties(value=MyConfig.class)
public class MyController {
    @Autowired
    private MyConfig config;

    @GetMapping("/getConfigData")
    public MyConfig getConfiguration(){
        return config;
    }

}
