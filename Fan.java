package com.amz.linkedLists;

public class Fan {
	
	int noOfPulls;
	
	int speed;

	boolean fanStatus;

	boolean fanDirection;
	
	public Fan(int noOfPulls, boolean fanStatus, boolean fanDirection) {
 		this.noOfPulls = noOfPulls;
 		this.fanStatus = fanStatus;
		this.fanDirection = fanDirection;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isFanStatus() {
		return fanStatus;
	}

	public void setFanStatus(boolean fanStatus) {
		this.fanStatus = fanStatus;
	}

	public boolean isFanDirection() {
		return fanDirection;
	}

	public void setFanDirection(boolean fanDirection) {
		this.fanDirection = fanDirection;
	}

	public int getNoOfPulls() {
		return noOfPulls;
	}

	public void setNoOfPulls(int noOfPulls) {
		this.noOfPulls = noOfPulls;
	}

	@Override
	public String toString() {
		return "Fan [noOfPulls=" + noOfPulls + ", speed=" + speed + ", fanStatus=" + fanStatus + ", fanDirection="
				+ fanDirection + "]";
	}
	
}
