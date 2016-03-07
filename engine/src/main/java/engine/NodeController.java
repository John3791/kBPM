package engine;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {
	@Autowired
	private NodeManager nodeManager ;
	
	@RequestMapping("/node")
	public List<Node> node() {
		return nodeManager.findAll();
	}

}
