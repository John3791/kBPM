package engine;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Configuration {
	
	private String engineId = "89388b40-63c1-4607-9f1f-a468c5aeff90";

	/**
	 * @return the engineId
	 */
	public String getEngineId() {
		return engineId;
	}

	/**
	 * @param engineId the engineId to set
	 */
	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

}
