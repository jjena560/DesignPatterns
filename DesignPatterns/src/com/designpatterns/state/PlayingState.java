package com.designpatterns.state;

public class PlayingState extends AudioPlayerState{

	PlayingState(AudioPlayer player) {
		super(player);
		player.isPlaying = true;
	}

	@Override
	public String onLock() {
		player.pressChangeState(new LockedState(player));
		player.setCurrentTrackAfterStop();
		return "Locked";
	}

	@Override
	public String onPlay() {
		player.pressChangeState(new ReadyState(player));
		return "Paused";
	}

	@Override
	public String onNext() {
		return player.nextTrack();
	}

	@Override
	public String onPrevious() {
		return player.previousTrack();
	}

	
	
}
