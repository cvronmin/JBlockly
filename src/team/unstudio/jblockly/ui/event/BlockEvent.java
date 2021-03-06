package team.unstudio.jblockly.ui.event;

import java.util.EventObject;

import team.unstudio.jblockly.ui.block.Block;

public class BlockEvent extends EventObject{

	private static final long serialVersionUID = 1L;

	public BlockEvent(Block source) {
		super(source);
	}
	
	public Block getBlock(){
		return (Block) getSource();
	}
}
