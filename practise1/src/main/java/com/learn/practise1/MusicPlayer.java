package com.learn.practise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private final Random random = new Random();
    private final Music punkMusic;
    private final Music metalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("punkMusic") Music punkMusic,
                       @Qualifier("metalMusic") Music metalMusic) {
        this.punkMusic = punkMusic;
        this.metalMusic = metalMusic;
    }

    public void playSong(Genre genre) {
        List<String> songs;
        int idOfASong = random.nextInt(3);
        songs = switch (genre) {
            case PUNK -> punkMusic.getSongs();
            case METAL -> metalMusic.getSongs();
        };
        System.out.println("Now Playing: " + songs.get(idOfASong));
    }
}
