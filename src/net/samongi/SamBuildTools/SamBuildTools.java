package net.samongi.SamBuildTools;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class SamBuildTools extends JavaPlugin
{
	static private Logger logger;
  static private boolean debug;
  
  static final public void log(String to_log){logger.info(to_log);}
  static final public void debugLog(String to_log){if(debug == true) logger.info(to_log);}
  static final public boolean debug(){return debug;}
  
  public void onEnable()
  {
  	
  }
  public void onDisable()
  {
  	
  }
}
