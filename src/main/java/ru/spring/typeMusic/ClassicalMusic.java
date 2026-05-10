package ru.spring.typeMusic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.spring.Music;

import java.util.ArrayList;
import java.util.List;


@Component
@Getter
@Setter
@AllArgsConstructor
public class ClassicalMusic implements Music {

    List<String> songListClassical = new ArrayList<>();
    public ClassicalMusic(){
    songListClassical.add("Chaikovsti");
    songListClassical.add("Vivaldi");
    songListClassical.add("Musorski");
    }
    @Override
    public String play() {
        return "Bethoven";
    }

    public String getRandomSong() {

        int index = (int) (Math.random() * songListClassical.size());

        return songListClassical.get(index);
    }
}
