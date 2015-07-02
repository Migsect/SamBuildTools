package net.samongi.SamBuildTools.Tools;

import java.util.HashSet;
import java.util.Set;

public abstract class Tool
{
	private final String tag;
	private final String name;
	
	protected final boolean canBreakBlocks = false;
	protected final boolean canShiftBreakBlocks = true;
	protected final boolean canBePlaced = false;
	protected final boolean canBeUsed = false;
  
	protected final Set<ToolFields> fields = new HashSet<>();
	
	protected Tool(String tag, String name)
	{
		this.tag = tag;
		this.name = name;
	}
	
	public final String getTag(){return this.tag;}
	public final String getName(){return this.name;}
	
	public final boolean canBreakBlocks(){return this.canBreakBlocks;}
	public final boolean canShiftBreakBlocks(){return this.canShiftBreakBlocks;}
	public final boolean canBePlaced(){return this.canBePlaced;}
	public final boolean canBeUsed(){return this.canBeUsed;}
}
