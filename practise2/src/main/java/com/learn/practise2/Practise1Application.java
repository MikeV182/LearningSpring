package com.learn.practise2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Practise1Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playSong(Genre.PUNK);
        musicPlayer.playSong(Genre.PUNK);
        musicPlayer.playSong(Genre.METAL);
        musicPlayer.playSong(Genre.METAL);
        context.close();
    }

}
