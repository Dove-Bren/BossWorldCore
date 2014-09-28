package com.SkyIsland.BossWorldCore.Boss;

import org.bukkit.entity.LivingEntity;

public abstract class Boss {
	
	private LivingEntity entity;
	
	public abstract void die();
	public abstract void birth();
	public void move() {
		
	}
	
}
