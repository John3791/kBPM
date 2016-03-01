package engine;

import org.apache.log4j.Logger;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.events.Event;

import common.Node;

@Component
public class Engine extends Node {
	
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
	public void handleEvent(Event event){
		logger.info("kbpm Event: " + event.toString());
	}

}
