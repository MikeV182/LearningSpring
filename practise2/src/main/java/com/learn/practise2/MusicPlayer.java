package com.learn.practise2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class MusicPlayer {
    @Value("${musicPlayer.model}")
    private String model;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final Random random = new Random();
    private final Music punkMusic;
    private final Music metalMusic;

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

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

    @PostConstruct
    private void myPostConstruct() {
        System.out.println("Started the player: " + getModel() + "\nVolume Level: " + getVolume());
    }

    @PreDestroy
    private void myPreDestroy() {
        System.out.println("Turning OFF");
    }
}
