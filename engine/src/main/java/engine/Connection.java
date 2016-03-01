package engine;

import java.util.UUID;

public class Connection {
	
	private UUID engineId;
	
	private UUID agentId;
	
	public Connection(){
		
	}
	
	public Connection(UUID engineId, UUID agentId){
		this.engineId = engineId;
		this.agentId = agentId;
	}

}
