package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    { 
//    	int ct_id =4;
//    	String ct_name="INDIA";
//    	String ct_capital="katni";
//    	long ct_population=1400000;
//       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//       String insert_sql_query = "INSERT INTO country values(?,?,?,?)";
//        int count = jdbcTemplate.update(insert_sql_query,ct_id,ct_name,ct_capital,ct_population);
//        if(count>0)
//        {
//        	System.out.print("success");
    	
    	
//    	----------------------update 
    	int id = 2;
    	String name = "shahdol";
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
    	String update_sql = "UPDATE  country SET NAME = ? where ID=?";
    	int count = jdbcTemplate.update(update_sql,name,id);
    	 if(count>0)
           {
           	System.out.print(" updation success");
        }
    }
}
