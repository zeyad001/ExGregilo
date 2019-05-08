package co.q64.exgregilo.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public boolean enableHammers= false;
	private String path = "config/exgregilo.cfg";
	private  Configuration config;
	public static ConfigHandler cHandler = null;
	public static ConfigHandler getInstance()
	{
		return cHandler;
	}
	public static void init()
	{
		cHandler.config = new Configuration(new File(cHandler.path)); 
		cHandler.config.load();
	    cHandler.enableHammers = cHandler.config.get("disableOtherMods", "enableExNihiloHammer", false).getBoolean();
	}

	public ConfigHandler() {
		// TODO Auto-generated constructor stub
	}
	public ConfigHandler(String path)
	{
		this.path = path;
	}
	

}
