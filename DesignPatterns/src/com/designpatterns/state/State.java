package com.designpatterns.state;

public abstract class State {
	AudioPlayer player;
	
	State(AudioPlayer player){
		this.player = player;
	}
	
	public abstract String onLock();
	public abstract String onPlay();
	public abstract String onNext();
	public abstract String onPrevious();

}
