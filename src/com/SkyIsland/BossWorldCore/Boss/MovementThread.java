package com.SkyIsland.BossWorldCore.Boss;

public class MovementThread extends Thread {
	
	public MovementThread(Runnable step) {
		super(step);
	}
	
}
