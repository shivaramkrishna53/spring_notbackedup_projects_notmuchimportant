package com.nt.bo;



public class CricketerAvgBo {
	private String name;
	int runsscored,gotout,runsgiven,wicketstaken;
	float battingavg,bowlingavg;
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
	public float getBattingavg() {
		return battingavg;
	}
	public void setBattingavg(float battingavg) {
		this.battingavg = battingavg;
	}
	public float getBowlingavg() {
		return bowlingavg;
	}
	public void setBowlingavg(float bowlingavg) {
		this.bowlingavg = bowlingavg;
	}
}