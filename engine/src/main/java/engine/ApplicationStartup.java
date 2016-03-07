package engine;

import java.nio.ByteBuffer;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.rowset.SqlRowSet;
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
	  test();
    return;
  }
  
  @Autowired
  private NodeManager nodeManager;
  
  private void test(){
	  List<Node> nodes = nodeManager.findAll();
	  for(Node node : nodes){
		  Application.logInfo(node.getNodeId().toString());
	  }
	  String sql = "SELECT node_type_id, description FROM engine.node_type";
	  logger.info("kbpm " + nodes.size() + " rows." );
  }
  private static UUID getUuid(Object bytes) {
	    ByteBuffer bb = ByteBuffer.wrap((byte[])bytes);
	    long high = bb.getLong();
	    long low = bb.getLong();
	    UUID uuid = new UUID(high, low);
	    return uuid;
	}
}