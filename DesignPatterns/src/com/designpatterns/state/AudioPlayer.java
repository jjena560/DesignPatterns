package com.designpatterns.state;

import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {
	AudioPlayerState state;
	boolean isPlaying = false;
	private List<String> playList = new ArrayList<>();
	private int currTrack = 0;
	
	
	public AudioPlayer() {
		this.state = new LockedState(this);
		setPlaying(true);
		for(int i = 1; i <= 12; i++) {
			playList.add("Track " + i);
		}
	}
	
	
	
	public void pressChangeState(AudioPlayerState state) {
		this.state = state;
	}
	
	public AudioPlayerState getState() {
		return state;
	}
	
	public boolean isPlaying() {
		return isPlaying;
	}
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public String startPlayback() {
		return "Playing " + playList.get(currTrack);
	}

	public void setCurrentTrackAfterStop() {
		this.currTrack = 0;
	}

	public String nextTrack() {
		currTrack++;
		if(currTrack >= playList.size()) {
			currTrack =  0;
		}
		
		return "Playing " + playList.get(currTrack);
	}

	public String previousTrack() {
		currTrack--;
		if(currTrack < 0) {
			currTrack =  playList.size() - 1;
		}
		
		return "Playing " + playList.get(currTrack);
	}

}
