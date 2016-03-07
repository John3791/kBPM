package engine;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.jdbc.core.JdbcTemplate;
@Component
public class NodeManager {
	
	@Autowired
	private NodeRepository nodeRepository;
	
	public List<Node> findAll(){
//		List<Node> nodes = new ArrayList();
		//nodes = jdbcTemplate.queryForList("SELECT node_id, node_type_id FROM node", Node.class);
		Application.logInfo("findAll()");
		Application.logInfo(nodeRepository.count());
		return nodeRepository.findAll();
	}
	
	public Node addNode(Node node){
		Application.logInfo("addNode(" + node.getNodeId().toString() + ", " + node.getNodeTypeId().toString() + ")");
		Node result = nodeRepository.save(node);
		return result;
	}
}
