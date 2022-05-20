package com.capybara.storeeverythinggamma.repositories;

import com.capybara.storeeverythinggamma.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
}
