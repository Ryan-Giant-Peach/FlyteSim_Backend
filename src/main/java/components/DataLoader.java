package components;
import models.Player;
import models.StarterWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import repositories.PlayerRepository;
import repositories.StarterWordRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    StarterWordRepository starterWordRepository;

    public DataLoader() {

    }


    @Override
    public void run(ApplicationArguments args) {

        Player ryan = new Player("Ryan", "CatBoy", 50);
        playerRepository.save(ryan);

        Player calum = new Player("Calum", "Wee Cal Robot", 50);
        playerRepository.save(calum);

        StarterWord word1 = new StarterWord("bottle", "noun");
        starterWordRepository.save(word1);

        StarterWord word2 = new StarterWord("grape", "noun");
        starterWordRepository.save(word2);


        StarterWord word3 = new StarterWord("nation", "noun");
        starterWordRepository.save(word3);

        StarterWord word4 = new StarterWord("run", "verb");
        starterWordRepository.save(word4);

        StarterWord word5 = new StarterWord("rhyme", "verb");
        starterWordRepository.save(word5);

        StarterWord word6 = new StarterWord("dumb", "adjective");
        starterWordRepository.save(word6);

        StarterWord word7 = new StarterWord("happy", "adjective");
        starterWordRepository.save(word7);



    }
}