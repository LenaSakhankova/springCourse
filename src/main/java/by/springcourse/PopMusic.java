package by.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class PopMusic implements Music {
        @Override
        public List getSong() {
                    List<String> popMusicList = new ArrayList<>();
            popMusicList.add("Wind cries Mary");
            popMusicList.add("Yesterday");
            popMusicList.add("Girl");

            return popMusicList;
        }
}
