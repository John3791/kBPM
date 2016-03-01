package engine;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectionController {
	
	@RequestMapping("/connection")
	public List<Connection> connection() {
		List<Connection> connections = new ArrayList();
		connections.add(new Connection(UUID.randomUUID(), UUID.randomUUID()));
		return connections;
	}

}
