package org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.repositories;

import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
