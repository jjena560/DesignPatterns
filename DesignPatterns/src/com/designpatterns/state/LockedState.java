package com.designpatterns.state;

public class LockedState extends AudioPlayerState{

	LockedState(AudioPlayer player) {
		super(player);
		player.isPlaying = false;
	}

	@Override
	public String onLock() {
		if(player.isPlaying()) {
			player.pressChangeState(new ReadyState(player));
			return "Stop Playing";
		}else {
			return "Locked";
		}
	}

	@Override
	public String onPlay() {
		player.pressChangeState(new ReadyState(player));
		return "Ready";
	}

	@Override
	public String onNext() {
		return "Locked";
	}

	@Override
	public String onPrevious() {
		return "Locked";
	}

	
	
}
