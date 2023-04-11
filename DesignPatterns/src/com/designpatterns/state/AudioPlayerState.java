package com.designpatterns.state;

public abstract class AudioPlayerState {
	AudioPlayer player;
	
	AudioPlayerState(AudioPlayer player){
		this.player = player;
	}
	
	public abstract String onLock();
	public abstract String onPlay();
	public abstract String onNext();
	public abstract String onPrevious();

}
