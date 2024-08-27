package org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.repositories;

import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
}
