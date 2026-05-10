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
public class RapMusic  implements Music {
    List<String> songListRap = new ArrayList<>();
    public RapMusic(){
        songListRap.add("Eminem");
        songListRap.add("Dr dre");
        songListRap.add("Gims");
    }
    @Override
    public String play() {
        return "Kanye";
    }

    public String getRandomSong() {

        int index = (int) (Math.random() * songListRap.size());

        return songListRap.get(index);
    }
}
