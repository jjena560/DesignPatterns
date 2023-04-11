package com.designpatterns.state;

public class TestSate {

	 public static void main(String[] args) {
	        AudioPlayer player = new AudioPlayer();
	        UI ui = new UI(player);
	        ui.init();
	    }
}