package by.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

import static by.springcourse.GenreOfMusic.CLASSICAL;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }


    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("popMusic") Music music2)
    {
this.music2 = music2;
this.music1 = music1;
    }
    // IoC

    public String playMusic(GenreOfMusic genreOfMusic) {
        Random rand = new Random();
        if(genreOfMusic == CLASSICAL) {

            return (String)(music1.getSong().get(rand.nextInt(3)));
        }
        else return (String)(music2.getSong().get(rand.nextInt(3)));
    }
}
