package repositories;

import models.PreviousRaps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreviousRapsRepository extends JpaRepository<PreviousRaps, Long> {

//    List<PreviousRaps> findByPlayerName(String name);
//
//    List<PreviousRaps> findByPlayerstageName(String name);
}