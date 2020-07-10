package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Essensvorschlag;
import ch.zli.m223.punchclock.repository.EssenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EssenService {
    private final EssenRepository essenRepository;

    public EssenService(EssenRepository essenRepository) {
        this.essenRepository = essenRepository;
    }

    public Essensvorschlag createEssenvorschlag (Essensvorschlag essensvorschlag){
        return essenRepository.saveAndFlush(essensvorschlag);
    }

    public List<Essensvorschlag> findAll() {
        return essenRepository.findAll();
    }
}
