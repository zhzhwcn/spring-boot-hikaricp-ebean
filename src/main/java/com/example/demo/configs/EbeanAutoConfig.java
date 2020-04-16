package com.example.demo.configs;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EbeanAutoConfig {

    @Autowired
    DataSourceConfig dataSourceConfig;
    @Bean
    public EbeanServer init() {
        ServerConfig config = new ServerConfig();
        config.setName("db");
        config.setDataSource(dataSourceConfig.primaryDataSource());
        config.setDefaultServer(true);
        config.setRegister(true);
        config.setRunMigration(true);
        return EbeanServerFactory.create(config);
    }
}
