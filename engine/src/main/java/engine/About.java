package engine;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class About {
	@XmlElement
	private int availableProcessors;
	@XmlElement
	private long freeMemory;
	@XmlElement
	private String maxMemory;
	@XmlElement
	private long totalMemory;
	@XmlElement
	private String root[];
	@XmlElement 
	private String javaRuntimeVersion;
	@XmlElement
	private String javaVmVendor;
	@XmlElement
	private String osName;
	@XmlElement
	private String osVersion;
	@XmlElement
	private String osArch;
	
	
	public int getAvailableProcessors(){
		return Runtime.getRuntime().availableProcessors();
	}
	
	public About() {
		this.availableProcessors = getAvailableProcessors();
		this.freeMemory = getFreeMemory();
		this.maxMemory = getMaxMemory();
		this.totalMemory = getTotalMemory();
		this.root = getRoots();
		this.javaRuntimeVersion = System.getProperty("java.runtime.version");
		this.javaVmVendor = System.getProperty("java.vm.vendor");
		this.osName = System.getProperty("os.name");
		this.osVersion = System.getProperty("os.version");
		this.osArch = System.getProperty("os.arch");
		
	}

	public long getFreeMemory() {
		return Runtime.getRuntime().freeMemory();
	}

	public String getMaxMemory() {
		/* This will return Long.MAX_VALUE if there is no preset limit */
	    long maxMemory = Runtime.getRuntime().maxMemory();
	    /* Maximum amount of memory the JVM will attempt to use */
	    return (maxMemory == Long.MAX_VALUE ? "no limit" : Long.toString(maxMemory));
	}

	public long getTotalMemory() {
		return Runtime.getRuntime().totalMemory();
	}

	public String[] getRoots() {
		File[] fileRoots = File.listRoots();
		ArrayList<String> roots = new ArrayList<>();
		for(File root:fileRoots){
			roots.add(root.getAbsolutePath() + " Total: " + root.getTotalSpace() + " Free: " + root.getFreeSpace() + " Usable:" + root.getUsableSpace());
		}
		String[] array = new String[roots.size()];
		return roots.toArray(array);
	}


}
