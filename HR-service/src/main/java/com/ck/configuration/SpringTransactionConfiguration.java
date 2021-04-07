package com.ck.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Description：
 * spring注解式事务的配置类
 * @Author：wangcz
 * @Date 2021年03月16日 10:11
 */
@Configuration
// 注解式事务管理器默认是关闭的
// 使用@EnableTransactionManagement开启事务管理器
@EnableTransactionManagement
public class SpringTransactionConfiguration {

    // 自动注入数据源
    // 该数据源在spring集成mybatis的时候就配置好了，可以直接注入
    @Autowired
    private ComboPooledDataSource c3p0;

    // 定义方法创建事务管理器bean组件
    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager manager =
                new DataSourceTransactionManager();
        // 注入数据源
        manager.setDataSource(c3p0);
        return manager;
    }
}
