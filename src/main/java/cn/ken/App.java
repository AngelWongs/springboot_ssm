package cn.ken;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ken.mapper")//扫描接口和映射文件
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
