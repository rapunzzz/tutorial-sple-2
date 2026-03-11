package jab.movement; 

import robocode.HitWallEvent; 
import robocode.Event; 

import jab.module.Module; 
import jab.module.Movement; 

public  class  Cornering  extends Movement {
	
	
	private int moveDirection;

	
	private int turnRightValue;

	
	
	public Cornering(Module bot) {
		super(bot);
		turnRightValue = 90;
	}

	

	public void move() {
		// Limit our speed to 5
		bot.setMaxVelocity(12);
		// Start moving (and turning)
		bot.setAhead(10000);
	}

	
	
	public void listen(Event e) {
		if (e instanceof HitWallEvent) {
			bot.setTurnRight(turnRightValue);
		}
	}


}
