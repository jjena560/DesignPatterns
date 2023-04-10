package com.designpattern.observer;

public class CricketData extends Subject{

	public void setData(int runs, int overs, int wickets) {
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
		super.notifyObservers();
	}
	private int runs;
	private int overs;
	private int wickets;
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	@Override
	public String toString() {
		return "CricketData [runs=" + runs + ", overs=" + overs + ", wickets=" + wickets + "]";
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
}
