package com.nt.dto;

public class CricketerAvgDto {
	String name;
	int runsscored,gotout,runsgiven,wicketstaken;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRunsscored() {
		return runsscored;
	}
	public void setRunsscored(int runsscored) {
		this.runsscored = runsscored;
	}
	public int getGotout() {
		return gotout;
	}
	public void setGotout(int gotout) {
		this.gotout = gotout;
	}
	public int getRunsgiven() {
		return runsgiven;
	}
	public void setRunsgiven(int runsgiven) {
		this.runsgiven = runsgiven;
	}
	public int getWicketstaken() {
		return wicketstaken;
	}
	public void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}

}