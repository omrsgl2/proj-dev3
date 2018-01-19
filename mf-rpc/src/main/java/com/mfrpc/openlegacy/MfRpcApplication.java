package com.mfrpc.openlegacy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application
 */
@SpringBootApplication(/*exclude = {
        HibernateJpaAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        SecurityAutoConfiguration.class,
        TransactionAutoConfiguration.class}*/)
public class MfRpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MfRpcApplication.class, args);
    }

}

