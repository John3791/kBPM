package engine;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="node")
public class Node implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Node(){};
	public Node(UUID nodeId, UUID nodeTypeId){
		this.nodeId = nodeId;
		this.nodeTypeId = nodeTypeId;
	}
	@Id
	@Column(name="node_id")
	private UUID nodeId;
	@Column(name="node_type_id")
	private UUID nodeTypeId;
	@Column(name="host_name")
	private String hostName;
	@Column(name="port_number")
	private int portNumber;
	
//	private String nodeTypeDesc;

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}
	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	/**
	 * @return the portNumber
	 */
	public int getPortNumber() {
		return portNumber;
	}
	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}
	/**
	 * @return the nodeId
	 */
	public UUID getNodeId() {
		return nodeId;
	}

	/**
	 * @param nodeId the nodeId to set
	 */
	public void setNodeId(UUID nodeId) {
		this.nodeId = nodeId;
	}

	public UUID getNodeTypeId() {
		return nodeTypeId;
	}

	public void setNodeTypeId(UUID nodeTypeId) {
		this.nodeTypeId = nodeTypeId;
	}

/*	public String getNodeTypeDesc() {
		return nodeTypeDesc;
	}

	public void setNodeTypeDesc(String nodeTypeDesc) {
		this.nodeTypeDesc = nodeTypeDesc;
	}*/

}
