package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.AbwesenheitKrankheit;
import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Essensvorschlag;
import ch.zli.m223.punchclock.service.AbwesenheitService;
import ch.zli.m223.punchclock.service.EssenService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Abwesenheit")
public class AbwesenheitController {

    private final AbwesenheitService abwesenheitService;

    public AbwesenheitController(AbwesenheitService abwesenheitService) {
        this.abwesenheitService = abwesenheitService;
    }

    /**
     * Gets all Abwesenheiten
     * @return List of all Abwesenheiten
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AbwesenheitKrankheit> getAllAbwesenheiten() {
        return abwesenheitService.findAll();
    }

    /**
     * Creates Abwesenheit
     * @param abwesenheitKrankheit
     * @return abwesenheitKrankheit
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AbwesenheitKrankheit createAbwesenheit(@Valid @RequestBody AbwesenheitKrankheit abwesenheitKrankheit) {
        return abwesenheitService.createAbwesenheit(abwesenheitKrankheit);
    }

}
