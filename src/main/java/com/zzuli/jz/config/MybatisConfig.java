package com.zzuli.jz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zzuli.jz.dao")
public class MybatisConfig {
}
