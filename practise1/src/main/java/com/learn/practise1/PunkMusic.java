package com.learn.practise1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component("punkMusic")
public class PunkMusic implements Music {
    private final List<String> punkSongs = new ArrayList<>();

    public PunkMusic() {
        String[] punkSongsArray = {
                "Green Day - American Idiot",
                "Sex Pistols - God Save The Queen",
                "Blink-182 - What's My Age Again?"
        };
        Collections.addAll(punkSongs, punkSongsArray);
    }

    @Override
    public List<String> getSongs() {
        return punkSongs;
    }
}
