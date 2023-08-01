package com.github.ulwx.aka.springcloud;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;


@EnableDiscoveryClient
@PropertySource(
        name="classpath*:aka-application-cloud.yml",
        value = {"classpath*:aka-application-cloud.yml"},
        factory = MyPropertySourceFactory.class)
public class AkaSpringCloudAutoConfiguration {

}
