package com.learn.practise1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Practise1Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playSong(Genre.PUNK);
        musicPlayer.playSong(Genre.PUNK);
        musicPlayer.playSong(Genre.METAL);
        musicPlayer.playSong(Genre.METAL);
        context.close();
    }

}
