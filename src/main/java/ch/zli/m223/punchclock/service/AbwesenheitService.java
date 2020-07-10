package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.AbwesenheitKrankheit;
import ch.zli.m223.punchclock.domain.Essensvorschlag;
import ch.zli.m223.punchclock.repository.AbwesenheitRepository;
import ch.zli.m223.punchclock.repository.EssenRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class AbwesenheitService {

    private final AbwesenheitRepository abwesenheitRepository;

    public AbwesenheitService(AbwesenheitRepository abwesenheitRepository) {
        this.abwesenheitRepository = abwesenheitRepository;
    }

    public AbwesenheitKrankheit createAbwesenheit (AbwesenheitKrankheit abwesenheitKrankheit){
        return abwesenheitRepository.saveAndFlush(abwesenheitKrankheit);
    }

    public List<AbwesenheitKrankheit> findAll() {
        return abwesenheitRepository.findAll();
    }
}