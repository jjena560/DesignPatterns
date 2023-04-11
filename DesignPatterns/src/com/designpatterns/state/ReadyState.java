package com.designpatterns.state;

public class ReadyState extends AudioPlayerState{

	ReadyState(AudioPlayer player) {
		super(player);
	}

	@Override
	public String onLock() {
		player.pressChangeState(new LockedState(player));
		return "Locked";
	}

	@Override
	public String onPlay() {
		String action = player.startPlayback();
		player.pressChangeState(new PlayingState(player));
		return action;
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
