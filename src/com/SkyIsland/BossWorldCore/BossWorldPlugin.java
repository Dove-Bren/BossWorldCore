package com.SkyIsland.BossWorldCore;

import org.bukkit.plugin.java.JavaPlugin;

public class BossWorldPlugin extends JavaPlugin {
	
	public void onEnable() {
		this.getLogger().info("LOOOL This plugin is enaabled");
		
	}
	
	public void onDisable() {
		this.getLogger().info("NOOOO This plugin is now disaabled");
	}
	
	public void onLoad() {
		this.getLogger().info("YOLO This plugin is loaaded");
	}
	
	
	
}
