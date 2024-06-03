package brennerfsouza.frasesclassicas.repository;

import brennerfsouza.frasesclassicas.dto.FraseDTO;
import brennerfsouza.frasesclassicas.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase getRandomPhrase();
}
