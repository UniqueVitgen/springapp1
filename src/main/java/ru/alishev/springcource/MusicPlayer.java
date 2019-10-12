package ru.alishev.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic")Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(MUSIC_TYPE music_type) {
        Random rn = new Random();
        int answer = rn.nextInt(3);
        Music music = music_type == MUSIC_TYPE.CLASSICAL ? classicalMusic : rockMusic;
        return "Playing: " + music.getSong()[answer];
    }
}
