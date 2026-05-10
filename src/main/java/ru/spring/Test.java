package ru.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.spring.enam.MusicTypeEnam;
import java.util.Random;


public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Random random = new Random();

        MusicTypeEnam[] values = MusicTypeEnam.values();

        MusicTypeEnam randomType =
                values[random.nextInt(values.length)];

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(randomType);
        context.close();
    }
}
