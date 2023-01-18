package by.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
    public class ClassicalMusic implements Music {
        @Override
        public List getSong() {
            List<String> classicalMusicList = new ArrayList<>();
            classicalMusicList.add("Symphony");
            classicalMusicList.add("A Hymn to the Virgin");
            classicalMusicList.add("Don't Look Down");
            return classicalMusicList;
        }
    }
