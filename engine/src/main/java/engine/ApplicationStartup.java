package engine;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


@Component
public class ApplicationStartup 
implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger logger = Logger.getLogger(ApplicationStartup.class.getName());
  /*
   * This method is called during Spring's startup.
   * 
   * @param event Event raised when an ApplicationContext gets initialized or
   * refreshed.
   */
  @Override
  public void onApplicationEvent(final ContextRefreshedEvent event) {
 
    // here your code ...
	  logger.info("kbpm ApplicationStartup.onApplicationEvent()");
	  test();
    return;
  }
  
  @Autowired
  private JdbcTemplate jdbcTemplate;
  private void test(){
	  String sql = "SELECT * FROM node";
	  //ResultSet rs = jdbcTemplate.query
	  SqlRowSet srs = jdbcTemplate.queryForRowSet(sql);
	  int row = 0;
	  while (srs.next()){
		 // logger.info("kbpm " + srs..getString("table_name"));
	  }
	  
	  logger.info("kbpm " + row + " rows." );
  }
 
} // class ApplicationStartup