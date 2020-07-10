package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Essensvorschlag;
import ch.zli.m223.punchclock.service.EssenService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Essensvorschlage")
public class EssenController {

    private final EssenService essenService;

    public EssenController(EssenService essenService) {
        this.essenService = essenService;
    }

    /**
     * Gets all Essensvorschlag
     * @return List Essesnvorschlag
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Essensvorschlag> getAllEssensvor() {
        return essenService.findAll();
    }

    /**
     * Creates Essenvorschlag
     * @param essensvorschlag
     * @return essensvorschlag
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Essensvorschlag createEssensvor(@Valid @RequestBody Essensvorschlag essensvorschlag) {
        return essenService.createEssenvorschlag(essensvorschlag);
    }
}