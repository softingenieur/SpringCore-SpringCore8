package ru.spring.typeMusic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.spring.Music;

@Component
@Getter
@Setter
@AllArgsConstructor
public class JazzMusic implements Music {

    @Override
    public String play() {
        return "Armstrong";
    }
}
