package com.SkyIsland.BossWorldCore.Boss;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;

public abstract class Boss {
	
	/**
	 * Stores the entity that serves as the core entity for the boss
	 */
	protected LivingEntity entity;
	
	public Runnable hey = new Runnable() {
		public void run() {
			if (entity.getEntityId() == 4)
			return;
		}
	};
	
	private MovementThread moveThread;
	
	/**
	 * How the boss dies. This is the opportunity to be cinematic and specify drops
	 */
	public abstract void die();
	
	/**
	 * How the boss is created. This is where super fancy cinematic stuff happens.
	 */
	public abstract void birth();
	
	/**
	 * 
	 */
	public void move() {
		moveThread.start();
	}
	
	public void setMovement(Runnable movementStep) {
		this.moveThread = new MovementThread(movementStep);
	}
	
}
