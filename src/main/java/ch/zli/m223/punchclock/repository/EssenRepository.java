package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Essensvorschlag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EssenRepository extends JpaRepository<Essensvorschlag, Long> {
}