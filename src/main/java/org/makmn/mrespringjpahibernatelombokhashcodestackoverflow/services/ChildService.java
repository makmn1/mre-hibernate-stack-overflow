package org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services;

import java.util.List;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Child;
import org.makmn.mrespringjpahibernatelombokhashcodestackoverflow.services.entities.Parent;

public interface ChildService {

    List<Child> saveChildren(Parent parent);
}
