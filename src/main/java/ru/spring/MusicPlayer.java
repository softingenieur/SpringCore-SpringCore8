package ru.spring;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.spring.enam.MusicTypeEnam;
import ru.spring.typeMusic.ClassicalMusic;
import ru.spring.typeMusic.RapMusic;


@Component
@Setter
@Getter
public class MusicPlayer {
    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music music, @Qualifier("classicalMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    private Music music;
    private Music music2;

    ClassicalMusic classicalMusic = new ClassicalMusic();
    RapMusic rapMusic = new RapMusic();

    public void playMusic(MusicTypeEnam x) {
        if(x == MusicTypeEnam.CLASSICAL){
        System.out.println(classicalMusic.getRandomSong());
        }
        else System.out.println(rapMusic.getRandomSong());
    }
}
