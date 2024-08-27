package org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.impl;

import lombok.RequiredArgsConstructor;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.repositories.ParentRepository;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.ChildService;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.ParentService;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Parent;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParentServiceImpl implements ParentService {

    private final ParentRepository parentRepository;
    private final ChildService childService;

    @Override
    public Parent saveParent(Parent parent) {

        var savedParent = parentRepository.saveAndFlush(parent);

        var savedChildren = childService.saveChildren(parent);

        savedParent.setChildren(savedChildren);

        return savedParent;
    }
}
