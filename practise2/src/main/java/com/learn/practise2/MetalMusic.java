package com.learn.practise2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component("metalMusic")
@Scope("singleton")
public class MetalMusic implements Music {
    private final List<String> metalSongs = new ArrayList<>();

    public MetalMusic() {
        String[] metalSongsArray = {
                "Slipknot - Before I Forget",
                "Metallica - Nothing Else Matters",
                "Bring Me The Horizon - Avalanche"
        };
        Collections.addAll(metalSongs, metalSongsArray);
    }

    @Override
    public List<String> getSongs() {
        return metalSongs;
    }
}
