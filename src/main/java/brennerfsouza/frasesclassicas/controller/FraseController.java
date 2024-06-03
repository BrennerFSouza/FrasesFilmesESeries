package brennerfsouza.frasesclassicas.controller;

import brennerfsouza.frasesclassicas.dto.FraseDTO;
import brennerfsouza.frasesclassicas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO getRandomPhrase() {
        return service.getRandomPhrase();
    }


}
