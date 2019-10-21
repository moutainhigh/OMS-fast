package com.lgy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author lgy
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JeeFastApplication {
    public static void main(String[] args) {
        SpringApplication.run(JeeFastApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}