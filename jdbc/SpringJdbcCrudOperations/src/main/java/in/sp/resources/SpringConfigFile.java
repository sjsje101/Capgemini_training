package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	@Bean
	public DriverManagerDataSource myDataSource()
	
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");	
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");

	    dataSource.setUsername("springdb");   // NOT system
	    dataSource.setPassword("spring123");

	    return dataSource;
	}
	@Bean
	public JdbcTemplate myJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
		
	}
	
}
