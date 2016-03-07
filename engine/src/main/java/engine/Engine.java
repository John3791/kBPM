package engine;

import org.apache.log4j.Logger;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.events.Event;

@Component
public class Engine {
	
	private static final Logger logger = Logger.getLogger(Engine.class.getName());
	
	public Engine(){
		
		logger.info("kbpm Engine initializing.");
		logger.info("kbpm Engine initialized.");
	}
	
	@EventListener
	public void handleContextRefresh(ContextRefreshedEvent event){
		logger.info("kbpm Context refresh begins.");
	}

	@EventListener
	public void xhandleContextRefresh(ApplicationContextEvent event){
		logger.info("kbpm Event: " + event.toString());
	}

	@EventListener
	public void handleEvent(Event event){
		logger.info("kbpm Event: " + event.toString());
	}

}
