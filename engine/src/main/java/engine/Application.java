package engine;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application {
	private static final Logger logger = Logger.getLogger(Application.class.getName());
	public static void logInfo(Object message){
		logger.info("kbpm " + message);
	}
//	@Autowired
//	private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("kbpm main(" + args.toString() + ")");
    }
}