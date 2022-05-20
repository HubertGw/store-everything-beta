package com.capybara.storeeverythinggamma.service;

import com.capybara.storeeverythinggamma.model.Category;
import com.capybara.storeeverythinggamma.model.Note;
import com.capybara.storeeverythinggamma.repositories.CategoryRepository;
import com.capybara.storeeverythinggamma.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategories() {return (List<Category>)categoryRepository.findAll();}

    public List<Note> getNotes() {
        return (List<Note>)noteRepository.findAll();
    }

    public Optional<Note> getNoteById(Integer id) {
        return noteRepository.findById(id);
    }

    public void addNote(Note note) {
        noteRepository.save(note);
    }

    public void updateNote(Note note) {
        noteRepository.save(note);
    }

    public void deleteNote(Integer id) {
        noteRepository.deleteById(id);
    }



}
