package com.mycompany.designpatterns.Adapter;

public class AdapterPatternDemo {

    public static void init() {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far way.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
