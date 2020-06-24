package io.dowlath.centralize.config.consul.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Dowlath
 * @create 6/24/2020 11:51 PM
 */

@ConfigurationProperties(prefix="my")
@Data
public class MyConfig {

     private String username;
     private String password;
}
