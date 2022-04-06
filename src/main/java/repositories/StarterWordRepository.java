package repositories;

import models.Player;
import models.StarterWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StarterWordRepository extends JpaRepository<StarterWord, Long> {
//
//    List<StarterWord> findByWord(String word);
//
//    List<StarterWord> findById(long id);
//
//    List<StarterWord> findByPlayer(Player player);
//
//    List<StarterWord> findAll();

}
