package org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.repositories.ChildRepository;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.ChildService;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Child;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Parent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChildServiceImpl implements ChildService {

    private final ChildRepository childRepository;

    @Override
    public List<Child> saveChildren(Parent parent) {
        for (var child : parent.getChildren()) {
            child.setParent(parent);
        }

        return childRepository.saveAllAndFlush(parent.getChildren());
    }
}
