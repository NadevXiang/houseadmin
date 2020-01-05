package xyz.ruankun.houseadmin.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

//@Configuration
//@MapperScan("xyz.ruankun.houseadmin.mapper") // 扫描dao
@Deprecated
public class MybatisConfig {

    //@Autowired
    private DataSource dataSource;

    //@Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        System.out.println("开始配置sqlSession");
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        // 扫描model
        sessionFactory.setTypeAliasesPackage("xyz.ruankun.houseadmin.entity");
        // 扫描映射文件
        PathMatchingResourcePatternResolver resolver
                = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver
                        .getResources("classpath:mapper/*.xml"));
        System.out.println("配置sqlSession结束");
        return sessionFactory.getObject();
    }
}
