package com.capybara.storeeverythinggamma.controller;

import com.capybara.storeeverythinggamma.model.Note;
import com.capybara.storeeverythinggamma.service.CategoryService;
import com.capybara.storeeverythinggamma.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/notes")
    public String getNotes(Model model) {
        model.addAttribute("notes", noteService.getNotes());
        model.addAttribute("categories", categoryService.getCategories());
        return "notes";
    }

    @GetMapping("/onenote")
    @ResponseBody
    public Optional<Note> getNoteById(Integer id, Model model) {
        return noteService.getNoteById(id);
    }

    @RequestMapping(value="/save", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String updateNote(Note note){
        noteService.updateNote(note);
        return "redirect:/notes";
    }

    @RequestMapping(value="addNew", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String addNote(Note note) {
        noteService.addNote(note);
        return "redirect:/notes";
    }

    @RequestMapping(value="delete", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
    public String deleteNote(Integer id) {
        noteService.deleteNote(id);
        return "redirect:/notes";
    }
}
