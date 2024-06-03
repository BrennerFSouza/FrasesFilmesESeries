package brennerfsouza.frasesclassicas.service;

import brennerfsouza.frasesclassicas.dto.FraseDTO;
import brennerfsouza.frasesclassicas.model.Frase;
import brennerfsouza.frasesclassicas.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO getRandomPhrase() {
        Optional<Frase> frase = Optional.ofNullable(repository.getRandomPhrase());
        if (frase.isPresent()) {
            Frase f = frase.get();
            return new FraseDTO(
                    f.getTitulo(),
                    f.getFrase(),
                    f.getPersonagem(),
                    f.getPoster());
        } else {
            return null;
        }


    }

}
