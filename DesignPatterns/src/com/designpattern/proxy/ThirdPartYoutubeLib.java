package com.designpattern.proxy;

import java.util.HashMap;

public interface ThirdPartYoutubeLib {
	HashMap<String, Video> popularVideos();
	
	Video getVideo(String videoId);

}
