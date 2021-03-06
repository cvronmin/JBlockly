package team.unstudio.jblockly.block;

import java.util.ArrayList;
import java.util.List;

public class BlockGroup {
	
	private String node[] = new String[0];
	private String name;
	private List<BlockDescriber> blocks = new ArrayList<>();
	
	public String[] getNode() {
		return node;
	}
	
	public void setNode(String ...node) {
		this.node = node;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<BlockDescriber> getBlocks() {
		return blocks;
	}
}
