package org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.controllers;

import lombok.RequiredArgsConstructor;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.ParentService;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Parent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DefaultController {

    private final ParentService parentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Parent createParent(@RequestBody Parent parent) {
        return parentService.saveParent(parent);
    }
}
