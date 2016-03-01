package engine;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
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
	  logger.info("Info level log.");
 
    return;
  }
 
} // class ApplicationStartup