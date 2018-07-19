package com.zyq;

/**
 * @author zyq
 * @date 2018/7/17 9:27
 */
/*@Configuration
@ComponentScan
@EnableAspectJAutoProxy*/
/*@PropertySource("classpath:config.properties")*/
public class Application {
    /*@Autowired
    private Environment environment;
    @Bean
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
        basicDataSource.setUrl(environment.getProperty("jdbc.url"));
        basicDataSource.setUsername(environment.getProperty("jdbc.root"));
        basicDataSource.setPassword(environment.getProperty("jdbc.zyq"));

        return basicDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

*/

}
